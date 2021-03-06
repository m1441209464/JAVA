package com.plate.publicmag.dao;

import com.plate.publicmag.model.PublicRole;
import com.plate.publicmag.model.PublicRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PublicRoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public_role
     *
     * @mbggenerated
     */
    int countByExample(PublicRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public_role
     *
     * @mbggenerated
     */
    int deleteByExample(PublicRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public_role
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public_role
     *
     * @mbggenerated
     */
    int insert(PublicRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public_role
     *
     * @mbggenerated
     */
    int insertSelective(PublicRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public_role
     *
     * @mbggenerated
     */
    List<PublicRole> selectByExample(PublicRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public_role
     *
     * @mbggenerated
     */
    PublicRole selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public_role
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") PublicRole record, @Param("example") PublicRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public_role
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") PublicRole record, @Param("example") PublicRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public_role
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(PublicRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public_role
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(PublicRole record);
}