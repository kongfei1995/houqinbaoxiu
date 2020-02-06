package com.logistics.persistence.manager;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.logistics.persistence.dao.RepairOrderDao;
import com.logistics.persistence.model.RepairOrder;
import com.logistics.persistence.model.RepairOrderExample;
import com.logistics.persistence.model.RepairOrderExample.Criteria;

import com.logistics.common.Page;
import com.logistics.common.utils.ValidateUtils;
@Component
public class RepairOrderManager extends BaseManager<RepairOrderDao> {
	@Autowired
	private RepairOrderDao repairOrderDao;

	private SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
   	
	@Override
	public RepairOrderDao getDao() {
		return repairOrderDao;
	}

	public List<RepairOrder> getRepairOrderList(Long userId) {
		RepairOrderExample example = new RepairOrderExample();
		if(userId!=null){
			example.createCriteria().andSubmitUserIdEqualTo(userId);
		}
		example.setOrderByClause("create_time desc");
		return repairOrderDao.getMapper().selectByExample(example);
	}
	public List<RepairOrder> queryRepairOrderList(String title,String status, String timeRange, Page page) {
		RepairOrderExample example = new RepairOrderExample();
		Criteria criteria = example.createCriteria();
		if(!ValidateUtils.isNull(title)){
			criteria.andTitleLike("%"+title+"%");
		}
		if(!ValidateUtils.isNull(status)){
			criteria.andStatusEqualTo(Integer.parseInt(status));
		}
		if(ValidateUtils.isInt(timeRange)){
			if(Integer.parseInt(timeRange)==1){
				Calendar calendar = Calendar.getInstance();
				calendar.add(Calendar.DAY_OF_MONTH,-7);
				Date time = calendar.getTime();
//				criteria.andCreateTimeGreaterThan(time);
				criteria.andCreateTimeGreaterThanString(format.format(time));
//				criteria.andCreateTimeBetween(getLastWeekDay(), new Date());
			}
			if(Integer.parseInt(timeRange)==2){
				Calendar calendar = Calendar.getInstance();
				calendar.add(Calendar.MONTH,-1);
				Date time = calendar.getTime();
//				criteria.andCreateTimeGreaterThan(time);
				criteria.andCreateTimeGreaterThanString(format.format(time));
//				criteria.andCreateTimeBetween(getLastMonthDay(), new Date());
			}
		}
		example.setOrderByClause("create_time desc");
		//分页
		page.setTotalCounts(repairOrderDao.getMapper().countByExample(example));
		example.setLimitStart(page.getPageNo());
		example.setLimitEnd(page.getPageSize());
		
		return repairOrderDao.getMapper().selectByExample(example);
	}
	
	

	public int insert(RepairOrder repairOrder) {
		return repairOrderDao.getMapper().insert(repairOrder);
	}

	public RepairOrder getByKey(Long orderId) {
		return repairOrderDao.getMapper().selectByPrimaryKey(orderId);
	}

	public int update(RepairOrder repairOrder) {
		 return repairOrderDao.getMapper().updateByPrimaryKey(repairOrder);
	}

	public int getOrderCount(Integer status) {
		RepairOrderExample example = new RepairOrderExample();
		example.createCriteria().andStatusEqualTo(status);
		return repairOrderDao.getMapper().countByExample(example);
	}
	public int getOrderCount() {
		RepairOrderExample example = new RepairOrderExample();
		return repairOrderDao.getMapper().countByExample(example);
	}

	public List<RepairOrder> getMyTaskOrder(Long usrId) {
		RepairOrderExample example = new RepairOrderExample();
		if(usrId!=null){
			example.createCriteria().andRepairUserIdEqualTo(usrId);
		}
		example.setOrderByClause("create_time desc");
		return repairOrderDao.getMapper().selectByExample(example);
	}

	public void deleteOrder(int orderId) {
		repairOrderDao.getMapper().deleteByPrimaryKey(Long.valueOf(orderId));
		
	}

	
	private Date getLastWeekDay()  {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar c = Calendar.getInstance();
        
        //过去七天
        c.setTime(new Date());
        c.add(Calendar.DATE, - 7);
        Date d = c.getTime();
        String day = format.format(d);
        
        try {
			return format.parse(day);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	
	private Date getLastMonthDay()  {
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar c = Calendar.getInstance();
		
        //过去一月
        c.setTime(new Date());
        c.add(Calendar.MONTH, -1);
        Date m = c.getTime();
        String mon = format.format(m);
//        System.out.println("过去一个月："+mon);
		try {
			return format.parse(mon);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
	
	
	
	
	
}
