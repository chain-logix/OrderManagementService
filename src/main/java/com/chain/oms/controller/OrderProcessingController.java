package com.chain.oms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.chain.oms.service.OrderProcessingService;

@RestController
@RequestMapping("/orderProcessing")
public class OrderProcessingController {

	@Autowired
	OrderProcessingService orderProcessingService;

	/*
	 * @Autowired FileUploadServiceImpl fileUploadServiceImpl;
	 */
	@GetMapping(value = "/fetchOrderProcessed")
	public ResponseEntity<String> fetchProcessedOrderDetails(@RequestParam Integer orderId) {
		String orderProcessDetails = orderProcessingService.fetchOrderProcessedDetails(orderId);
		return new ResponseEntity<>(orderProcessDetails, HttpStatus.OK);

	}

}
