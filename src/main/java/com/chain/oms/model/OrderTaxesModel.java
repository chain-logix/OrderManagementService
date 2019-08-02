package com.chain.oms.model;

import java.math.BigDecimal;
import java.sql.Timestamp;



public class OrderTaxesModel {

	
	
	private Integer orderTaxesId;

	private OrderAllocationDetails orderAllocationDetails;

	private String taxAuthority;

	private String taxPeriod;

	private Timestamp dueDate;

	private Timestamp paidDate;

	private Timestamp dlqDate;

	private String taxStatus;

	private BigDecimal dueAmount;

	private BigDecimal grossAmount;

	private BigDecimal amountPaid;

	private String goodThru;

	private Integer createdBy;

	private Integer modifiedBy;

	private Byte isDeleted;
	
	private String taxYear;

	public Integer getOrderTaxesId() {
		return orderTaxesId;
	}

	public void setOrderTaxesId(Integer orderTaxesId) {
		this.orderTaxesId = orderTaxesId;
	}

	public OrderAllocationDetails getOrderAllocationDetails() {
		return orderAllocationDetails;
	}

	public void setOrderAllocationDetails(OrderAllocationDetails orderAllocationDetails) {
		this.orderAllocationDetails = orderAllocationDetails;
	}

	public String getTaxAuthority() {
		return taxAuthority;
	}

	public void setTaxAuthority(String taxAuthority) {
		this.taxAuthority = taxAuthority;
	}

	public String getTaxPeriod() {
		return taxPeriod;
	}

	public void setTaxPeriod(String taxPeriod) {
		this.taxPeriod = taxPeriod;
	}

	public Timestamp getDueDate() {
		return dueDate;
	}

	public void setDueDate(Timestamp dueDate) {
		this.dueDate = dueDate;
	}

	public Timestamp getPaidDate() {
		return paidDate;
	}

	public void setPaidDate(Timestamp paidDate) {
		this.paidDate = paidDate;
	}

	public Timestamp getDlqDate() {
		return dlqDate;
	}

	public void setDlqDate(Timestamp dlqDate) {
		this.dlqDate = dlqDate;
	}

	public String getTaxStatus() {
		return taxStatus;
	}

	public void setTaxStatus(String taxStatus) {
		this.taxStatus = taxStatus;
	}

	public BigDecimal getDueAmount() {
		return dueAmount;
	}

	public void setDueAmount(BigDecimal dueAmount) {
		this.dueAmount = dueAmount;
	}

	public BigDecimal getGrossAmount() {
		return grossAmount;
	}

	public void setGrossAmount(BigDecimal grossAmount) {
		this.grossAmount = grossAmount;
	}

	public BigDecimal getAmountPaid() {
		return amountPaid;
	}

	public void setAmountPaid(BigDecimal amountPaid) {
		this.amountPaid = amountPaid;
	}

	public String getGoodThru() {
		return goodThru;
	}

	public void setGoodThru(String goodThru) {
		this.goodThru = goodThru;
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

	public String getTaxYear() {
		return taxYear;
	}

	public void setTaxYear(String taxYear) {
		this.taxYear = taxYear;
	}
}
