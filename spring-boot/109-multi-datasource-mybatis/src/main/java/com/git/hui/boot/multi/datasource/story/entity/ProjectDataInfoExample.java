package com.git.hui.boot.multi.datasource.story.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProjectDataInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProjectDataInfoExample() {
        oredCriteria = new ArrayList<>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOpenNumberIsNull() {
            addCriterion("open_number is null");
            return (Criteria) this;
        }

        public Criteria andOpenNumberIsNotNull() {
            addCriterion("open_number is not null");
            return (Criteria) this;
        }

        public Criteria andOpenNumberEqualTo(String value) {
            addCriterion("open_number =", value, "openNumber");
            return (Criteria) this;
        }

        public Criteria andOpenNumberNotEqualTo(String value) {
            addCriterion("open_number <>", value, "openNumber");
            return (Criteria) this;
        }

        public Criteria andOpenNumberGreaterThan(String value) {
            addCriterion("open_number >", value, "openNumber");
            return (Criteria) this;
        }

        public Criteria andOpenNumberGreaterThanOrEqualTo(String value) {
            addCriterion("open_number >=", value, "openNumber");
            return (Criteria) this;
        }

        public Criteria andOpenNumberLessThan(String value) {
            addCriterion("open_number <", value, "openNumber");
            return (Criteria) this;
        }

        public Criteria andOpenNumberLessThanOrEqualTo(String value) {
            addCriterion("open_number <=", value, "openNumber");
            return (Criteria) this;
        }

        public Criteria andOpenNumberLike(String value) {
            addCriterion("open_number like", value, "openNumber");
            return (Criteria) this;
        }

        public Criteria andOpenNumberNotLike(String value) {
            addCriterion("open_number not like", value, "openNumber");
            return (Criteria) this;
        }

        public Criteria andOpenNumberIn(List<String> values) {
            addCriterion("open_number in", values, "openNumber");
            return (Criteria) this;
        }

        public Criteria andOpenNumberNotIn(List<String> values) {
            addCriterion("open_number not in", values, "openNumber");
            return (Criteria) this;
        }

        public Criteria andOpenNumberBetween(String value1, String value2) {
            addCriterion("open_number between", value1, value2, "openNumber");
            return (Criteria) this;
        }

        public Criteria andOpenNumberNotBetween(String value1, String value2) {
            addCriterion("open_number not between", value1, value2, "openNumber");
            return (Criteria) this;
        }

        public Criteria andOpenTypeIsNull() {
            addCriterion("open_type is null");
            return (Criteria) this;
        }

        public Criteria andOpenTypeIsNotNull() {
            addCriterion("open_type is not null");
            return (Criteria) this;
        }

        public Criteria andOpenTypeEqualTo(String value) {
            addCriterion("open_type =", value, "openType");
            return (Criteria) this;
        }

        public Criteria andOpenTypeNotEqualTo(String value) {
            addCriterion("open_type <>", value, "openType");
            return (Criteria) this;
        }

        public Criteria andOpenTypeGreaterThan(String value) {
            addCriterion("open_type >", value, "openType");
            return (Criteria) this;
        }

        public Criteria andOpenTypeGreaterThanOrEqualTo(String value) {
            addCriterion("open_type >=", value, "openType");
            return (Criteria) this;
        }

        public Criteria andOpenTypeLessThan(String value) {
            addCriterion("open_type <", value, "openType");
            return (Criteria) this;
        }

        public Criteria andOpenTypeLessThanOrEqualTo(String value) {
            addCriterion("open_type <=", value, "openType");
            return (Criteria) this;
        }

        public Criteria andOpenTypeLike(String value) {
            addCriterion("open_type like", value, "openType");
            return (Criteria) this;
        }

        public Criteria andOpenTypeNotLike(String value) {
            addCriterion("open_type not like", value, "openType");
            return (Criteria) this;
        }

        public Criteria andOpenTypeIn(List<String> values) {
            addCriterion("open_type in", values, "openType");
            return (Criteria) this;
        }

        public Criteria andOpenTypeNotIn(List<String> values) {
            addCriterion("open_type not in", values, "openType");
            return (Criteria) this;
        }

        public Criteria andOpenTypeBetween(String value1, String value2) {
            addCriterion("open_type between", value1, value2, "openType");
            return (Criteria) this;
        }

        public Criteria andOpenTypeNotBetween(String value1, String value2) {
            addCriterion("open_type not between", value1, value2, "openType");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNull() {
            addCriterion("company_name is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNotNull() {
            addCriterion("company_name is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEqualTo(String value) {
            addCriterion("company_name =", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotEqualTo(String value) {
            addCriterion("company_name <>", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThan(String value) {
            addCriterion("company_name >", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("company_name >=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThan(String value) {
            addCriterion("company_name <", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("company_name <=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLike(String value) {
            addCriterion("company_name like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotLike(String value) {
            addCriterion("company_name not like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIn(List<String> values) {
            addCriterion("company_name in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotIn(List<String> values) {
            addCriterion("company_name not in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameBetween(String value1, String value2) {
            addCriterion("company_name between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotBetween(String value1, String value2) {
            addCriterion("company_name not between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andShowNameIsNull() {
            addCriterion("show_name is null");
            return (Criteria) this;
        }

        public Criteria andShowNameIsNotNull() {
            addCriterion("show_name is not null");
            return (Criteria) this;
        }

        public Criteria andShowNameEqualTo(String value) {
            addCriterion("show_name =", value, "showName");
            return (Criteria) this;
        }

        public Criteria andShowNameNotEqualTo(String value) {
            addCriterion("show_name <>", value, "showName");
            return (Criteria) this;
        }

        public Criteria andShowNameGreaterThan(String value) {
            addCriterion("show_name >", value, "showName");
            return (Criteria) this;
        }

        public Criteria andShowNameGreaterThanOrEqualTo(String value) {
            addCriterion("show_name >=", value, "showName");
            return (Criteria) this;
        }

        public Criteria andShowNameLessThan(String value) {
            addCriterion("show_name <", value, "showName");
            return (Criteria) this;
        }

        public Criteria andShowNameLessThanOrEqualTo(String value) {
            addCriterion("show_name <=", value, "showName");
            return (Criteria) this;
        }

        public Criteria andShowNameLike(String value) {
            addCriterion("show_name like", value, "showName");
            return (Criteria) this;
        }

        public Criteria andShowNameNotLike(String value) {
            addCriterion("show_name not like", value, "showName");
            return (Criteria) this;
        }

        public Criteria andShowNameIn(List<String> values) {
            addCriterion("show_name in", values, "showName");
            return (Criteria) this;
        }

        public Criteria andShowNameNotIn(List<String> values) {
            addCriterion("show_name not in", values, "showName");
            return (Criteria) this;
        }

        public Criteria andShowNameBetween(String value1, String value2) {
            addCriterion("show_name between", value1, value2, "showName");
            return (Criteria) this;
        }

        public Criteria andShowNameNotBetween(String value1, String value2) {
            addCriterion("show_name not between", value1, value2, "showName");
            return (Criteria) this;
        }

        public Criteria andPaymentItemIsNull() {
            addCriterion("payment_item is null");
            return (Criteria) this;
        }

        public Criteria andPaymentItemIsNotNull() {
            addCriterion("payment_item is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentItemEqualTo(String value) {
            addCriterion("payment_item =", value, "paymentItem");
            return (Criteria) this;
        }

        public Criteria andPaymentItemNotEqualTo(String value) {
            addCriterion("payment_item <>", value, "paymentItem");
            return (Criteria) this;
        }

        public Criteria andPaymentItemGreaterThan(String value) {
            addCriterion("payment_item >", value, "paymentItem");
            return (Criteria) this;
        }

        public Criteria andPaymentItemGreaterThanOrEqualTo(String value) {
            addCriterion("payment_item >=", value, "paymentItem");
            return (Criteria) this;
        }

        public Criteria andPaymentItemLessThan(String value) {
            addCriterion("payment_item <", value, "paymentItem");
            return (Criteria) this;
        }

        public Criteria andPaymentItemLessThanOrEqualTo(String value) {
            addCriterion("payment_item <=", value, "paymentItem");
            return (Criteria) this;
        }

        public Criteria andPaymentItemLike(String value) {
            addCriterion("payment_item like", value, "paymentItem");
            return (Criteria) this;
        }

        public Criteria andPaymentItemNotLike(String value) {
            addCriterion("payment_item not like", value, "paymentItem");
            return (Criteria) this;
        }

        public Criteria andPaymentItemIn(List<String> values) {
            addCriterion("payment_item in", values, "paymentItem");
            return (Criteria) this;
        }

        public Criteria andPaymentItemNotIn(List<String> values) {
            addCriterion("payment_item not in", values, "paymentItem");
            return (Criteria) this;
        }

        public Criteria andPaymentItemBetween(String value1, String value2) {
            addCriterion("payment_item between", value1, value2, "paymentItem");
            return (Criteria) this;
        }

        public Criteria andPaymentItemNotBetween(String value1, String value2) {
            addCriterion("payment_item not between", value1, value2, "paymentItem");
            return (Criteria) this;
        }

        public Criteria andItemIdIsNull() {
            addCriterion("item_id is null");
            return (Criteria) this;
        }

        public Criteria andItemIdIsNotNull() {
            addCriterion("item_id is not null");
            return (Criteria) this;
        }

        public Criteria andItemIdEqualTo(String value) {
            addCriterion("item_id =", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotEqualTo(String value) {
            addCriterion("item_id <>", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThan(String value) {
            addCriterion("item_id >", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThanOrEqualTo(String value) {
            addCriterion("item_id >=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThan(String value) {
            addCriterion("item_id <", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThanOrEqualTo(String value) {
            addCriterion("item_id <=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLike(String value) {
            addCriterion("item_id like", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotLike(String value) {
            addCriterion("item_id not like", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdIn(List<String> values) {
            addCriterion("item_id in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotIn(List<String> values) {
            addCriterion("item_id not in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdBetween(String value1, String value2) {
            addCriterion("item_id between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotBetween(String value1, String value2) {
            addCriterion("item_id not between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andOrgIdIsNull() {
            addCriterion("org_id is null");
            return (Criteria) this;
        }

        public Criteria andOrgIdIsNotNull() {
            addCriterion("org_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrgIdEqualTo(String value) {
            addCriterion("org_id =", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotEqualTo(String value) {
            addCriterion("org_id <>", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThan(String value) {
            addCriterion("org_id >", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThanOrEqualTo(String value) {
            addCriterion("org_id >=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThan(String value) {
            addCriterion("org_id <", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThanOrEqualTo(String value) {
            addCriterion("org_id <=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLike(String value) {
            addCriterion("org_id like", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotLike(String value) {
            addCriterion("org_id not like", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdIn(List<String> values) {
            addCriterion("org_id in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotIn(List<String> values) {
            addCriterion("org_id not in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdBetween(String value1, String value2) {
            addCriterion("org_id between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotBetween(String value1, String value2) {
            addCriterion("org_id not between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andPaymentNumberIsNull() {
            addCriterion("payment_number is null");
            return (Criteria) this;
        }

        public Criteria andPaymentNumberIsNotNull() {
            addCriterion("payment_number is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentNumberEqualTo(String value) {
            addCriterion("payment_number =", value, "paymentNumber");
            return (Criteria) this;
        }

        public Criteria andPaymentNumberNotEqualTo(String value) {
            addCriterion("payment_number <>", value, "paymentNumber");
            return (Criteria) this;
        }

        public Criteria andPaymentNumberGreaterThan(String value) {
            addCriterion("payment_number >", value, "paymentNumber");
            return (Criteria) this;
        }

        public Criteria andPaymentNumberGreaterThanOrEqualTo(String value) {
            addCriterion("payment_number >=", value, "paymentNumber");
            return (Criteria) this;
        }

        public Criteria andPaymentNumberLessThan(String value) {
            addCriterion("payment_number <", value, "paymentNumber");
            return (Criteria) this;
        }

        public Criteria andPaymentNumberLessThanOrEqualTo(String value) {
            addCriterion("payment_number <=", value, "paymentNumber");
            return (Criteria) this;
        }

        public Criteria andPaymentNumberLike(String value) {
            addCriterion("payment_number like", value, "paymentNumber");
            return (Criteria) this;
        }

        public Criteria andPaymentNumberNotLike(String value) {
            addCriterion("payment_number not like", value, "paymentNumber");
            return (Criteria) this;
        }

        public Criteria andPaymentNumberIn(List<String> values) {
            addCriterion("payment_number in", values, "paymentNumber");
            return (Criteria) this;
        }

        public Criteria andPaymentNumberNotIn(List<String> values) {
            addCriterion("payment_number not in", values, "paymentNumber");
            return (Criteria) this;
        }

        public Criteria andPaymentNumberBetween(String value1, String value2) {
            addCriterion("payment_number between", value1, value2, "paymentNumber");
            return (Criteria) this;
        }

        public Criteria andPaymentNumberNotBetween(String value1, String value2) {
            addCriterion("payment_number not between", value1, value2, "paymentNumber");
            return (Criteria) this;
        }

        public Criteria andPaymentDateIsNull() {
            addCriterion("payment_date is null");
            return (Criteria) this;
        }

        public Criteria andPaymentDateIsNotNull() {
            addCriterion("payment_date is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentDateEqualTo(String value) {
            addCriterion("payment_date =", value, "paymentDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDateNotEqualTo(String value) {
            addCriterion("payment_date <>", value, "paymentDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDateGreaterThan(String value) {
            addCriterion("payment_date >", value, "paymentDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDateGreaterThanOrEqualTo(String value) {
            addCriterion("payment_date >=", value, "paymentDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDateLessThan(String value) {
            addCriterion("payment_date <", value, "paymentDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDateLessThanOrEqualTo(String value) {
            addCriterion("payment_date <=", value, "paymentDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDateLike(String value) {
            addCriterion("payment_date like", value, "paymentDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDateNotLike(String value) {
            addCriterion("payment_date not like", value, "paymentDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDateIn(List<String> values) {
            addCriterion("payment_date in", values, "paymentDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDateNotIn(List<String> values) {
            addCriterion("payment_date not in", values, "paymentDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDateBetween(String value1, String value2) {
            addCriterion("payment_date between", value1, value2, "paymentDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDateNotBetween(String value1, String value2) {
            addCriterion("payment_date not between", value1, value2, "paymentDate");
            return (Criteria) this;
        }

        public Criteria andContractNoIsNull() {
            addCriterion("contract_no is null");
            return (Criteria) this;
        }

        public Criteria andContractNoIsNotNull() {
            addCriterion("contract_no is not null");
            return (Criteria) this;
        }

        public Criteria andContractNoEqualTo(String value) {
            addCriterion("contract_no =", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoNotEqualTo(String value) {
            addCriterion("contract_no <>", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoGreaterThan(String value) {
            addCriterion("contract_no >", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoGreaterThanOrEqualTo(String value) {
            addCriterion("contract_no >=", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoLessThan(String value) {
            addCriterion("contract_no <", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoLessThanOrEqualTo(String value) {
            addCriterion("contract_no <=", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoLike(String value) {
            addCriterion("contract_no like", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoNotLike(String value) {
            addCriterion("contract_no not like", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoIn(List<String> values) {
            addCriterion("contract_no in", values, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoNotIn(List<String> values) {
            addCriterion("contract_no not in", values, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoBetween(String value1, String value2) {
            addCriterion("contract_no between", value1, value2, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoNotBetween(String value1, String value2) {
            addCriterion("contract_no not between", value1, value2, "contractNo");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeIsNull() {
            addCriterion("customer_type is null");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeIsNotNull() {
            addCriterion("customer_type is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeEqualTo(String value) {
            addCriterion("customer_type =", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeNotEqualTo(String value) {
            addCriterion("customer_type <>", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeGreaterThan(String value) {
            addCriterion("customer_type >", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeGreaterThanOrEqualTo(String value) {
            addCriterion("customer_type >=", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeLessThan(String value) {
            addCriterion("customer_type <", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeLessThanOrEqualTo(String value) {
            addCriterion("customer_type <=", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeLike(String value) {
            addCriterion("customer_type like", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeNotLike(String value) {
            addCriterion("customer_type not like", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeIn(List<String> values) {
            addCriterion("customer_type in", values, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeNotIn(List<String> values) {
            addCriterion("customer_type not in", values, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeBetween(String value1, String value2) {
            addCriterion("customer_type between", value1, value2, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeNotBetween(String value1, String value2) {
            addCriterion("customer_type not between", value1, value2, "customerType");
            return (Criteria) this;
        }

        public Criteria andSaleTypeIsNull() {
            addCriterion("sale_type is null");
            return (Criteria) this;
        }

        public Criteria andSaleTypeIsNotNull() {
            addCriterion("sale_type is not null");
            return (Criteria) this;
        }

        public Criteria andSaleTypeEqualTo(String value) {
            addCriterion("sale_type =", value, "saleType");
            return (Criteria) this;
        }

        public Criteria andSaleTypeNotEqualTo(String value) {
            addCriterion("sale_type <>", value, "saleType");
            return (Criteria) this;
        }

        public Criteria andSaleTypeGreaterThan(String value) {
            addCriterion("sale_type >", value, "saleType");
            return (Criteria) this;
        }

        public Criteria andSaleTypeGreaterThanOrEqualTo(String value) {
            addCriterion("sale_type >=", value, "saleType");
            return (Criteria) this;
        }

        public Criteria andSaleTypeLessThan(String value) {
            addCriterion("sale_type <", value, "saleType");
            return (Criteria) this;
        }

        public Criteria andSaleTypeLessThanOrEqualTo(String value) {
            addCriterion("sale_type <=", value, "saleType");
            return (Criteria) this;
        }

        public Criteria andSaleTypeLike(String value) {
            addCriterion("sale_type like", value, "saleType");
            return (Criteria) this;
        }

        public Criteria andSaleTypeNotLike(String value) {
            addCriterion("sale_type not like", value, "saleType");
            return (Criteria) this;
        }

        public Criteria andSaleTypeIn(List<String> values) {
            addCriterion("sale_type in", values, "saleType");
            return (Criteria) this;
        }

        public Criteria andSaleTypeNotIn(List<String> values) {
            addCriterion("sale_type not in", values, "saleType");
            return (Criteria) this;
        }

        public Criteria andSaleTypeBetween(String value1, String value2) {
            addCriterion("sale_type between", value1, value2, "saleType");
            return (Criteria) this;
        }

        public Criteria andSaleTypeNotBetween(String value1, String value2) {
            addCriterion("sale_type not between", value1, value2, "saleType");
            return (Criteria) this;
        }

        public Criteria andXpySaleTypeIsNull() {
            addCriterion("xpy_sale_type is null");
            return (Criteria) this;
        }

        public Criteria andXpySaleTypeIsNotNull() {
            addCriterion("xpy_sale_type is not null");
            return (Criteria) this;
        }

        public Criteria andXpySaleTypeEqualTo(String value) {
            addCriterion("xpy_sale_type =", value, "xpySaleType");
            return (Criteria) this;
        }

        public Criteria andXpySaleTypeNotEqualTo(String value) {
            addCriterion("xpy_sale_type <>", value, "xpySaleType");
            return (Criteria) this;
        }

        public Criteria andXpySaleTypeGreaterThan(String value) {
            addCriterion("xpy_sale_type >", value, "xpySaleType");
            return (Criteria) this;
        }

        public Criteria andXpySaleTypeGreaterThanOrEqualTo(String value) {
            addCriterion("xpy_sale_type >=", value, "xpySaleType");
            return (Criteria) this;
        }

        public Criteria andXpySaleTypeLessThan(String value) {
            addCriterion("xpy_sale_type <", value, "xpySaleType");
            return (Criteria) this;
        }

        public Criteria andXpySaleTypeLessThanOrEqualTo(String value) {
            addCriterion("xpy_sale_type <=", value, "xpySaleType");
            return (Criteria) this;
        }

        public Criteria andXpySaleTypeLike(String value) {
            addCriterion("xpy_sale_type like", value, "xpySaleType");
            return (Criteria) this;
        }

        public Criteria andXpySaleTypeNotLike(String value) {
            addCriterion("xpy_sale_type not like", value, "xpySaleType");
            return (Criteria) this;
        }

        public Criteria andXpySaleTypeIn(List<String> values) {
            addCriterion("xpy_sale_type in", values, "xpySaleType");
            return (Criteria) this;
        }

        public Criteria andXpySaleTypeNotIn(List<String> values) {
            addCriterion("xpy_sale_type not in", values, "xpySaleType");
            return (Criteria) this;
        }

        public Criteria andXpySaleTypeBetween(String value1, String value2) {
            addCriterion("xpy_sale_type between", value1, value2, "xpySaleType");
            return (Criteria) this;
        }

        public Criteria andXpySaleTypeNotBetween(String value1, String value2) {
            addCriterion("xpy_sale_type not between", value1, value2, "xpySaleType");
            return (Criteria) this;
        }

        public Criteria andContractMoneyIsNull() {
            addCriterion("contract_money is null");
            return (Criteria) this;
        }

        public Criteria andContractMoneyIsNotNull() {
            addCriterion("contract_money is not null");
            return (Criteria) this;
        }

        public Criteria andContractMoneyEqualTo(String value) {
            addCriterion("contract_money =", value, "contractMoney");
            return (Criteria) this;
        }

        public Criteria andContractMoneyNotEqualTo(String value) {
            addCriterion("contract_money <>", value, "contractMoney");
            return (Criteria) this;
        }

        public Criteria andContractMoneyGreaterThan(String value) {
            addCriterion("contract_money >", value, "contractMoney");
            return (Criteria) this;
        }

        public Criteria andContractMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("contract_money >=", value, "contractMoney");
            return (Criteria) this;
        }

        public Criteria andContractMoneyLessThan(String value) {
            addCriterion("contract_money <", value, "contractMoney");
            return (Criteria) this;
        }

        public Criteria andContractMoneyLessThanOrEqualTo(String value) {
            addCriterion("contract_money <=", value, "contractMoney");
            return (Criteria) this;
        }

        public Criteria andContractMoneyLike(String value) {
            addCriterion("contract_money like", value, "contractMoney");
            return (Criteria) this;
        }

        public Criteria andContractMoneyNotLike(String value) {
            addCriterion("contract_money not like", value, "contractMoney");
            return (Criteria) this;
        }

        public Criteria andContractMoneyIn(List<String> values) {
            addCriterion("contract_money in", values, "contractMoney");
            return (Criteria) this;
        }

        public Criteria andContractMoneyNotIn(List<String> values) {
            addCriterion("contract_money not in", values, "contractMoney");
            return (Criteria) this;
        }

        public Criteria andContractMoneyBetween(String value1, String value2) {
            addCriterion("contract_money between", value1, value2, "contractMoney");
            return (Criteria) this;
        }

        public Criteria andContractMoneyNotBetween(String value1, String value2) {
            addCriterion("contract_money not between", value1, value2, "contractMoney");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andXpyOpenVersionIsNull() {
            addCriterion("xpy_open_version is null");
            return (Criteria) this;
        }

        public Criteria andXpyOpenVersionIsNotNull() {
            addCriterion("xpy_open_version is not null");
            return (Criteria) this;
        }

        public Criteria andXpyOpenVersionEqualTo(String value) {
            addCriterion("xpy_open_version =", value, "xpyOpenVersion");
            return (Criteria) this;
        }

        public Criteria andXpyOpenVersionNotEqualTo(String value) {
            addCriterion("xpy_open_version <>", value, "xpyOpenVersion");
            return (Criteria) this;
        }

        public Criteria andXpyOpenVersionGreaterThan(String value) {
            addCriterion("xpy_open_version >", value, "xpyOpenVersion");
            return (Criteria) this;
        }

        public Criteria andXpyOpenVersionGreaterThanOrEqualTo(String value) {
            addCriterion("xpy_open_version >=", value, "xpyOpenVersion");
            return (Criteria) this;
        }

        public Criteria andXpyOpenVersionLessThan(String value) {
            addCriterion("xpy_open_version <", value, "xpyOpenVersion");
            return (Criteria) this;
        }

        public Criteria andXpyOpenVersionLessThanOrEqualTo(String value) {
            addCriterion("xpy_open_version <=", value, "xpyOpenVersion");
            return (Criteria) this;
        }

        public Criteria andXpyOpenVersionLike(String value) {
            addCriterion("xpy_open_version like", value, "xpyOpenVersion");
            return (Criteria) this;
        }

        public Criteria andXpyOpenVersionNotLike(String value) {
            addCriterion("xpy_open_version not like", value, "xpyOpenVersion");
            return (Criteria) this;
        }

        public Criteria andXpyOpenVersionIn(List<String> values) {
            addCriterion("xpy_open_version in", values, "xpyOpenVersion");
            return (Criteria) this;
        }

        public Criteria andXpyOpenVersionNotIn(List<String> values) {
            addCriterion("xpy_open_version not in", values, "xpyOpenVersion");
            return (Criteria) this;
        }

        public Criteria andXpyOpenVersionBetween(String value1, String value2) {
            addCriterion("xpy_open_version between", value1, value2, "xpyOpenVersion");
            return (Criteria) this;
        }

        public Criteria andXpyOpenVersionNotBetween(String value1, String value2) {
            addCriterion("xpy_open_version not between", value1, value2, "xpyOpenVersion");
            return (Criteria) this;
        }

        public Criteria andVersionRemarkIsNull() {
            addCriterion("version_remark is null");
            return (Criteria) this;
        }

        public Criteria andVersionRemarkIsNotNull() {
            addCriterion("version_remark is not null");
            return (Criteria) this;
        }

        public Criteria andVersionRemarkEqualTo(String value) {
            addCriterion("version_remark =", value, "versionRemark");
            return (Criteria) this;
        }

        public Criteria andVersionRemarkNotEqualTo(String value) {
            addCriterion("version_remark <>", value, "versionRemark");
            return (Criteria) this;
        }

        public Criteria andVersionRemarkGreaterThan(String value) {
            addCriterion("version_remark >", value, "versionRemark");
            return (Criteria) this;
        }

        public Criteria andVersionRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("version_remark >=", value, "versionRemark");
            return (Criteria) this;
        }

        public Criteria andVersionRemarkLessThan(String value) {
            addCriterion("version_remark <", value, "versionRemark");
            return (Criteria) this;
        }

        public Criteria andVersionRemarkLessThanOrEqualTo(String value) {
            addCriterion("version_remark <=", value, "versionRemark");
            return (Criteria) this;
        }

        public Criteria andVersionRemarkLike(String value) {
            addCriterion("version_remark like", value, "versionRemark");
            return (Criteria) this;
        }

        public Criteria andVersionRemarkNotLike(String value) {
            addCriterion("version_remark not like", value, "versionRemark");
            return (Criteria) this;
        }

        public Criteria andVersionRemarkIn(List<String> values) {
            addCriterion("version_remark in", values, "versionRemark");
            return (Criteria) this;
        }

        public Criteria andVersionRemarkNotIn(List<String> values) {
            addCriterion("version_remark not in", values, "versionRemark");
            return (Criteria) this;
        }

        public Criteria andVersionRemarkBetween(String value1, String value2) {
            addCriterion("version_remark between", value1, value2, "versionRemark");
            return (Criteria) this;
        }

        public Criteria andVersionRemarkNotBetween(String value1, String value2) {
            addCriterion("version_remark not between", value1, value2, "versionRemark");
            return (Criteria) this;
        }

        public Criteria andXpyCustomerManagerIsNull() {
            addCriterion("xpy_customer_manager is null");
            return (Criteria) this;
        }

        public Criteria andXpyCustomerManagerIsNotNull() {
            addCriterion("xpy_customer_manager is not null");
            return (Criteria) this;
        }

        public Criteria andXpyCustomerManagerEqualTo(String value) {
            addCriterion("xpy_customer_manager =", value, "xpyCustomerManager");
            return (Criteria) this;
        }

        public Criteria andXpyCustomerManagerNotEqualTo(String value) {
            addCriterion("xpy_customer_manager <>", value, "xpyCustomerManager");
            return (Criteria) this;
        }

        public Criteria andXpyCustomerManagerGreaterThan(String value) {
            addCriterion("xpy_customer_manager >", value, "xpyCustomerManager");
            return (Criteria) this;
        }

        public Criteria andXpyCustomerManagerGreaterThanOrEqualTo(String value) {
            addCriterion("xpy_customer_manager >=", value, "xpyCustomerManager");
            return (Criteria) this;
        }

        public Criteria andXpyCustomerManagerLessThan(String value) {
            addCriterion("xpy_customer_manager <", value, "xpyCustomerManager");
            return (Criteria) this;
        }

        public Criteria andXpyCustomerManagerLessThanOrEqualTo(String value) {
            addCriterion("xpy_customer_manager <=", value, "xpyCustomerManager");
            return (Criteria) this;
        }

        public Criteria andXpyCustomerManagerLike(String value) {
            addCriterion("xpy_customer_manager like", value, "xpyCustomerManager");
            return (Criteria) this;
        }

        public Criteria andXpyCustomerManagerNotLike(String value) {
            addCriterion("xpy_customer_manager not like", value, "xpyCustomerManager");
            return (Criteria) this;
        }

        public Criteria andXpyCustomerManagerIn(List<String> values) {
            addCriterion("xpy_customer_manager in", values, "xpyCustomerManager");
            return (Criteria) this;
        }

        public Criteria andXpyCustomerManagerNotIn(List<String> values) {
            addCriterion("xpy_customer_manager not in", values, "xpyCustomerManager");
            return (Criteria) this;
        }

        public Criteria andXpyCustomerManagerBetween(String value1, String value2) {
            addCriterion("xpy_customer_manager between", value1, value2, "xpyCustomerManager");
            return (Criteria) this;
        }

        public Criteria andXpyCustomerManagerNotBetween(String value1, String value2) {
            addCriterion("xpy_customer_manager not between", value1, value2, "xpyCustomerManager");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerPhoneIsNull() {
            addCriterion("customer_manager_phone is null");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerPhoneIsNotNull() {
            addCriterion("customer_manager_phone is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerPhoneEqualTo(String value) {
            addCriterion("customer_manager_phone =", value, "customerManagerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerPhoneNotEqualTo(String value) {
            addCriterion("customer_manager_phone <>", value, "customerManagerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerPhoneGreaterThan(String value) {
            addCriterion("customer_manager_phone >", value, "customerManagerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("customer_manager_phone >=", value, "customerManagerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerPhoneLessThan(String value) {
            addCriterion("customer_manager_phone <", value, "customerManagerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerPhoneLessThanOrEqualTo(String value) {
            addCriterion("customer_manager_phone <=", value, "customerManagerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerPhoneLike(String value) {
            addCriterion("customer_manager_phone like", value, "customerManagerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerPhoneNotLike(String value) {
            addCriterion("customer_manager_phone not like", value, "customerManagerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerPhoneIn(List<String> values) {
            addCriterion("customer_manager_phone in", values, "customerManagerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerPhoneNotIn(List<String> values) {
            addCriterion("customer_manager_phone not in", values, "customerManagerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerPhoneBetween(String value1, String value2) {
            addCriterion("customer_manager_phone between", value1, value2, "customerManagerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerPhoneNotBetween(String value1, String value2) {
            addCriterion("customer_manager_phone not between", value1, value2, "customerManagerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerMailIsNull() {
            addCriterion("customer_manager_mail is null");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerMailIsNotNull() {
            addCriterion("customer_manager_mail is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerMailEqualTo(String value) {
            addCriterion("customer_manager_mail =", value, "customerManagerMail");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerMailNotEqualTo(String value) {
            addCriterion("customer_manager_mail <>", value, "customerManagerMail");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerMailGreaterThan(String value) {
            addCriterion("customer_manager_mail >", value, "customerManagerMail");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerMailGreaterThanOrEqualTo(String value) {
            addCriterion("customer_manager_mail >=", value, "customerManagerMail");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerMailLessThan(String value) {
            addCriterion("customer_manager_mail <", value, "customerManagerMail");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerMailLessThanOrEqualTo(String value) {
            addCriterion("customer_manager_mail <=", value, "customerManagerMail");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerMailLike(String value) {
            addCriterion("customer_manager_mail like", value, "customerManagerMail");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerMailNotLike(String value) {
            addCriterion("customer_manager_mail not like", value, "customerManagerMail");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerMailIn(List<String> values) {
            addCriterion("customer_manager_mail in", values, "customerManagerMail");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerMailNotIn(List<String> values) {
            addCriterion("customer_manager_mail not in", values, "customerManagerMail");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerMailBetween(String value1, String value2) {
            addCriterion("customer_manager_mail between", value1, value2, "customerManagerMail");
            return (Criteria) this;
        }

        public Criteria andCustomerManagerMailNotBetween(String value1, String value2) {
            addCriterion("customer_manager_mail not between", value1, value2, "customerManagerMail");
            return (Criteria) this;
        }

        public Criteria andAccountCountIsNull() {
            addCriterion("account_count is null");
            return (Criteria) this;
        }

        public Criteria andAccountCountIsNotNull() {
            addCriterion("account_count is not null");
            return (Criteria) this;
        }

        public Criteria andAccountCountEqualTo(String value) {
            addCriterion("account_count =", value, "accountCount");
            return (Criteria) this;
        }

        public Criteria andAccountCountNotEqualTo(String value) {
            addCriterion("account_count <>", value, "accountCount");
            return (Criteria) this;
        }

        public Criteria andAccountCountGreaterThan(String value) {
            addCriterion("account_count >", value, "accountCount");
            return (Criteria) this;
        }

        public Criteria andAccountCountGreaterThanOrEqualTo(String value) {
            addCriterion("account_count >=", value, "accountCount");
            return (Criteria) this;
        }

        public Criteria andAccountCountLessThan(String value) {
            addCriterion("account_count <", value, "accountCount");
            return (Criteria) this;
        }

        public Criteria andAccountCountLessThanOrEqualTo(String value) {
            addCriterion("account_count <=", value, "accountCount");
            return (Criteria) this;
        }

        public Criteria andAccountCountLike(String value) {
            addCriterion("account_count like", value, "accountCount");
            return (Criteria) this;
        }

        public Criteria andAccountCountNotLike(String value) {
            addCriterion("account_count not like", value, "accountCount");
            return (Criteria) this;
        }

        public Criteria andAccountCountIn(List<String> values) {
            addCriterion("account_count in", values, "accountCount");
            return (Criteria) this;
        }

        public Criteria andAccountCountNotIn(List<String> values) {
            addCriterion("account_count not in", values, "accountCount");
            return (Criteria) this;
        }

        public Criteria andAccountCountBetween(String value1, String value2) {
            addCriterion("account_count between", value1, value2, "accountCount");
            return (Criteria) this;
        }

        public Criteria andAccountCountNotBetween(String value1, String value2) {
            addCriterion("account_count not between", value1, value2, "accountCount");
            return (Criteria) this;
        }

        public Criteria andXpyOpenDateIsNull() {
            addCriterion("xpy_open_date is null");
            return (Criteria) this;
        }

        public Criteria andXpyOpenDateIsNotNull() {
            addCriterion("xpy_open_date is not null");
            return (Criteria) this;
        }

        public Criteria andXpyOpenDateEqualTo(String value) {
            addCriterion("xpy_open_date =", value, "xpyOpenDate");
            return (Criteria) this;
        }

        public Criteria andXpyOpenDateNotEqualTo(String value) {
            addCriterion("xpy_open_date <>", value, "xpyOpenDate");
            return (Criteria) this;
        }

        public Criteria andXpyOpenDateGreaterThan(String value) {
            addCriterion("xpy_open_date >", value, "xpyOpenDate");
            return (Criteria) this;
        }

        public Criteria andXpyOpenDateGreaterThanOrEqualTo(String value) {
            addCriterion("xpy_open_date >=", value, "xpyOpenDate");
            return (Criteria) this;
        }

        public Criteria andXpyOpenDateLessThan(String value) {
            addCriterion("xpy_open_date <", value, "xpyOpenDate");
            return (Criteria) this;
        }

        public Criteria andXpyOpenDateLessThanOrEqualTo(String value) {
            addCriterion("xpy_open_date <=", value, "xpyOpenDate");
            return (Criteria) this;
        }

        public Criteria andXpyOpenDateLike(String value) {
            addCriterion("xpy_open_date like", value, "xpyOpenDate");
            return (Criteria) this;
        }

        public Criteria andXpyOpenDateNotLike(String value) {
            addCriterion("xpy_open_date not like", value, "xpyOpenDate");
            return (Criteria) this;
        }

        public Criteria andXpyOpenDateIn(List<String> values) {
            addCriterion("xpy_open_date in", values, "xpyOpenDate");
            return (Criteria) this;
        }

        public Criteria andXpyOpenDateNotIn(List<String> values) {
            addCriterion("xpy_open_date not in", values, "xpyOpenDate");
            return (Criteria) this;
        }

        public Criteria andXpyOpenDateBetween(String value1, String value2) {
            addCriterion("xpy_open_date between", value1, value2, "xpyOpenDate");
            return (Criteria) this;
        }

        public Criteria andXpyOpenDateNotBetween(String value1, String value2) {
            addCriterion("xpy_open_date not between", value1, value2, "xpyOpenDate");
            return (Criteria) this;
        }

        public Criteria andXpyCloseDateIsNull() {
            addCriterion("xpy_close_date is null");
            return (Criteria) this;
        }

        public Criteria andXpyCloseDateIsNotNull() {
            addCriterion("xpy_close_date is not null");
            return (Criteria) this;
        }

        public Criteria andXpyCloseDateEqualTo(String value) {
            addCriterion("xpy_close_date =", value, "xpyCloseDate");
            return (Criteria) this;
        }

        public Criteria andXpyCloseDateNotEqualTo(String value) {
            addCriterion("xpy_close_date <>", value, "xpyCloseDate");
            return (Criteria) this;
        }

        public Criteria andXpyCloseDateGreaterThan(String value) {
            addCriterion("xpy_close_date >", value, "xpyCloseDate");
            return (Criteria) this;
        }

        public Criteria andXpyCloseDateGreaterThanOrEqualTo(String value) {
            addCriterion("xpy_close_date >=", value, "xpyCloseDate");
            return (Criteria) this;
        }

        public Criteria andXpyCloseDateLessThan(String value) {
            addCriterion("xpy_close_date <", value, "xpyCloseDate");
            return (Criteria) this;
        }

        public Criteria andXpyCloseDateLessThanOrEqualTo(String value) {
            addCriterion("xpy_close_date <=", value, "xpyCloseDate");
            return (Criteria) this;
        }

        public Criteria andXpyCloseDateLike(String value) {
            addCriterion("xpy_close_date like", value, "xpyCloseDate");
            return (Criteria) this;
        }

        public Criteria andXpyCloseDateNotLike(String value) {
            addCriterion("xpy_close_date not like", value, "xpyCloseDate");
            return (Criteria) this;
        }

        public Criteria andXpyCloseDateIn(List<String> values) {
            addCriterion("xpy_close_date in", values, "xpyCloseDate");
            return (Criteria) this;
        }

        public Criteria andXpyCloseDateNotIn(List<String> values) {
            addCriterion("xpy_close_date not in", values, "xpyCloseDate");
            return (Criteria) this;
        }

        public Criteria andXpyCloseDateBetween(String value1, String value2) {
            addCriterion("xpy_close_date between", value1, value2, "xpyCloseDate");
            return (Criteria) this;
        }

        public Criteria andXpyCloseDateNotBetween(String value1, String value2) {
            addCriterion("xpy_close_date not between", value1, value2, "xpyCloseDate");
            return (Criteria) this;
        }

        public Criteria andXpyPurchaseTimeMonthIsNull() {
            addCriterion("xpy_purchase_time_month is null");
            return (Criteria) this;
        }

        public Criteria andXpyPurchaseTimeMonthIsNotNull() {
            addCriterion("xpy_purchase_time_month is not null");
            return (Criteria) this;
        }

        public Criteria andXpyPurchaseTimeMonthEqualTo(String value) {
            addCriterion("xpy_purchase_time_month =", value, "xpyPurchaseTimeMonth");
            return (Criteria) this;
        }

        public Criteria andXpyPurchaseTimeMonthNotEqualTo(String value) {
            addCriterion("xpy_purchase_time_month <>", value, "xpyPurchaseTimeMonth");
            return (Criteria) this;
        }

        public Criteria andXpyPurchaseTimeMonthGreaterThan(String value) {
            addCriterion("xpy_purchase_time_month >", value, "xpyPurchaseTimeMonth");
            return (Criteria) this;
        }

        public Criteria andXpyPurchaseTimeMonthGreaterThanOrEqualTo(String value) {
            addCriterion("xpy_purchase_time_month >=", value, "xpyPurchaseTimeMonth");
            return (Criteria) this;
        }

        public Criteria andXpyPurchaseTimeMonthLessThan(String value) {
            addCriterion("xpy_purchase_time_month <", value, "xpyPurchaseTimeMonth");
            return (Criteria) this;
        }

        public Criteria andXpyPurchaseTimeMonthLessThanOrEqualTo(String value) {
            addCriterion("xpy_purchase_time_month <=", value, "xpyPurchaseTimeMonth");
            return (Criteria) this;
        }

        public Criteria andXpyPurchaseTimeMonthLike(String value) {
            addCriterion("xpy_purchase_time_month like", value, "xpyPurchaseTimeMonth");
            return (Criteria) this;
        }

        public Criteria andXpyPurchaseTimeMonthNotLike(String value) {
            addCriterion("xpy_purchase_time_month not like", value, "xpyPurchaseTimeMonth");
            return (Criteria) this;
        }

        public Criteria andXpyPurchaseTimeMonthIn(List<String> values) {
            addCriterion("xpy_purchase_time_month in", values, "xpyPurchaseTimeMonth");
            return (Criteria) this;
        }

        public Criteria andXpyPurchaseTimeMonthNotIn(List<String> values) {
            addCriterion("xpy_purchase_time_month not in", values, "xpyPurchaseTimeMonth");
            return (Criteria) this;
        }

        public Criteria andXpyPurchaseTimeMonthBetween(String value1, String value2) {
            addCriterion("xpy_purchase_time_month between", value1, value2, "xpyPurchaseTimeMonth");
            return (Criteria) this;
        }

        public Criteria andXpyPurchaseTimeMonthNotBetween(String value1, String value2) {
            addCriterion("xpy_purchase_time_month not between", value1, value2, "xpyPurchaseTimeMonth");
            return (Criteria) this;
        }

        public Criteria andSaleXpyGiftTimeMonthIsNull() {
            addCriterion("sale_xpy_gift_time_month is null");
            return (Criteria) this;
        }

        public Criteria andSaleXpyGiftTimeMonthIsNotNull() {
            addCriterion("sale_xpy_gift_time_month is not null");
            return (Criteria) this;
        }

        public Criteria andSaleXpyGiftTimeMonthEqualTo(String value) {
            addCriterion("sale_xpy_gift_time_month =", value, "saleXpyGiftTimeMonth");
            return (Criteria) this;
        }

        public Criteria andSaleXpyGiftTimeMonthNotEqualTo(String value) {
            addCriterion("sale_xpy_gift_time_month <>", value, "saleXpyGiftTimeMonth");
            return (Criteria) this;
        }

        public Criteria andSaleXpyGiftTimeMonthGreaterThan(String value) {
            addCriterion("sale_xpy_gift_time_month >", value, "saleXpyGiftTimeMonth");
            return (Criteria) this;
        }

        public Criteria andSaleXpyGiftTimeMonthGreaterThanOrEqualTo(String value) {
            addCriterion("sale_xpy_gift_time_month >=", value, "saleXpyGiftTimeMonth");
            return (Criteria) this;
        }

        public Criteria andSaleXpyGiftTimeMonthLessThan(String value) {
            addCriterion("sale_xpy_gift_time_month <", value, "saleXpyGiftTimeMonth");
            return (Criteria) this;
        }

        public Criteria andSaleXpyGiftTimeMonthLessThanOrEqualTo(String value) {
            addCriterion("sale_xpy_gift_time_month <=", value, "saleXpyGiftTimeMonth");
            return (Criteria) this;
        }

        public Criteria andSaleXpyGiftTimeMonthLike(String value) {
            addCriterion("sale_xpy_gift_time_month like", value, "saleXpyGiftTimeMonth");
            return (Criteria) this;
        }

        public Criteria andSaleXpyGiftTimeMonthNotLike(String value) {
            addCriterion("sale_xpy_gift_time_month not like", value, "saleXpyGiftTimeMonth");
            return (Criteria) this;
        }

        public Criteria andSaleXpyGiftTimeMonthIn(List<String> values) {
            addCriterion("sale_xpy_gift_time_month in", values, "saleXpyGiftTimeMonth");
            return (Criteria) this;
        }

        public Criteria andSaleXpyGiftTimeMonthNotIn(List<String> values) {
            addCriterion("sale_xpy_gift_time_month not in", values, "saleXpyGiftTimeMonth");
            return (Criteria) this;
        }

        public Criteria andSaleXpyGiftTimeMonthBetween(String value1, String value2) {
            addCriterion("sale_xpy_gift_time_month between", value1, value2, "saleXpyGiftTimeMonth");
            return (Criteria) this;
        }

        public Criteria andSaleXpyGiftTimeMonthNotBetween(String value1, String value2) {
            addCriterion("sale_xpy_gift_time_month not between", value1, value2, "saleXpyGiftTimeMonth");
            return (Criteria) this;
        }

        public Criteria andOperateXpyGiftTimeMonthIsNull() {
            addCriterion("operate_xpy_gift_time_month is null");
            return (Criteria) this;
        }

        public Criteria andOperateXpyGiftTimeMonthIsNotNull() {
            addCriterion("operate_xpy_gift_time_month is not null");
            return (Criteria) this;
        }

        public Criteria andOperateXpyGiftTimeMonthEqualTo(String value) {
            addCriterion("operate_xpy_gift_time_month =", value, "operateXpyGiftTimeMonth");
            return (Criteria) this;
        }

        public Criteria andOperateXpyGiftTimeMonthNotEqualTo(String value) {
            addCriterion("operate_xpy_gift_time_month <>", value, "operateXpyGiftTimeMonth");
            return (Criteria) this;
        }

        public Criteria andOperateXpyGiftTimeMonthGreaterThan(String value) {
            addCriterion("operate_xpy_gift_time_month >", value, "operateXpyGiftTimeMonth");
            return (Criteria) this;
        }

        public Criteria andOperateXpyGiftTimeMonthGreaterThanOrEqualTo(String value) {
            addCriterion("operate_xpy_gift_time_month >=", value, "operateXpyGiftTimeMonth");
            return (Criteria) this;
        }

        public Criteria andOperateXpyGiftTimeMonthLessThan(String value) {
            addCriterion("operate_xpy_gift_time_month <", value, "operateXpyGiftTimeMonth");
            return (Criteria) this;
        }

        public Criteria andOperateXpyGiftTimeMonthLessThanOrEqualTo(String value) {
            addCriterion("operate_xpy_gift_time_month <=", value, "operateXpyGiftTimeMonth");
            return (Criteria) this;
        }

        public Criteria andOperateXpyGiftTimeMonthLike(String value) {
            addCriterion("operate_xpy_gift_time_month like", value, "operateXpyGiftTimeMonth");
            return (Criteria) this;
        }

        public Criteria andOperateXpyGiftTimeMonthNotLike(String value) {
            addCriterion("operate_xpy_gift_time_month not like", value, "operateXpyGiftTimeMonth");
            return (Criteria) this;
        }

        public Criteria andOperateXpyGiftTimeMonthIn(List<String> values) {
            addCriterion("operate_xpy_gift_time_month in", values, "operateXpyGiftTimeMonth");
            return (Criteria) this;
        }

        public Criteria andOperateXpyGiftTimeMonthNotIn(List<String> values) {
            addCriterion("operate_xpy_gift_time_month not in", values, "operateXpyGiftTimeMonth");
            return (Criteria) this;
        }

        public Criteria andOperateXpyGiftTimeMonthBetween(String value1, String value2) {
            addCriterion("operate_xpy_gift_time_month between", value1, value2, "operateXpyGiftTimeMonth");
            return (Criteria) this;
        }

        public Criteria andOperateXpyGiftTimeMonthNotBetween(String value1, String value2) {
            addCriterion("operate_xpy_gift_time_month not between", value1, value2, "operateXpyGiftTimeMonth");
            return (Criteria) this;
        }

        public Criteria andXpyUseTimeMonthIsNull() {
            addCriterion("xpy_use_time_month is null");
            return (Criteria) this;
        }

        public Criteria andXpyUseTimeMonthIsNotNull() {
            addCriterion("xpy_use_time_month is not null");
            return (Criteria) this;
        }

        public Criteria andXpyUseTimeMonthEqualTo(String value) {
            addCriterion("xpy_use_time_month =", value, "xpyUseTimeMonth");
            return (Criteria) this;
        }

        public Criteria andXpyUseTimeMonthNotEqualTo(String value) {
            addCriterion("xpy_use_time_month <>", value, "xpyUseTimeMonth");
            return (Criteria) this;
        }

        public Criteria andXpyUseTimeMonthGreaterThan(String value) {
            addCriterion("xpy_use_time_month >", value, "xpyUseTimeMonth");
            return (Criteria) this;
        }

        public Criteria andXpyUseTimeMonthGreaterThanOrEqualTo(String value) {
            addCriterion("xpy_use_time_month >=", value, "xpyUseTimeMonth");
            return (Criteria) this;
        }

        public Criteria andXpyUseTimeMonthLessThan(String value) {
            addCriterion("xpy_use_time_month <", value, "xpyUseTimeMonth");
            return (Criteria) this;
        }

        public Criteria andXpyUseTimeMonthLessThanOrEqualTo(String value) {
            addCriterion("xpy_use_time_month <=", value, "xpyUseTimeMonth");
            return (Criteria) this;
        }

        public Criteria andXpyUseTimeMonthLike(String value) {
            addCriterion("xpy_use_time_month like", value, "xpyUseTimeMonth");
            return (Criteria) this;
        }

        public Criteria andXpyUseTimeMonthNotLike(String value) {
            addCriterion("xpy_use_time_month not like", value, "xpyUseTimeMonth");
            return (Criteria) this;
        }

        public Criteria andXpyUseTimeMonthIn(List<String> values) {
            addCriterion("xpy_use_time_month in", values, "xpyUseTimeMonth");
            return (Criteria) this;
        }

        public Criteria andXpyUseTimeMonthNotIn(List<String> values) {
            addCriterion("xpy_use_time_month not in", values, "xpyUseTimeMonth");
            return (Criteria) this;
        }

        public Criteria andXpyUseTimeMonthBetween(String value1, String value2) {
            addCriterion("xpy_use_time_month between", value1, value2, "xpyUseTimeMonth");
            return (Criteria) this;
        }

        public Criteria andXpyUseTimeMonthNotBetween(String value1, String value2) {
            addCriterion("xpy_use_time_month not between", value1, value2, "xpyUseTimeMonth");
            return (Criteria) this;
        }

        public Criteria andXpyUseTimeDayIsNull() {
            addCriterion("xpy_use_time_day is null");
            return (Criteria) this;
        }

        public Criteria andXpyUseTimeDayIsNotNull() {
            addCriterion("xpy_use_time_day is not null");
            return (Criteria) this;
        }

        public Criteria andXpyUseTimeDayEqualTo(String value) {
            addCriterion("xpy_use_time_day =", value, "xpyUseTimeDay");
            return (Criteria) this;
        }

        public Criteria andXpyUseTimeDayNotEqualTo(String value) {
            addCriterion("xpy_use_time_day <>", value, "xpyUseTimeDay");
            return (Criteria) this;
        }

        public Criteria andXpyUseTimeDayGreaterThan(String value) {
            addCriterion("xpy_use_time_day >", value, "xpyUseTimeDay");
            return (Criteria) this;
        }

        public Criteria andXpyUseTimeDayGreaterThanOrEqualTo(String value) {
            addCriterion("xpy_use_time_day >=", value, "xpyUseTimeDay");
            return (Criteria) this;
        }

        public Criteria andXpyUseTimeDayLessThan(String value) {
            addCriterion("xpy_use_time_day <", value, "xpyUseTimeDay");
            return (Criteria) this;
        }

        public Criteria andXpyUseTimeDayLessThanOrEqualTo(String value) {
            addCriterion("xpy_use_time_day <=", value, "xpyUseTimeDay");
            return (Criteria) this;
        }

        public Criteria andXpyUseTimeDayLike(String value) {
            addCriterion("xpy_use_time_day like", value, "xpyUseTimeDay");
            return (Criteria) this;
        }

        public Criteria andXpyUseTimeDayNotLike(String value) {
            addCriterion("xpy_use_time_day not like", value, "xpyUseTimeDay");
            return (Criteria) this;
        }

        public Criteria andXpyUseTimeDayIn(List<String> values) {
            addCriterion("xpy_use_time_day in", values, "xpyUseTimeDay");
            return (Criteria) this;
        }

        public Criteria andXpyUseTimeDayNotIn(List<String> values) {
            addCriterion("xpy_use_time_day not in", values, "xpyUseTimeDay");
            return (Criteria) this;
        }

        public Criteria andXpyUseTimeDayBetween(String value1, String value2) {
            addCriterion("xpy_use_time_day between", value1, value2, "xpyUseTimeDay");
            return (Criteria) this;
        }

        public Criteria andXpyUseTimeDayNotBetween(String value1, String value2) {
            addCriterion("xpy_use_time_day not between", value1, value2, "xpyUseTimeDay");
            return (Criteria) this;
        }

        public Criteria andWhatsappOpenIsNull() {
            addCriterion("whatsapp_open is null");
            return (Criteria) this;
        }

        public Criteria andWhatsappOpenIsNotNull() {
            addCriterion("whatsapp_open is not null");
            return (Criteria) this;
        }

        public Criteria andWhatsappOpenEqualTo(String value) {
            addCriterion("whatsapp_open =", value, "whatsappOpen");
            return (Criteria) this;
        }

        public Criteria andWhatsappOpenNotEqualTo(String value) {
            addCriterion("whatsapp_open <>", value, "whatsappOpen");
            return (Criteria) this;
        }

        public Criteria andWhatsappOpenGreaterThan(String value) {
            addCriterion("whatsapp_open >", value, "whatsappOpen");
            return (Criteria) this;
        }

        public Criteria andWhatsappOpenGreaterThanOrEqualTo(String value) {
            addCriterion("whatsapp_open >=", value, "whatsappOpen");
            return (Criteria) this;
        }

        public Criteria andWhatsappOpenLessThan(String value) {
            addCriterion("whatsapp_open <", value, "whatsappOpen");
            return (Criteria) this;
        }

        public Criteria andWhatsappOpenLessThanOrEqualTo(String value) {
            addCriterion("whatsapp_open <=", value, "whatsappOpen");
            return (Criteria) this;
        }

        public Criteria andWhatsappOpenLike(String value) {
            addCriterion("whatsapp_open like", value, "whatsappOpen");
            return (Criteria) this;
        }

        public Criteria andWhatsappOpenNotLike(String value) {
            addCriterion("whatsapp_open not like", value, "whatsappOpen");
            return (Criteria) this;
        }

        public Criteria andWhatsappOpenIn(List<String> values) {
            addCriterion("whatsapp_open in", values, "whatsappOpen");
            return (Criteria) this;
        }

        public Criteria andWhatsappOpenNotIn(List<String> values) {
            addCriterion("whatsapp_open not in", values, "whatsappOpen");
            return (Criteria) this;
        }

        public Criteria andWhatsappOpenBetween(String value1, String value2) {
            addCriterion("whatsapp_open between", value1, value2, "whatsappOpen");
            return (Criteria) this;
        }

        public Criteria andWhatsappOpenNotBetween(String value1, String value2) {
            addCriterion("whatsapp_open not between", value1, value2, "whatsappOpen");
            return (Criteria) this;
        }

        public Criteria andXpyOperateManagerIsNull() {
            addCriterion("xpy_operate_manager is null");
            return (Criteria) this;
        }

        public Criteria andXpyOperateManagerIsNotNull() {
            addCriterion("xpy_operate_manager is not null");
            return (Criteria) this;
        }

        public Criteria andXpyOperateManagerEqualTo(String value) {
            addCriterion("xpy_operate_manager =", value, "xpyOperateManager");
            return (Criteria) this;
        }

        public Criteria andXpyOperateManagerNotEqualTo(String value) {
            addCriterion("xpy_operate_manager <>", value, "xpyOperateManager");
            return (Criteria) this;
        }

        public Criteria andXpyOperateManagerGreaterThan(String value) {
            addCriterion("xpy_operate_manager >", value, "xpyOperateManager");
            return (Criteria) this;
        }

        public Criteria andXpyOperateManagerGreaterThanOrEqualTo(String value) {
            addCriterion("xpy_operate_manager >=", value, "xpyOperateManager");
            return (Criteria) this;
        }

        public Criteria andXpyOperateManagerLessThan(String value) {
            addCriterion("xpy_operate_manager <", value, "xpyOperateManager");
            return (Criteria) this;
        }

        public Criteria andXpyOperateManagerLessThanOrEqualTo(String value) {
            addCriterion("xpy_operate_manager <=", value, "xpyOperateManager");
            return (Criteria) this;
        }

        public Criteria andXpyOperateManagerLike(String value) {
            addCriterion("xpy_operate_manager like", value, "xpyOperateManager");
            return (Criteria) this;
        }

        public Criteria andXpyOperateManagerNotLike(String value) {
            addCriterion("xpy_operate_manager not like", value, "xpyOperateManager");
            return (Criteria) this;
        }

        public Criteria andXpyOperateManagerIn(List<String> values) {
            addCriterion("xpy_operate_manager in", values, "xpyOperateManager");
            return (Criteria) this;
        }

        public Criteria andXpyOperateManagerNotIn(List<String> values) {
            addCriterion("xpy_operate_manager not in", values, "xpyOperateManager");
            return (Criteria) this;
        }

        public Criteria andXpyOperateManagerBetween(String value1, String value2) {
            addCriterion("xpy_operate_manager between", value1, value2, "xpyOperateManager");
            return (Criteria) this;
        }

        public Criteria andXpyOperateManagerNotBetween(String value1, String value2) {
            addCriterion("xpy_operate_manager not between", value1, value2, "xpyOperateManager");
            return (Criteria) this;
        }

        public Criteria andCreateAtIsNull() {
            addCriterion("create_at is null");
            return (Criteria) this;
        }

        public Criteria andCreateAtIsNotNull() {
            addCriterion("create_at is not null");
            return (Criteria) this;
        }

        public Criteria andCreateAtEqualTo(Date value) {
            addCriterion("create_at =", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtNotEqualTo(Date value) {
            addCriterion("create_at <>", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtGreaterThan(Date value) {
            addCriterion("create_at >", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtGreaterThanOrEqualTo(Date value) {
            addCriterion("create_at >=", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtLessThan(Date value) {
            addCriterion("create_at <", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtLessThanOrEqualTo(Date value) {
            addCriterion("create_at <=", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtIn(List<Date> values) {
            addCriterion("create_at in", values, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtNotIn(List<Date> values) {
            addCriterion("create_at not in", values, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtBetween(Date value1, Date value2) {
            addCriterion("create_at between", value1, value2, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtNotBetween(Date value1, Date value2) {
            addCriterion("create_at not between", value1, value2, "createAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtIsNull() {
            addCriterion("update_at is null");
            return (Criteria) this;
        }

        public Criteria andUpdateAtIsNotNull() {
            addCriterion("update_at is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateAtEqualTo(Date value) {
            addCriterion("update_at =", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtNotEqualTo(Date value) {
            addCriterion("update_at <>", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtGreaterThan(Date value) {
            addCriterion("update_at >", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtGreaterThanOrEqualTo(Date value) {
            addCriterion("update_at >=", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtLessThan(Date value) {
            addCriterion("update_at <", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtLessThanOrEqualTo(Date value) {
            addCriterion("update_at <=", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtIn(List<Date> values) {
            addCriterion("update_at in", values, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtNotIn(List<Date> values) {
            addCriterion("update_at not in", values, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtBetween(Date value1, Date value2) {
            addCriterion("update_at between", value1, value2, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtNotBetween(Date value1, Date value2) {
            addCriterion("update_at not between", value1, value2, "updateAt");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

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