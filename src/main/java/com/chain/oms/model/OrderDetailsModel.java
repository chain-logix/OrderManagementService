package com.chain.oms.model;

import java.math.BigDecimal;


public class OrderDetailsModel {

	
	
	private Integer orderDetailsId;
	
	private OrderAllocationDetails orderAllocationDetails;
	
	private String parcelNumber;
	
	private BigDecimal assessedValue;
	
	private BigDecimal improvementValue;
	
	private String notes;
	
	private Integer createdBy;
	
	private Integer modifiedBy;
	
	private Byte isDeleted;

	public Integer getOrderDetailsId() {
		return orderDetailsId;
	}

	public void setOrderDetailsId(Integer orderDetailsId) {
		this.orderDetailsId = orderDetailsId;
	}

	public OrderAllocationDetails getOrderAllocationDetails() {
		return orderAllocationDetails;
	}

	public void setOrderAllocationDetails(OrderAllocationDetails orderAllocationDetails) {
		this.orderAllocationDetails = orderAllocationDetails;
	}

	public String getParcelNumber() {
		return parcelNumber;
	}

	public void setParcelNumber(String parcelNumber) {
		this.parcelNumber = parcelNumber;
	}

	public BigDecimal getAssessedValue() {
		return assessedValue;
	}

	public void setAssessedValue(BigDecimal assessedValue) {
		this.assessedValue = assessedValue;
	}

	public BigDecimal getImprovementValue() {
		return improvementValue;
	}

	public void setImprovementValue(BigDecimal improvementValue) {
		this.improvementValue = improvementValue;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public Integer getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}

	public Integer getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(Integer modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Byte getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(Byte isDeleted) {
		this.isDeleted = isDeleted;
	}
	
}
