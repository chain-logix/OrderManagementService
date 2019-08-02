package com.chain.oms.orderprocess;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class OrderProcessController {

	@GetMapping(value="/orderProcess")
	public ResponseEntity<String> orderProcess()
	{
		System.out.println("hello");
		return null;
	}
	
	
}
