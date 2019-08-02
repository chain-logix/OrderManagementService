package com.chain.oms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.chain.oms.model.OrderAllocationDetails;
import com.chain.oms.service.OrderAllocationService;

@RestController
@RequestMapping("/allocation")
public class OrderAllocationController {

	@Autowired
	private OrderAllocationService orderAllocationService;

	@GetMapping("/fetchOrderAllocation")
	public ResponseEntity<String> fetchOrderAllocation(@RequestParam String orderAssignedStatus) {

		String orderDetails = orderAllocationService.fetchOrders(orderAssignedStatus);
		return new ResponseEntity<>(orderDetails, HttpStatus.OK);

	}

	@GetMapping("/fetchOrderAllocationReAssign")
	public ResponseEntity<String> fetchOrderAllocationReassign(@RequestParam String orderAssignedStatus) {

		String reassignorderDetails = orderAllocationService.fetchOrders(orderAssignedStatus);
		return new ResponseEntity<>(reassignorderDetails, HttpStatus.OK);

	}

	@GetMapping(value = "fetchUsers")
	public ResponseEntity<String> fetchUsers() {
		String usr = orderAllocationService.fetchUsers();
		return new ResponseEntity<>(usr, HttpStatus.OK);
	}
	
	
	@PostMapping("/assignOrdersToUser")
	public ResponseEntity<Boolean> assignOrderToUser(@RequestBody OrderAllocationDetails orderDetails,@RequestParam Integer assignedUserId,
			@RequestParam Integer workFlowId)
	{
		Boolean userAssignStatus = orderAllocationService.allocateOrders(orderDetails,assignedUserId,workFlowId);
		return new ResponseEntity<>(userAssignStatus, HttpStatus.OK);
	}

}
