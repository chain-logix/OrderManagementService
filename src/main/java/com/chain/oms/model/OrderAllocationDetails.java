package com.chain.oms.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class OrderAllocationDetails {

	private Integer orderId;
	private String orderNumber;
	private String stateName;
	private String countyName;
	private String clientName;
	private String serviceSelected;
	private String assignedUser;
	private List<Users> users;
	
	public List<Users> getUsers() {
		return users;
	}
	public void setUsers(List<Users> users) {
		this.users = users;
	}
	public String getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public String getCountyName() {
		return countyName;
	}
	public void setCountyName(String countyName) {
		this.countyName = countyName;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public String getServiceSelected() {
		return serviceSelected;
	}
	public void setServiceSelected(String serviceSelected) {
		this.serviceSelected = serviceSelected;
	}
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	
	@Override
	public String toString() {
		return "OrderAllocationDetails [orderId=" + orderId + ", orderNumber=" + orderNumber + ", stateName="
				+ stateName + ", countyName=" + countyName + ", clientName=" + clientName + ", serviceSelected="
				+ serviceSelected + ", users=" + users + "]";
	}
	public OrderAllocationDetails() {
		super();
	}
	public String getAssignedUser() {
		return assignedUser;
	}
	public void setAssignedUser(String assignedUser) {
		this.assignedUser = assignedUser;
	}
	
	 
	
}
