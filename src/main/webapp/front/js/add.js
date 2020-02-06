/**
 * Created by Chen on 2016/5/15.
 */
$(function() {
	$("select").select2({
		dropdownCssClass : 'dropdown-inverse'
	});
});

// 判断登录
var isLogin = false;
$.get("/logisticsrepair/user/checkLogin", function(data, status) {
	if (status == 'success') {
		if (data.code == 200) {
			isLogin = true;
			$("#login-button").hide();
		} else {
			location.href = "login.html";
		}
	}
});

$(document).ready(
		function() {

			// 获取维修分类
			$.get("/logisticsrepair/repairCategory/getRepairCategoryList", function(data,
					status) {
				var repairCategoryList = data.response.repairCategoryList;
				// 清空
				$("#categorySelect").empty();
				// 增加
				for (var i = 0; i < repairCategoryList.length; i++) {
					var cur = repairCategoryList[i];
					console.log(cur);
					$("#categorySelect").append(
							"<option  value='" + cur.id + "'>" + cur.name
									+ "</option>");
				}

			});
			
			// 获取getNowUser
			$.get("/logisticsrepair/repairCategory/getNowUser", function(data,
					status) {
				var user = data.response.user;
				var userInfo = data.response.userInfo;
				// 清空
				$("#address").val("");
				$("#phone").val("");
				console.log(userInfo.phone);
				$("#address").val(userInfo.phone);
				$("#phone").val(userInfo.address);

			});
			

		});

$("#save").click(function() {

	var title = document.getElementById('title').value;
	var des = document.getElementById('des').value;
	var phone = document.getElementById('phone').value;
	var address = document.getElementById('address').value;
	var categoryId = document.getElementById('categorySelect').value;
	
	var url="/logisticsrepair/repairOrder/addOrder";
	
	$.get(url, {
		title : title,
		des : des,
		phone : phone,
		address : address,
		categoryId : categoryId
	}, function(data, status) {

		if (status = 'success') {
			// Success!
			var resp = data;
			if (resp.code == 200) {
				alert("操作成功！");
				location.href="index.html";
			} else {
				alert(resp.message.error);
			}
			;

		} else {
			// We reached our target server, but it returned an error

		}

	});

});