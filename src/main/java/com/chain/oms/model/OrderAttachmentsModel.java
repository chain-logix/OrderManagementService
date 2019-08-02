package com.chain.oms.model;


public class OrderAttachmentsModel {

	private Integer orderMasterId;
	
	
	private OrderAllocationDetails orderAllocationDetails;
	
	private String attachmentName;
	
	private String attachementLink;
	
	private Integer isDeleted;
	
	private Integer createdBy;
	
	private Integer modifiedBy;
	

	public Integer getOrderMasterId() {
		return orderMasterId;
	}

	public void setOrderMasterId(Integer orderMasterId) {
		this.orderMasterId = orderMasterId;
	}

	public OrderAllocationDetails getOrderAllocationDetails() {
		return orderAllocationDetails;
	}

	public void setOrderAllocationDetails(OrderAllocationDetails orderAllocationDetails) {
		this.orderAllocationDetails = orderAllocationDetails;
	}

	public String getAttachmentName() {
		return attachmentName;
	}

	public void setAttachmentName(String attachmentName) {
		this.attachmentName = attachmentName;
	}

	public String getAttachementLink() {
		return attachementLink;
	}

	public void setAttachementLink(String attachementLink) {
		this.attachementLink = attachementLink;
	}

	public Integer getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(Integer isDeleted) {
		this.isDeleted = isDeleted;
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
	
}
