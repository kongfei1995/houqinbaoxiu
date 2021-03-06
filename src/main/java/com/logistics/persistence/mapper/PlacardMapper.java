package com.logistics.persistence.mapper;

import com.logistics.persistence.model.Placard;
import com.logistics.persistence.model.PlacardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PlacardMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_placard
	 * @mbggenerated  Thu May 19 20:23:52 CST 2016
	 */
	int countByExample(PlacardExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_placard
	 * @mbggenerated  Thu May 19 20:23:52 CST 2016
	 */
	int deleteByExample(PlacardExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_placard
	 * @mbggenerated  Thu May 19 20:23:52 CST 2016
	 */
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_placard
	 * @mbggenerated  Thu May 19 20:23:52 CST 2016
	 */
	int insert(Placard record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_placard
	 * @mbggenerated  Thu May 19 20:23:52 CST 2016
	 */
	int insertSelective(Placard record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_placard
	 * @mbggenerated  Thu May 19 20:23:52 CST 2016
	 */
	List<Placard> selectByExample(PlacardExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_placard
	 * @mbggenerated  Thu May 19 20:23:52 CST 2016
	 */
	Placard selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_placard
	 * @mbggenerated  Thu May 19 20:23:52 CST 2016
	 */
	int updateByExampleSelective(@Param("record") Placard record, @Param("example") PlacardExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_placard
	 * @mbggenerated  Thu May 19 20:23:52 CST 2016
	 */
	int updateByExample(@Param("record") Placard record, @Param("example") PlacardExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_placard
	 * @mbggenerated  Thu May 19 20:23:52 CST 2016
	 */
	int updateByPrimaryKeySelective(Placard record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_placard
	 * @mbggenerated  Thu May 19 20:23:52 CST 2016
	 */
	int updateByPrimaryKey(Placard record);
}