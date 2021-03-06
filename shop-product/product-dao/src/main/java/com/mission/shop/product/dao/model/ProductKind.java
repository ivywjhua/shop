package com.mission.shop.product.dao.model;

import java.io.Serializable;
import java.util.Date;

public class ProductKind implements Serializable {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column product_kind.kind_id
	 * @mbggenerated  Mon Jun 16 13:18:26 CST 2014
	 */
	private Long kindId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column product_kind.type_name
	 * @mbggenerated  Mon Jun 16 13:18:26 CST 2014
	 */
	private String typeName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column product_kind.status
	 * @mbggenerated  Mon Jun 16 13:18:26 CST 2014
	 */
	private Integer status;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column product_kind.create_time
	 * @mbggenerated  Mon Jun 16 13:18:26 CST 2014
	 */
	private Date createTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column product_kind.update_time
	 * @mbggenerated  Mon Jun 16 13:18:26 CST 2014
	 */
	private Date updateTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table product_kind
	 * @mbggenerated  Mon Jun 16 13:18:26 CST 2014
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column product_kind.kind_id
	 * @return  the value of product_kind.kind_id
	 * @mbggenerated  Mon Jun 16 13:18:26 CST 2014
	 */
	public Long getKindId() {
		return kindId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column product_kind.kind_id
	 * @param kindId  the value for product_kind.kind_id
	 * @mbggenerated  Mon Jun 16 13:18:26 CST 2014
	 */
	public void setKindId(Long kindId) {
		this.kindId = kindId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column product_kind.type_name
	 * @return  the value of product_kind.type_name
	 * @mbggenerated  Mon Jun 16 13:18:26 CST 2014
	 */
	public String getTypeName() {
		return typeName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column product_kind.type_name
	 * @param typeName  the value for product_kind.type_name
	 * @mbggenerated  Mon Jun 16 13:18:26 CST 2014
	 */
	public void setTypeName(String typeName) {
		this.typeName = typeName == null ? null : typeName.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column product_kind.status
	 * @return  the value of product_kind.status
	 * @mbggenerated  Mon Jun 16 13:18:26 CST 2014
	 */
	public Integer getStatus() {
		return status;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column product_kind.status
	 * @param status  the value for product_kind.status
	 * @mbggenerated  Mon Jun 16 13:18:26 CST 2014
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column product_kind.create_time
	 * @return  the value of product_kind.create_time
	 * @mbggenerated  Mon Jun 16 13:18:26 CST 2014
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column product_kind.create_time
	 * @param createTime  the value for product_kind.create_time
	 * @mbggenerated  Mon Jun 16 13:18:26 CST 2014
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column product_kind.update_time
	 * @return  the value of product_kind.update_time
	 * @mbggenerated  Mon Jun 16 13:18:26 CST 2014
	 */
	public Date getUpdateTime() {
		return updateTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column product_kind.update_time
	 * @param updateTime  the value for product_kind.update_time
	 * @mbggenerated  Mon Jun 16 13:18:26 CST 2014
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
}