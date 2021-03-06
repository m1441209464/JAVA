package com.greenplatform.dao;

import com.greenplatform.model.PlateLog;
import com.greenplatform.model.PlateLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PlateLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plate_log
     *
     * @mbggenerated
     */
    int countByExample(PlateLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plate_log
     *
     * @mbggenerated
     */
    int deleteByExample(PlateLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plate_log
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String cCzrzbh);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plate_log
     *
     * @mbggenerated
     */
    int insert(PlateLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plate_log
     *
     * @mbggenerated
     */
    int insertSelective(PlateLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plate_log
     *
     * @mbggenerated
     */
    List<PlateLog> selectByExample(PlateLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plate_log
     *
     * @mbggenerated
     */
    PlateLog selectByPrimaryKey(String cCzrzbh);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plate_log
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") PlateLog record, @Param("example") PlateLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plate_log
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") PlateLog record, @Param("example") PlateLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plate_log
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(PlateLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plate_log
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(PlateLog record);
}