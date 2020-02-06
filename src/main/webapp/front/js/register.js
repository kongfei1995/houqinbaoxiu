/**
 * Created by Chen on 2016/5/15.
 */

$(function(){
  document.getElementById("register").onclick=function(e){
    e.preventDefault();
    var ac=document.getElementById("inputEmail1").value;
    var pw=document.getElementById("inputPassword1").value;
    var pw2=document.getElementById("confirmPassword1").value;
    var inputPhone=document.getElementById("inputPhone").value;
    var inputAddress=document.getElementById("inputAddress").value;
    console.log(inputPhone+"---"+inputAddress);
    var radio=document.getElementsByName("sex");
    var selectvalue=null;   //  selectvalue为radio中选中的值
   for(var i=0;i<radio.length;i++){
       if(radio[i].checked==true) {
            selectvalue=radio[i].value;
            break;
         }
       }
    if(pw!=pw2){
    	alert("密码与确认密码不一致！");
    	return;
    }
    
    var datas={
      userName:ac,
      password:pw,
      password2:pw2,
      sex:selectvalue ,
      phone:inputPhone,
      address:inputAddress
      
    };
    var req=new XMLHttpRequest();
    req.open('get','/logisticsrepair/user/singIn?'+$.param(datas),true);
    req.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded; charset=UTF-8');
    req.onload=function(){
      if (this.status >= 200 && this.status < 400) {
        // Success!
        var resp = JSON.parse(this.response);
        if(resp.code==200){
          location.assign('login.html');
        }else{
          alert(resp.message.error);
        };

      } else {
        // We reached our target server, but it returned an error

      }
    };
    req.send();
  };
});
