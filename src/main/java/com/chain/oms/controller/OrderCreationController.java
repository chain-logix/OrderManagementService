/**
 * 
 */
package com.chain.oms.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.chain.oms.service.OrderCreationService;

/**
 * @author Mahamad.Mustaf
 *
 */
@RestController
@RequestMapping("/order")
public class OrderCreationController {
	private static final Logger logger = LoggerFactory.getLogger(OrderCreationController.class);

	@Autowired
	private OrderCreationService orderCreationService;

	@PostMapping("/createOrder")
	public ResponseEntity<Boolean> createOrder(@RequestParam Integer orgId,
			@Valid @RequestBody Object orderCreationDetails) {

		Boolean result = false;

		result = orderCreationService.createOrderManagement(orgId, orderCreationDetails);

		return new ResponseEntity<>(result, HttpStatus.OK);
	}
	
	  
	  @GetMapping(value = "getOrdersByProcess")
	  public ResponseEntity<String> getOrdersByProcess() {
	  
	  
	  String ordersList = orderCreationService.getOrderCountsByProcess();
	  
	  return new ResponseEntity<>(ordersList, HttpStatus.OK); }
	  
	  
	
	@GetMapping("/getServices")
	public ResponseEntity<String> getServicesByProcessId(@RequestParam Integer processId) {

		String serviceByProcess = orderCreationService.getServicesByProcessId(processId);
		logger.info("Service recieved for ProcessId is ::{}::{}",processId,serviceByProcess);
		return new ResponseEntity<>(serviceByProcess, HttpStatus.OK);

	}
	 
	  
	 

}
