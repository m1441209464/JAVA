package com.plate.publicmag.model;

import java.io.Serializable;

public class PublicCodeArea implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public_code_area.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public_code_area.area_father
     *
     * @mbggenerated
     */
    private Integer areaFather;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public_code_area.area_code
     *
     * @mbggenerated
     */
    private String areaCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public_code_area.area_name
     *
     * @mbggenerated
     */
    private String areaName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public_code_area.area_fullname
     *
     * @mbggenerated
     */
    private String areaFullname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public_code_area.remark
     *
     * @mbggenerated
     */
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public_code_area.status
     *
     * @mbggenerated
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public_code_area.sort
     *
     * @mbggenerated
     */
    private Integer sort;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table public_code_area
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public_code_area.id
     *
     * @return the value of public_code_area.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public_code_area.id
     *
     * @param id the value for public_code_area.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public_code_area.area_father
     *
     * @return the value of public_code_area.area_father
     *
     * @mbggenerated
     */
    public Integer getAreaFather() {
        return areaFather;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public_code_area.area_father
     *
     * @param areaFather the value for public_code_area.area_father
     *
     * @mbggenerated
     */
    public void setAreaFather(Integer areaFather) {
        this.areaFather = areaFather;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public_code_area.area_code
     *
     * @return the value of public_code_area.area_code
     *
     * @mbggenerated
     */
    public String getAreaCode() {
        return areaCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public_code_area.area_code
     *
     * @param areaCode the value for public_code_area.area_code
     *
     * @mbggenerated
     */
    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode == null ? null : areaCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public_code_area.area_name
     *
     * @return the value of public_code_area.area_name
     *
     * @mbggenerated
     */
    public String getAreaName() {
        return areaName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public_code_area.area_name
     *
     * @param areaName the value for public_code_area.area_name
     *
     * @mbggenerated
     */
    public void setAreaName(String areaName) {
        this.areaName = areaName == null ? null : areaName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public_code_area.area_fullname
     *
     * @return the value of public_code_area.area_fullname
     *
     * @mbggenerated
     */
    public String getAreaFullname() {
        return areaFullname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public_code_area.area_fullname
     *
     * @param areaFullname the value for public_code_area.area_fullname
     *
     * @mbggenerated
     */
    public void setAreaFullname(String areaFullname) {
        this.areaFullname = areaFullname == null ? null : areaFullname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public_code_area.remark
     *
     * @return the value of public_code_area.remark
     *
     * @mbggenerated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public_code_area.remark
     *
     * @param remark the value for public_code_area.remark
     *
     * @mbggenerated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public_code_area.status
     *
     * @return the value of public_code_area.status
     *
     * @mbggenerated
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public_code_area.status
     *
     * @param status the value for public_code_area.status
     *
     * @mbggenerated
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public_code_area.sort
     *
     * @return the value of public_code_area.sort
     *
     * @mbggenerated
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public_code_area.sort
     *
     * @param sort the value for public_code_area.sort
     *
     * @mbggenerated
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public_code_area
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", areaFather=").append(areaFather);
        sb.append(", areaCode=").append(areaCode);
        sb.append(", areaName=").append(areaName);
        sb.append(", areaFullname=").append(areaFullname);
        sb.append(", remark=").append(remark);
        sb.append(", status=").append(status);
        sb.append(", sort=").append(sort);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}