package com.greenplatform.dao;

import com.greenplatform.model.TGreenEdEdjsmx;
import com.greenplatform.model.TGreenEdEdjsmxExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TGreenEdEdjsmxMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_green_ed_edjsmx
     *
     * @mbggenerated
     */
    int countByExample(TGreenEdEdjsmxExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_green_ed_edjsmx
     *
     * @mbggenerated
     */
    int deleteByExample(TGreenEdEdjsmxExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_green_ed_edjsmx
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String cLsh);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_green_ed_edjsmx
     *
     * @mbggenerated
     */
    int insert(TGreenEdEdjsmx record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_green_ed_edjsmx
     *
     * @mbggenerated
     */
    int insertSelective(TGreenEdEdjsmx record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_green_ed_edjsmx
     *
     * @mbggenerated
     */
    List<TGreenEdEdjsmx> selectByExample(TGreenEdEdjsmxExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_green_ed_edjsmx
     *
     * @mbggenerated
     */
    TGreenEdEdjsmx selectByPrimaryKey(String cLsh);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_green_ed_edjsmx
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") TGreenEdEdjsmx record, @Param("example") TGreenEdEdjsmxExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_green_ed_edjsmx
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") TGreenEdEdjsmx record, @Param("example") TGreenEdEdjsmxExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_green_ed_edjsmx
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TGreenEdEdjsmx record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_green_ed_edjsmx
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TGreenEdEdjsmx record);
}