package com.mission.shop.product.dao.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table product
	 * @mbggenerated  Mon Jun 16 13:18:26 CST 2014
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table product
	 * @mbggenerated  Mon Jun 16 13:18:26 CST 2014
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table product
	 * @mbggenerated  Mon Jun 16 13:18:26 CST 2014
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product
	 * @mbggenerated  Mon Jun 16 13:18:26 CST 2014
	 */
	public ProductExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product
	 * @mbggenerated  Mon Jun 16 13:18:26 CST 2014
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product
	 * @mbggenerated  Mon Jun 16 13:18:26 CST 2014
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product
	 * @mbggenerated  Mon Jun 16 13:18:26 CST 2014
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product
	 * @mbggenerated  Mon Jun 16 13:18:26 CST 2014
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product
	 * @mbggenerated  Mon Jun 16 13:18:26 CST 2014
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product
	 * @mbggenerated  Mon Jun 16 13:18:26 CST 2014
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product
	 * @mbggenerated  Mon Jun 16 13:18:26 CST 2014
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product
	 * @mbggenerated  Mon Jun 16 13:18:26 CST 2014
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product
	 * @mbggenerated  Mon Jun 16 13:18:26 CST 2014
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product
	 * @mbggenerated  Mon Jun 16 13:18:26 CST 2014
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table product
	 * @mbggenerated  Mon Jun 16 13:18:26 CST 2014
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

		protected void addCriterion(String condition, Object value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1,
				Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		public Criteria andProductIdIsNull() {
			addCriterion("product_id is null");
			return (Criteria) this;
		}

		public Criteria andProductIdIsNotNull() {
			addCriterion("product_id is not null");
			return (Criteria) this;
		}

		public Criteria andProductIdEqualTo(Long value) {
			addCriterion("product_id =", value, "productId");
			return (Criteria) this;
		}

		public Criteria andProductIdNotEqualTo(Long value) {
			addCriterion("product_id <>", value, "productId");
			return (Criteria) this;
		}

		public Criteria andProductIdGreaterThan(Long value) {
			addCriterion("product_id >", value, "productId");
			return (Criteria) this;
		}

		public Criteria andProductIdGreaterThanOrEqualTo(Long value) {
			addCriterion("product_id >=", value, "productId");
			return (Criteria) this;
		}

		public Criteria andProductIdLessThan(Long value) {
			addCriterion("product_id <", value, "productId");
			return (Criteria) this;
		}

		public Criteria andProductIdLessThanOrEqualTo(Long value) {
			addCriterion("product_id <=", value, "productId");
			return (Criteria) this;
		}

		public Criteria andProductIdIn(List<Long> values) {
			addCriterion("product_id in", values, "productId");
			return (Criteria) this;
		}

		public Criteria andProductIdNotIn(List<Long> values) {
			addCriterion("product_id not in", values, "productId");
			return (Criteria) this;
		}

		public Criteria andProductIdBetween(Long value1, Long value2) {
			addCriterion("product_id between", value1, value2, "productId");
			return (Criteria) this;
		}

		public Criteria andProductIdNotBetween(Long value1, Long value2) {
			addCriterion("product_id not between", value1, value2, "productId");
			return (Criteria) this;
		}

		public Criteria andKindIdIsNull() {
			addCriterion("kind_id is null");
			return (Criteria) this;
		}

		public Criteria andKindIdIsNotNull() {
			addCriterion("kind_id is not null");
			return (Criteria) this;
		}

		public Criteria andKindIdEqualTo(Long value) {
			addCriterion("kind_id =", value, "kindId");
			return (Criteria) this;
		}

		public Criteria andKindIdNotEqualTo(Long value) {
			addCriterion("kind_id <>", value, "kindId");
			return (Criteria) this;
		}

		public Criteria andKindIdGreaterThan(Long value) {
			addCriterion("kind_id >", value, "kindId");
			return (Criteria) this;
		}

		public Criteria andKindIdGreaterThanOrEqualTo(Long value) {
			addCriterion("kind_id >=", value, "kindId");
			return (Criteria) this;
		}

		public Criteria andKindIdLessThan(Long value) {
			addCriterion("kind_id <", value, "kindId");
			return (Criteria) this;
		}

		public Criteria andKindIdLessThanOrEqualTo(Long value) {
			addCriterion("kind_id <=", value, "kindId");
			return (Criteria) this;
		}

		public Criteria andKindIdIn(List<Long> values) {
			addCriterion("kind_id in", values, "kindId");
			return (Criteria) this;
		}

		public Criteria andKindIdNotIn(List<Long> values) {
			addCriterion("kind_id not in", values, "kindId");
			return (Criteria) this;
		}

		public Criteria andKindIdBetween(Long value1, Long value2) {
			addCriterion("kind_id between", value1, value2, "kindId");
			return (Criteria) this;
		}

		public Criteria andKindIdNotBetween(Long value1, Long value2) {
			addCriterion("kind_id not between", value1, value2, "kindId");
			return (Criteria) this;
		}

		public Criteria andShopIdIsNull() {
			addCriterion("shop_id is null");
			return (Criteria) this;
		}

		public Criteria andShopIdIsNotNull() {
			addCriterion("shop_id is not null");
			return (Criteria) this;
		}

		public Criteria andShopIdEqualTo(Long value) {
			addCriterion("shop_id =", value, "shopId");
			return (Criteria) this;
		}

		public Criteria andShopIdNotEqualTo(Long value) {
			addCriterion("shop_id <>", value, "shopId");
			return (Criteria) this;
		}

		public Criteria andShopIdGreaterThan(Long value) {
			addCriterion("shop_id >", value, "shopId");
			return (Criteria) this;
		}

		public Criteria andShopIdGreaterThanOrEqualTo(Long value) {
			addCriterion("shop_id >=", value, "shopId");
			return (Criteria) this;
		}

		public Criteria andShopIdLessThan(Long value) {
			addCriterion("shop_id <", value, "shopId");
			return (Criteria) this;
		}

		public Criteria andShopIdLessThanOrEqualTo(Long value) {
			addCriterion("shop_id <=", value, "shopId");
			return (Criteria) this;
		}

		public Criteria andShopIdIn(List<Long> values) {
			addCriterion("shop_id in", values, "shopId");
			return (Criteria) this;
		}

		public Criteria andShopIdNotIn(List<Long> values) {
			addCriterion("shop_id not in", values, "shopId");
			return (Criteria) this;
		}

		public Criteria andShopIdBetween(Long value1, Long value2) {
			addCriterion("shop_id between", value1, value2, "shopId");
			return (Criteria) this;
		}

		public Criteria andShopIdNotBetween(Long value1, Long value2) {
			addCriterion("shop_id not between", value1, value2, "shopId");
			return (Criteria) this;
		}

		public Criteria andShopNameIsNull() {
			addCriterion("shop_name is null");
			return (Criteria) this;
		}

		public Criteria andShopNameIsNotNull() {
			addCriterion("shop_name is not null");
			return (Criteria) this;
		}

		public Criteria andShopNameEqualTo(String value) {
			addCriterion("shop_name =", value, "shopName");
			return (Criteria) this;
		}

		public Criteria andShopNameNotEqualTo(String value) {
			addCriterion("shop_name <>", value, "shopName");
			return (Criteria) this;
		}

		public Criteria andShopNameGreaterThan(String value) {
			addCriterion("shop_name >", value, "shopName");
			return (Criteria) this;
		}

		public Criteria andShopNameGreaterThanOrEqualTo(String value) {
			addCriterion("shop_name >=", value, "shopName");
			return (Criteria) this;
		}

		public Criteria andShopNameLessThan(String value) {
			addCriterion("shop_name <", value, "shopName");
			return (Criteria) this;
		}

		public Criteria andShopNameLessThanOrEqualTo(String value) {
			addCriterion("shop_name <=", value, "shopName");
			return (Criteria) this;
		}

		public Criteria andShopNameLike(String value) {
			addCriterion("shop_name like", value, "shopName");
			return (Criteria) this;
		}

		public Criteria andShopNameNotLike(String value) {
			addCriterion("shop_name not like", value, "shopName");
			return (Criteria) this;
		}

		public Criteria andShopNameIn(List<String> values) {
			addCriterion("shop_name in", values, "shopName");
			return (Criteria) this;
		}

		public Criteria andShopNameNotIn(List<String> values) {
			addCriterion("shop_name not in", values, "shopName");
			return (Criteria) this;
		}

		public Criteria andShopNameBetween(String value1, String value2) {
			addCriterion("shop_name between", value1, value2, "shopName");
			return (Criteria) this;
		}

		public Criteria andShopNameNotBetween(String value1, String value2) {
			addCriterion("shop_name not between", value1, value2, "shopName");
			return (Criteria) this;
		}

		public Criteria andProductSnIsNull() {
			addCriterion("product_sn is null");
			return (Criteria) this;
		}

		public Criteria andProductSnIsNotNull() {
			addCriterion("product_sn is not null");
			return (Criteria) this;
		}

		public Criteria andProductSnEqualTo(String value) {
			addCriterion("product_sn =", value, "productSn");
			return (Criteria) this;
		}

		public Criteria andProductSnNotEqualTo(String value) {
			addCriterion("product_sn <>", value, "productSn");
			return (Criteria) this;
		}

		public Criteria andProductSnGreaterThan(String value) {
			addCriterion("product_sn >", value, "productSn");
			return (Criteria) this;
		}

		public Criteria andProductSnGreaterThanOrEqualTo(String value) {
			addCriterion("product_sn >=", value, "productSn");
			return (Criteria) this;
		}

		public Criteria andProductSnLessThan(String value) {
			addCriterion("product_sn <", value, "productSn");
			return (Criteria) this;
		}

		public Criteria andProductSnLessThanOrEqualTo(String value) {
			addCriterion("product_sn <=", value, "productSn");
			return (Criteria) this;
		}

		public Criteria andProductSnLike(String value) {
			addCriterion("product_sn like", value, "productSn");
			return (Criteria) this;
		}

		public Criteria andProductSnNotLike(String value) {
			addCriterion("product_sn not like", value, "productSn");
			return (Criteria) this;
		}

		public Criteria andProductSnIn(List<String> values) {
			addCriterion("product_sn in", values, "productSn");
			return (Criteria) this;
		}

		public Criteria andProductSnNotIn(List<String> values) {
			addCriterion("product_sn not in", values, "productSn");
			return (Criteria) this;
		}

		public Criteria andProductSnBetween(String value1, String value2) {
			addCriterion("product_sn between", value1, value2, "productSn");
			return (Criteria) this;
		}

		public Criteria andProductSnNotBetween(String value1, String value2) {
			addCriterion("product_sn not between", value1, value2, "productSn");
			return (Criteria) this;
		}

		public Criteria andProductNameIsNull() {
			addCriterion("product_name is null");
			return (Criteria) this;
		}

		public Criteria andProductNameIsNotNull() {
			addCriterion("product_name is not null");
			return (Criteria) this;
		}

		public Criteria andProductNameEqualTo(String value) {
			addCriterion("product_name =", value, "productName");
			return (Criteria) this;
		}

		public Criteria andProductNameNotEqualTo(String value) {
			addCriterion("product_name <>", value, "productName");
			return (Criteria) this;
		}

		public Criteria andProductNameGreaterThan(String value) {
			addCriterion("product_name >", value, "productName");
			return (Criteria) this;
		}

		public Criteria andProductNameGreaterThanOrEqualTo(String value) {
			addCriterion("product_name >=", value, "productName");
			return (Criteria) this;
		}

		public Criteria andProductNameLessThan(String value) {
			addCriterion("product_name <", value, "productName");
			return (Criteria) this;
		}

		public Criteria andProductNameLessThanOrEqualTo(String value) {
			addCriterion("product_name <=", value, "productName");
			return (Criteria) this;
		}

		public Criteria andProductNameLike(String value) {
			addCriterion("product_name like", value, "productName");
			return (Criteria) this;
		}

		public Criteria andProductNameNotLike(String value) {
			addCriterion("product_name not like", value, "productName");
			return (Criteria) this;
		}

		public Criteria andProductNameIn(List<String> values) {
			addCriterion("product_name in", values, "productName");
			return (Criteria) this;
		}

		public Criteria andProductNameNotIn(List<String> values) {
			addCriterion("product_name not in", values, "productName");
			return (Criteria) this;
		}

		public Criteria andProductNameBetween(String value1, String value2) {
			addCriterion("product_name between", value1, value2, "productName");
			return (Criteria) this;
		}

		public Criteria andProductNameNotBetween(String value1, String value2) {
			addCriterion("product_name not between", value1, value2,
					"productName");
			return (Criteria) this;
		}

		public Criteria andBrandIdIsNull() {
			addCriterion("brand_id is null");
			return (Criteria) this;
		}

		public Criteria andBrandIdIsNotNull() {
			addCriterion("brand_id is not null");
			return (Criteria) this;
		}

		public Criteria andBrandIdEqualTo(Long value) {
			addCriterion("brand_id =", value, "brandId");
			return (Criteria) this;
		}

		public Criteria andBrandIdNotEqualTo(Long value) {
			addCriterion("brand_id <>", value, "brandId");
			return (Criteria) this;
		}

		public Criteria andBrandIdGreaterThan(Long value) {
			addCriterion("brand_id >", value, "brandId");
			return (Criteria) this;
		}

		public Criteria andBrandIdGreaterThanOrEqualTo(Long value) {
			addCriterion("brand_id >=", value, "brandId");
			return (Criteria) this;
		}

		public Criteria andBrandIdLessThan(Long value) {
			addCriterion("brand_id <", value, "brandId");
			return (Criteria) this;
		}

		public Criteria andBrandIdLessThanOrEqualTo(Long value) {
			addCriterion("brand_id <=", value, "brandId");
			return (Criteria) this;
		}

		public Criteria andBrandIdIn(List<Long> values) {
			addCriterion("brand_id in", values, "brandId");
			return (Criteria) this;
		}

		public Criteria andBrandIdNotIn(List<Long> values) {
			addCriterion("brand_id not in", values, "brandId");
			return (Criteria) this;
		}

		public Criteria andBrandIdBetween(Long value1, Long value2) {
			addCriterion("brand_id between", value1, value2, "brandId");
			return (Criteria) this;
		}

		public Criteria andBrandIdNotBetween(Long value1, Long value2) {
			addCriterion("brand_id not between", value1, value2, "brandId");
			return (Criteria) this;
		}

		public Criteria andBrandNameIsNull() {
			addCriterion("brand_name is null");
			return (Criteria) this;
		}

		public Criteria andBrandNameIsNotNull() {
			addCriterion("brand_name is not null");
			return (Criteria) this;
		}

		public Criteria andBrandNameEqualTo(String value) {
			addCriterion("brand_name =", value, "brandName");
			return (Criteria) this;
		}

		public Criteria andBrandNameNotEqualTo(String value) {
			addCriterion("brand_name <>", value, "brandName");
			return (Criteria) this;
		}

		public Criteria andBrandNameGreaterThan(String value) {
			addCriterion("brand_name >", value, "brandName");
			return (Criteria) this;
		}

		public Criteria andBrandNameGreaterThanOrEqualTo(String value) {
			addCriterion("brand_name >=", value, "brandName");
			return (Criteria) this;
		}

		public Criteria andBrandNameLessThan(String value) {
			addCriterion("brand_name <", value, "brandName");
			return (Criteria) this;
		}

		public Criteria andBrandNameLessThanOrEqualTo(String value) {
			addCriterion("brand_name <=", value, "brandName");
			return (Criteria) this;
		}

		public Criteria andBrandNameLike(String value) {
			addCriterion("brand_name like", value, "brandName");
			return (Criteria) this;
		}

		public Criteria andBrandNameNotLike(String value) {
			addCriterion("brand_name not like", value, "brandName");
			return (Criteria) this;
		}

		public Criteria andBrandNameIn(List<String> values) {
			addCriterion("brand_name in", values, "brandName");
			return (Criteria) this;
		}

		public Criteria andBrandNameNotIn(List<String> values) {
			addCriterion("brand_name not in", values, "brandName");
			return (Criteria) this;
		}

		public Criteria andBrandNameBetween(String value1, String value2) {
			addCriterion("brand_name between", value1, value2, "brandName");
			return (Criteria) this;
		}

		public Criteria andBrandNameNotBetween(String value1, String value2) {
			addCriterion("brand_name not between", value1, value2, "brandName");
			return (Criteria) this;
		}

		public Criteria andViewNumIsNull() {
			addCriterion("view_num is null");
			return (Criteria) this;
		}

		public Criteria andViewNumIsNotNull() {
			addCriterion("view_num is not null");
			return (Criteria) this;
		}

		public Criteria andViewNumEqualTo(Long value) {
			addCriterion("view_num =", value, "viewNum");
			return (Criteria) this;
		}

		public Criteria andViewNumNotEqualTo(Long value) {
			addCriterion("view_num <>", value, "viewNum");
			return (Criteria) this;
		}

		public Criteria andViewNumGreaterThan(Long value) {
			addCriterion("view_num >", value, "viewNum");
			return (Criteria) this;
		}

		public Criteria andViewNumGreaterThanOrEqualTo(Long value) {
			addCriterion("view_num >=", value, "viewNum");
			return (Criteria) this;
		}

		public Criteria andViewNumLessThan(Long value) {
			addCriterion("view_num <", value, "viewNum");
			return (Criteria) this;
		}

		public Criteria andViewNumLessThanOrEqualTo(Long value) {
			addCriterion("view_num <=", value, "viewNum");
			return (Criteria) this;
		}

		public Criteria andViewNumIn(List<Long> values) {
			addCriterion("view_num in", values, "viewNum");
			return (Criteria) this;
		}

		public Criteria andViewNumNotIn(List<Long> values) {
			addCriterion("view_num not in", values, "viewNum");
			return (Criteria) this;
		}

		public Criteria andViewNumBetween(Long value1, Long value2) {
			addCriterion("view_num between", value1, value2, "viewNum");
			return (Criteria) this;
		}

		public Criteria andViewNumNotBetween(Long value1, Long value2) {
			addCriterion("view_num not between", value1, value2, "viewNum");
			return (Criteria) this;
		}

		public Criteria andStatusIsNull() {
			addCriterion("status is null");
			return (Criteria) this;
		}

		public Criteria andStatusIsNotNull() {
			addCriterion("status is not null");
			return (Criteria) this;
		}

		public Criteria andStatusEqualTo(Integer value) {
			addCriterion("status =", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotEqualTo(Integer value) {
			addCriterion("status <>", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusGreaterThan(Integer value) {
			addCriterion("status >", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
			addCriterion("status >=", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusLessThan(Integer value) {
			addCriterion("status <", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusLessThanOrEqualTo(Integer value) {
			addCriterion("status <=", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusIn(List<Integer> values) {
			addCriterion("status in", values, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotIn(List<Integer> values) {
			addCriterion("status not in", values, "status");
			return (Criteria) this;
		}

		public Criteria andStatusBetween(Integer value1, Integer value2) {
			addCriterion("status between", value1, value2, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotBetween(Integer value1, Integer value2) {
			addCriterion("status not between", value1, value2, "status");
			return (Criteria) this;
		}

		public Criteria andPayTypeIsNull() {
			addCriterion("pay_type is null");
			return (Criteria) this;
		}

		public Criteria andPayTypeIsNotNull() {
			addCriterion("pay_type is not null");
			return (Criteria) this;
		}

		public Criteria andPayTypeEqualTo(Integer value) {
			addCriterion("pay_type =", value, "payType");
			return (Criteria) this;
		}

		public Criteria andPayTypeNotEqualTo(Integer value) {
			addCriterion("pay_type <>", value, "payType");
			return (Criteria) this;
		}

		public Criteria andPayTypeGreaterThan(Integer value) {
			addCriterion("pay_type >", value, "payType");
			return (Criteria) this;
		}

		public Criteria andPayTypeGreaterThanOrEqualTo(Integer value) {
			addCriterion("pay_type >=", value, "payType");
			return (Criteria) this;
		}

		public Criteria andPayTypeLessThan(Integer value) {
			addCriterion("pay_type <", value, "payType");
			return (Criteria) this;
		}

		public Criteria andPayTypeLessThanOrEqualTo(Integer value) {
			addCriterion("pay_type <=", value, "payType");
			return (Criteria) this;
		}

		public Criteria andPayTypeIn(List<Integer> values) {
			addCriterion("pay_type in", values, "payType");
			return (Criteria) this;
		}

		public Criteria andPayTypeNotIn(List<Integer> values) {
			addCriterion("pay_type not in", values, "payType");
			return (Criteria) this;
		}

		public Criteria andPayTypeBetween(Integer value1, Integer value2) {
			addCriterion("pay_type between", value1, value2, "payType");
			return (Criteria) this;
		}

		public Criteria andPayTypeNotBetween(Integer value1, Integer value2) {
			addCriterion("pay_type not between", value1, value2, "payType");
			return (Criteria) this;
		}

		public Criteria andCreateTimeIsNull() {
			addCriterion("create_time is null");
			return (Criteria) this;
		}

		public Criteria andCreateTimeIsNotNull() {
			addCriterion("create_time is not null");
			return (Criteria) this;
		}

		public Criteria andCreateTimeEqualTo(Date value) {
			addCriterion("create_time =", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeNotEqualTo(Date value) {
			addCriterion("create_time <>", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeGreaterThan(Date value) {
			addCriterion("create_time >", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
			addCriterion("create_time >=", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeLessThan(Date value) {
			addCriterion("create_time <", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
			addCriterion("create_time <=", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeIn(List<Date> values) {
			addCriterion("create_time in", values, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeNotIn(List<Date> values) {
			addCriterion("create_time not in", values, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeBetween(Date value1, Date value2) {
			addCriterion("create_time between", value1, value2, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
			addCriterion("create_time not between", value1, value2,
					"createTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeIsNull() {
			addCriterion("update_time is null");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeIsNotNull() {
			addCriterion("update_time is not null");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeEqualTo(Date value) {
			addCriterion("update_time =", value, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeNotEqualTo(Date value) {
			addCriterion("update_time <>", value, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeGreaterThan(Date value) {
			addCriterion("update_time >", value, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
			addCriterion("update_time >=", value, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeLessThan(Date value) {
			addCriterion("update_time <", value, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
			addCriterion("update_time <=", value, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeIn(List<Date> values) {
			addCriterion("update_time in", values, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeNotIn(List<Date> values) {
			addCriterion("update_time not in", values, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeBetween(Date value1, Date value2) {
			addCriterion("update_time between", value1, value2, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
			addCriterion("update_time not between", value1, value2,
					"updateTime");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table product
	 * @mbggenerated  Mon Jun 16 13:18:26 CST 2014
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

		protected Criterion(String condition, Object value, Object secondValue,
				String typeHandler) {
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

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table product
     *
     * @mbggenerated do_not_delete_during_merge Thu Jun 12 11:22:43 CST 2014
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}