/**
 * 
 */
package com.chain.oms.model;

import java.util.List;



/**
 * @author RohitDammalli
 *
 */
public class OrderProcessingModel {
	
	private OrderInfoModel orderInfoModel;
	
	private List<OrderAttachmentsModel> orderAttachmentsModel;
	
	private List<OrderCommentsModel> orderCommentsModel;
	
	private List<OrderDetailsModel> orderDetailsModel;
	
	private List<OrderTaxesModel> orderTaxesModel;

	public OrderInfoModel getOrderInfoModel() {
		return orderInfoModel;
	}

	public void setOrderInfoModel(OrderInfoModel orderInfoModel) {
		this.orderInfoModel = orderInfoModel;
	}

	public List<OrderAttachmentsModel> getOrderAttachmentsModel() {
		return orderAttachmentsModel;
	}

	public void setOrderAttachmentsModel(List<OrderAttachmentsModel> orderAttachmentsModel) {
		this.orderAttachmentsModel = orderAttachmentsModel;
	}

	public List<OrderCommentsModel> getOrderCommentsModel() {
		return orderCommentsModel;
	}

	public void setOrderCommentsModel(List<OrderCommentsModel> orderCommentsModel) {
		this.orderCommentsModel = orderCommentsModel;
	}

	public List<OrderDetailsModel> getOrderDetailsModel() {
		return orderDetailsModel;
	}

	public void setOrderDetailsModel(List<OrderDetailsModel> orderDetailsModel) {
		this.orderDetailsModel = orderDetailsModel;
	}

	public List<OrderTaxesModel> getOrderTaxesModel() {
		return orderTaxesModel;
	}

	public void setOrderTaxesModel(List<OrderTaxesModel> orderTaxesModel) {
		this.orderTaxesModel = orderTaxesModel;
	}
	

}
