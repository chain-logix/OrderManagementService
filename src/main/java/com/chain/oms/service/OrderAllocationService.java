package com.chain.oms.service;

import com.chain.oms.model.OrderAllocationDetails;

public interface OrderAllocationService {

		
		public String fetchUsers();
		
		public String fetchOrders(String orderAssignedStatus);
		
		public Boolean allocateOrders(OrderAllocationDetails orderDetails,Integer assignedUserId,Integer workFlowId);

}
