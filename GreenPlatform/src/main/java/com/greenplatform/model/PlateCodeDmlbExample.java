package com.greenplatform.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PlateCodeDmlbExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table plate_code_dmlb
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table plate_code_dmlb
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table plate_code_dmlb
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plate_code_dmlb
     *
     * @mbggenerated
     */
    public PlateCodeDmlbExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plate_code_dmlb
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plate_code_dmlb
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plate_code_dmlb
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plate_code_dmlb
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plate_code_dmlb
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plate_code_dmlb
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plate_code_dmlb
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plate_code_dmlb
     *
     * @mbggenerated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plate_code_dmlb
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plate_code_dmlb
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table plate_code_dmlb
     *
     * @mbggenerated
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andCDmlbIsNull() {
            addCriterion("c_dmlb is null");
            return (Criteria) this;
        }

        public Criteria andCDmlbIsNotNull() {
            addCriterion("c_dmlb is not null");
            return (Criteria) this;
        }

        public Criteria andCDmlbEqualTo(String value) {
            addCriterion("c_dmlb =", value, "cDmlb");
            return (Criteria) this;
        }

        public Criteria andCDmlbNotEqualTo(String value) {
            addCriterion("c_dmlb <>", value, "cDmlb");
            return (Criteria) this;
        }

        public Criteria andCDmlbGreaterThan(String value) {
            addCriterion("c_dmlb >", value, "cDmlb");
            return (Criteria) this;
        }

        public Criteria andCDmlbGreaterThanOrEqualTo(String value) {
            addCriterion("c_dmlb >=", value, "cDmlb");
            return (Criteria) this;
        }

        public Criteria andCDmlbLessThan(String value) {
            addCriterion("c_dmlb <", value, "cDmlb");
            return (Criteria) this;
        }

        public Criteria andCDmlbLessThanOrEqualTo(String value) {
            addCriterion("c_dmlb <=", value, "cDmlb");
            return (Criteria) this;
        }

        public Criteria andCDmlbLike(String value) {
            addCriterion("c_dmlb like", value, "cDmlb");
            return (Criteria) this;
        }

        public Criteria andCDmlbNotLike(String value) {
            addCriterion("c_dmlb not like", value, "cDmlb");
            return (Criteria) this;
        }

        public Criteria andCDmlbIn(List<String> values) {
            addCriterion("c_dmlb in", values, "cDmlb");
            return (Criteria) this;
        }

        public Criteria andCDmlbNotIn(List<String> values) {
            addCriterion("c_dmlb not in", values, "cDmlb");
            return (Criteria) this;
        }

        public Criteria andCDmlbBetween(String value1, String value2) {
            addCriterion("c_dmlb between", value1, value2, "cDmlb");
            return (Criteria) this;
        }

        public Criteria andCDmlbNotBetween(String value1, String value2) {
            addCriterion("c_dmlb not between", value1, value2, "cDmlb");
            return (Criteria) this;
        }

        public Criteria andCDmlbmcIsNull() {
            addCriterion("c_dmlbmc is null");
            return (Criteria) this;
        }

        public Criteria andCDmlbmcIsNotNull() {
            addCriterion("c_dmlbmc is not null");
            return (Criteria) this;
        }

        public Criteria andCDmlbmcEqualTo(String value) {
            addCriterion("c_dmlbmc =", value, "cDmlbmc");
            return (Criteria) this;
        }

        public Criteria andCDmlbmcNotEqualTo(String value) {
            addCriterion("c_dmlbmc <>", value, "cDmlbmc");
            return (Criteria) this;
        }

        public Criteria andCDmlbmcGreaterThan(String value) {
            addCriterion("c_dmlbmc >", value, "cDmlbmc");
            return (Criteria) this;
        }

        public Criteria andCDmlbmcGreaterThanOrEqualTo(String value) {
            addCriterion("c_dmlbmc >=", value, "cDmlbmc");
            return (Criteria) this;
        }

        public Criteria andCDmlbmcLessThan(String value) {
            addCriterion("c_dmlbmc <", value, "cDmlbmc");
            return (Criteria) this;
        }

        public Criteria andCDmlbmcLessThanOrEqualTo(String value) {
            addCriterion("c_dmlbmc <=", value, "cDmlbmc");
            return (Criteria) this;
        }

        public Criteria andCDmlbmcLike(String value) {
            addCriterion("c_dmlbmc like", value, "cDmlbmc");
            return (Criteria) this;
        }

        public Criteria andCDmlbmcNotLike(String value) {
            addCriterion("c_dmlbmc not like", value, "cDmlbmc");
            return (Criteria) this;
        }

        public Criteria andCDmlbmcIn(List<String> values) {
            addCriterion("c_dmlbmc in", values, "cDmlbmc");
            return (Criteria) this;
        }

        public Criteria andCDmlbmcNotIn(List<String> values) {
            addCriterion("c_dmlbmc not in", values, "cDmlbmc");
            return (Criteria) this;
        }

        public Criteria andCDmlbmcBetween(String value1, String value2) {
            addCriterion("c_dmlbmc between", value1, value2, "cDmlbmc");
            return (Criteria) this;
        }

        public Criteria andCDmlbmcNotBetween(String value1, String value2) {
            addCriterion("c_dmlbmc not between", value1, value2, "cDmlbmc");
            return (Criteria) this;
        }

        public Criteria andCBzIsNull() {
            addCriterion("c_bz is null");
            return (Criteria) this;
        }

        public Criteria andCBzIsNotNull() {
            addCriterion("c_bz is not null");
            return (Criteria) this;
        }

        public Criteria andCBzEqualTo(String value) {
            addCriterion("c_bz =", value, "cBz");
            return (Criteria) this;
        }

        public Criteria andCBzNotEqualTo(String value) {
            addCriterion("c_bz <>", value, "cBz");
            return (Criteria) this;
        }

        public Criteria andCBzGreaterThan(String value) {
            addCriterion("c_bz >", value, "cBz");
            return (Criteria) this;
        }

        public Criteria andCBzGreaterThanOrEqualTo(String value) {
            addCriterion("c_bz >=", value, "cBz");
            return (Criteria) this;
        }

        public Criteria andCBzLessThan(String value) {
            addCriterion("c_bz <", value, "cBz");
            return (Criteria) this;
        }

        public Criteria andCBzLessThanOrEqualTo(String value) {
            addCriterion("c_bz <=", value, "cBz");
            return (Criteria) this;
        }

        public Criteria andCBzLike(String value) {
            addCriterion("c_bz like", value, "cBz");
            return (Criteria) this;
        }

        public Criteria andCBzNotLike(String value) {
            addCriterion("c_bz not like", value, "cBz");
            return (Criteria) this;
        }

        public Criteria andCBzIn(List<String> values) {
            addCriterion("c_bz in", values, "cBz");
            return (Criteria) this;
        }

        public Criteria andCBzNotIn(List<String> values) {
            addCriterion("c_bz not in", values, "cBz");
            return (Criteria) this;
        }

        public Criteria andCBzBetween(String value1, String value2) {
            addCriterion("c_bz between", value1, value2, "cBz");
            return (Criteria) this;
        }

        public Criteria andCBzNotBetween(String value1, String value2) {
            addCriterion("c_bz not between", value1, value2, "cBz");
            return (Criteria) this;
        }

        public Criteria andCZtIsNull() {
            addCriterion("c_zt is null");
            return (Criteria) this;
        }

        public Criteria andCZtIsNotNull() {
            addCriterion("c_zt is not null");
            return (Criteria) this;
        }

        public Criteria andCZtEqualTo(String value) {
            addCriterion("c_zt =", value, "cZt");
            return (Criteria) this;
        }

        public Criteria andCZtNotEqualTo(String value) {
            addCriterion("c_zt <>", value, "cZt");
            return (Criteria) this;
        }

        public Criteria andCZtGreaterThan(String value) {
            addCriterion("c_zt >", value, "cZt");
            return (Criteria) this;
        }

        public Criteria andCZtGreaterThanOrEqualTo(String value) {
            addCriterion("c_zt >=", value, "cZt");
            return (Criteria) this;
        }

        public Criteria andCZtLessThan(String value) {
            addCriterion("c_zt <", value, "cZt");
            return (Criteria) this;
        }

        public Criteria andCZtLessThanOrEqualTo(String value) {
            addCriterion("c_zt <=", value, "cZt");
            return (Criteria) this;
        }

        public Criteria andCZtLike(String value) {
            addCriterion("c_zt like", value, "cZt");
            return (Criteria) this;
        }

        public Criteria andCZtNotLike(String value) {
            addCriterion("c_zt not like", value, "cZt");
            return (Criteria) this;
        }

        public Criteria andCZtIn(List<String> values) {
            addCriterion("c_zt in", values, "cZt");
            return (Criteria) this;
        }

        public Criteria andCZtNotIn(List<String> values) {
            addCriterion("c_zt not in", values, "cZt");
            return (Criteria) this;
        }

        public Criteria andCZtBetween(String value1, String value2) {
            addCriterion("c_zt between", value1, value2, "cZt");
            return (Criteria) this;
        }

        public Criteria andCZtNotBetween(String value1, String value2) {
            addCriterion("c_zt not between", value1, value2, "cZt");
            return (Criteria) this;
        }

        public Criteria andCCjuserIsNull() {
            addCriterion("c_cjuser is null");
            return (Criteria) this;
        }

        public Criteria andCCjuserIsNotNull() {
            addCriterion("c_cjuser is not null");
            return (Criteria) this;
        }

        public Criteria andCCjuserEqualTo(String value) {
            addCriterion("c_cjuser =", value, "cCjuser");
            return (Criteria) this;
        }

        public Criteria andCCjuserNotEqualTo(String value) {
            addCriterion("c_cjuser <>", value, "cCjuser");
            return (Criteria) this;
        }

        public Criteria andCCjuserGreaterThan(String value) {
            addCriterion("c_cjuser >", value, "cCjuser");
            return (Criteria) this;
        }

        public Criteria andCCjuserGreaterThanOrEqualTo(String value) {
            addCriterion("c_cjuser >=", value, "cCjuser");
            return (Criteria) this;
        }

        public Criteria andCCjuserLessThan(String value) {
            addCriterion("c_cjuser <", value, "cCjuser");
            return (Criteria) this;
        }

        public Criteria andCCjuserLessThanOrEqualTo(String value) {
            addCriterion("c_cjuser <=", value, "cCjuser");
            return (Criteria) this;
        }

        public Criteria andCCjuserLike(String value) {
            addCriterion("c_cjuser like", value, "cCjuser");
            return (Criteria) this;
        }

        public Criteria andCCjuserNotLike(String value) {
            addCriterion("c_cjuser not like", value, "cCjuser");
            return (Criteria) this;
        }

        public Criteria andCCjuserIn(List<String> values) {
            addCriterion("c_cjuser in", values, "cCjuser");
            return (Criteria) this;
        }

        public Criteria andCCjuserNotIn(List<String> values) {
            addCriterion("c_cjuser not in", values, "cCjuser");
            return (Criteria) this;
        }

        public Criteria andCCjuserBetween(String value1, String value2) {
            addCriterion("c_cjuser between", value1, value2, "cCjuser");
            return (Criteria) this;
        }

        public Criteria andCCjuserNotBetween(String value1, String value2) {
            addCriterion("c_cjuser not between", value1, value2, "cCjuser");
            return (Criteria) this;
        }

        public Criteria andDCjsjIsNull() {
            addCriterion("d_cjsj is null");
            return (Criteria) this;
        }

        public Criteria andDCjsjIsNotNull() {
            addCriterion("d_cjsj is not null");
            return (Criteria) this;
        }

        public Criteria andDCjsjEqualTo(Date value) {
            addCriterion("d_cjsj =", value, "dCjsj");
            return (Criteria) this;
        }

        public Criteria andDCjsjNotEqualTo(Date value) {
            addCriterion("d_cjsj <>", value, "dCjsj");
            return (Criteria) this;
        }

        public Criteria andDCjsjGreaterThan(Date value) {
            addCriterion("d_cjsj >", value, "dCjsj");
            return (Criteria) this;
        }

        public Criteria andDCjsjGreaterThanOrEqualTo(Date value) {
            addCriterion("d_cjsj >=", value, "dCjsj");
            return (Criteria) this;
        }

        public Criteria andDCjsjLessThan(Date value) {
            addCriterion("d_cjsj <", value, "dCjsj");
            return (Criteria) this;
        }

        public Criteria andDCjsjLessThanOrEqualTo(Date value) {
            addCriterion("d_cjsj <=", value, "dCjsj");
            return (Criteria) this;
        }

        public Criteria andDCjsjIn(List<Date> values) {
            addCriterion("d_cjsj in", values, "dCjsj");
            return (Criteria) this;
        }

        public Criteria andDCjsjNotIn(List<Date> values) {
            addCriterion("d_cjsj not in", values, "dCjsj");
            return (Criteria) this;
        }

        public Criteria andDCjsjBetween(Date value1, Date value2) {
            addCriterion("d_cjsj between", value1, value2, "dCjsj");
            return (Criteria) this;
        }

        public Criteria andDCjsjNotBetween(Date value1, Date value2) {
            addCriterion("d_cjsj not between", value1, value2, "dCjsj");
            return (Criteria) this;
        }

        public Criteria andCXguserIsNull() {
            addCriterion("c_xguser is null");
            return (Criteria) this;
        }

        public Criteria andCXguserIsNotNull() {
            addCriterion("c_xguser is not null");
            return (Criteria) this;
        }

        public Criteria andCXguserEqualTo(String value) {
            addCriterion("c_xguser =", value, "cXguser");
            return (Criteria) this;
        }

        public Criteria andCXguserNotEqualTo(String value) {
            addCriterion("c_xguser <>", value, "cXguser");
            return (Criteria) this;
        }

        public Criteria andCXguserGreaterThan(String value) {
            addCriterion("c_xguser >", value, "cXguser");
            return (Criteria) this;
        }

        public Criteria andCXguserGreaterThanOrEqualTo(String value) {
            addCriterion("c_xguser >=", value, "cXguser");
            return (Criteria) this;
        }

        public Criteria andCXguserLessThan(String value) {
            addCriterion("c_xguser <", value, "cXguser");
            return (Criteria) this;
        }

        public Criteria andCXguserLessThanOrEqualTo(String value) {
            addCriterion("c_xguser <=", value, "cXguser");
            return (Criteria) this;
        }

        public Criteria andCXguserLike(String value) {
            addCriterion("c_xguser like", value, "cXguser");
            return (Criteria) this;
        }

        public Criteria andCXguserNotLike(String value) {
            addCriterion("c_xguser not like", value, "cXguser");
            return (Criteria) this;
        }

        public Criteria andCXguserIn(List<String> values) {
            addCriterion("c_xguser in", values, "cXguser");
            return (Criteria) this;
        }

        public Criteria andCXguserNotIn(List<String> values) {
            addCriterion("c_xguser not in", values, "cXguser");
            return (Criteria) this;
        }

        public Criteria andCXguserBetween(String value1, String value2) {
            addCriterion("c_xguser between", value1, value2, "cXguser");
            return (Criteria) this;
        }

        public Criteria andCXguserNotBetween(String value1, String value2) {
            addCriterion("c_xguser not between", value1, value2, "cXguser");
            return (Criteria) this;
        }

        public Criteria andDXgsjIsNull() {
            addCriterion("d_xgsj is null");
            return (Criteria) this;
        }

        public Criteria andDXgsjIsNotNull() {
            addCriterion("d_xgsj is not null");
            return (Criteria) this;
        }

        public Criteria andDXgsjEqualTo(Date value) {
            addCriterion("d_xgsj =", value, "dXgsj");
            return (Criteria) this;
        }

        public Criteria andDXgsjNotEqualTo(Date value) {
            addCriterion("d_xgsj <>", value, "dXgsj");
            return (Criteria) this;
        }

        public Criteria andDXgsjGreaterThan(Date value) {
            addCriterion("d_xgsj >", value, "dXgsj");
            return (Criteria) this;
        }

        public Criteria andDXgsjGreaterThanOrEqualTo(Date value) {
            addCriterion("d_xgsj >=", value, "dXgsj");
            return (Criteria) this;
        }

        public Criteria andDXgsjLessThan(Date value) {
            addCriterion("d_xgsj <", value, "dXgsj");
            return (Criteria) this;
        }

        public Criteria andDXgsjLessThanOrEqualTo(Date value) {
            addCriterion("d_xgsj <=", value, "dXgsj");
            return (Criteria) this;
        }

        public Criteria andDXgsjIn(List<Date> values) {
            addCriterion("d_xgsj in", values, "dXgsj");
            return (Criteria) this;
        }

        public Criteria andDXgsjNotIn(List<Date> values) {
            addCriterion("d_xgsj not in", values, "dXgsj");
            return (Criteria) this;
        }

        public Criteria andDXgsjBetween(Date value1, Date value2) {
            addCriterion("d_xgsj between", value1, value2, "dXgsj");
            return (Criteria) this;
        }

        public Criteria andDXgsjNotBetween(Date value1, Date value2) {
            addCriterion("d_xgsj not between", value1, value2, "dXgsj");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table plate_code_dmlb
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table plate_code_dmlb
     *
     * @mbggenerated
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}