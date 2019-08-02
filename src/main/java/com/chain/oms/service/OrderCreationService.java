package com.chain.oms.service;

public interface OrderCreationService {

	public String getOrderCountsByProcess();
	
	public Boolean createOrderManagement(Integer orgId,Object orderAllocationDetails); 
	
	public String getServicesByProcessId(Integer processId);
}
