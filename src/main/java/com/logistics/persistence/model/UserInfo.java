package com.logistics.persistence.model;

import java.io.Serializable;
import java.util.Date;

public class UserInfo implements Serializable {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_user_info.id
	 * @mbggenerated  Thu May 19 20:23:52 CST 2016
	 */
	private Long id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_user_info.usr_id
	 * @mbggenerated  Thu May 19 20:23:52 CST 2016
	 */
	private Long usrId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_user_info.true_name
	 * @mbggenerated  Thu May 19 20:23:52 CST 2016
	 */
	private String trueName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_user_info.phone
	 * @mbggenerated  Thu May 19 20:23:52 CST 2016
	 */
	private String phone;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_user_info.address
	 * @mbggenerated  Thu May 19 20:23:52 CST 2016
	 */
	private String address;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_user_info.create_time
	 * @mbggenerated  Thu May 19 20:23:52 CST 2016
	 */
	private Date createTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_user_info.update_time
	 * @mbggenerated  Thu May 19 20:23:52 CST 2016
	 */
	private Date updateTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table t_user_info
	 * @mbggenerated  Thu May 19 20:23:52 CST 2016
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_user_info.id
	 * @return  the value of t_user_info.id
	 * @mbggenerated  Thu May 19 20:23:52 CST 2016
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_user_info.id
	 * @param id  the value for t_user_info.id
	 * @mbggenerated  Thu May 19 20:23:52 CST 2016
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_user_info.usr_id
	 * @return  the value of t_user_info.usr_id
	 * @mbggenerated  Thu May 19 20:23:52 CST 2016
	 */
	public Long getUsrId() {
		return usrId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_user_info.usr_id
	 * @param usrId  the value for t_user_info.usr_id
	 * @mbggenerated  Thu May 19 20:23:52 CST 2016
	 */
	public void setUsrId(Long usrId) {
		this.usrId = usrId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_user_info.true_name
	 * @return  the value of t_user_info.true_name
	 * @mbggenerated  Thu May 19 20:23:52 CST 2016
	 */
	public String getTrueName() {
		return trueName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_user_info.true_name
	 * @param trueName  the value for t_user_info.true_name
	 * @mbggenerated  Thu May 19 20:23:52 CST 2016
	 */
	public void setTrueName(String trueName) {
		this.trueName = trueName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_user_info.phone
	 * @return  the value of t_user_info.phone
	 * @mbggenerated  Thu May 19 20:23:52 CST 2016
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_user_info.phone
	 * @param phone  the value for t_user_info.phone
	 * @mbggenerated  Thu May 19 20:23:52 CST 2016
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_user_info.address
	 * @return  the value of t_user_info.address
	 * @mbggenerated  Thu May 19 20:23:52 CST 2016
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_user_info.address
	 * @param address  the value for t_user_info.address
	 * @mbggenerated  Thu May 19 20:23:52 CST 2016
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_user_info.create_time
	 * @return  the value of t_user_info.create_time
	 * @mbggenerated  Thu May 19 20:23:52 CST 2016
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_user_info.create_time
	 * @param createTime  the value for t_user_info.create_time
	 * @mbggenerated  Thu May 19 20:23:52 CST 2016
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_user_info.update_time
	 * @return  the value of t_user_info.update_time
	 * @mbggenerated  Thu May 19 20:23:52 CST 2016
	 */
	public Date getUpdateTime() {
		return updateTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_user_info.update_time
	 * @param updateTime  the value for t_user_info.update_time
	 * @mbggenerated  Thu May 19 20:23:52 CST 2016
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
}