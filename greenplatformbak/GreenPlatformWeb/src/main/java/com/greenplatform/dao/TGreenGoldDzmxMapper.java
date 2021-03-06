package com.greenplatform.dao;

import com.greenplatform.model.TGreenGoldDzmx;
import com.greenplatform.model.TGreenGoldDzmxExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TGreenGoldDzmxMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_green_gold_dzmx
     *
     * @mbggenerated
     */
    int countByExample(TGreenGoldDzmxExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_green_gold_dzmx
     *
     * @mbggenerated
     */
    int deleteByExample(TGreenGoldDzmxExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_green_gold_dzmx
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String cLsh);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_green_gold_dzmx
     *
     * @mbggenerated
     */
    int insert(TGreenGoldDzmx record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_green_gold_dzmx
     *
     * @mbggenerated
     */
    int insertSelective(TGreenGoldDzmx record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_green_gold_dzmx
     *
     * @mbggenerated
     */
    List<TGreenGoldDzmx> selectByExample(TGreenGoldDzmxExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_green_gold_dzmx
     *
     * @mbggenerated
     */
    TGreenGoldDzmx selectByPrimaryKey(String cLsh);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_green_gold_dzmx
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") TGreenGoldDzmx record, @Param("example") TGreenGoldDzmxExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_green_gold_dzmx
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") TGreenGoldDzmx record, @Param("example") TGreenGoldDzmxExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_green_gold_dzmx
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TGreenGoldDzmx record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_green_gold_dzmx
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TGreenGoldDzmx record);
}