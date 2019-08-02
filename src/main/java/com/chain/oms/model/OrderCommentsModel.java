package com.chain.oms.model;


public class OrderCommentsModel {

	
	private Integer orderCommentsId;
	
	private OrderAllocationDetails orderAllocationDetails;
	
	private String orderComment;
	
	private String commentType;
	
	private Integer isDeleted;
	
	private Integer createdBy;
	
	private Integer modifiedBy;

	public Integer getOrderCommentsId() {
		return orderCommentsId;
	}

	public void setOrderCommentsId(Integer orderCommentsId) {
		this.orderCommentsId = orderCommentsId;
	}

	public OrderAllocationDetails getOrderAllocationDetails() {
		return orderAllocationDetails;
	}

	public void setOrderAllocationDetails(OrderAllocationDetails orderAllocationDetails) {
		this.orderAllocationDetails = orderAllocationDetails;
	}

	public String getOrderComment() {
		return orderComment;
	}

	public void setOrderComment(String orderComment) {
		this.orderComment = orderComment;
	}

	public String getCommentType() {
		return commentType;
	}

	public void setCommentType(String commentType) {
		this.commentType = commentType;
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
