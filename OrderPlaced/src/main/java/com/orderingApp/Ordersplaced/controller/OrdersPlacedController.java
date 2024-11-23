package com.orderingApp.Ordersplaced.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class OrdersPlacedController {
	
	@PostMapping("/orders")
	public ResponseEntity<String> orders() {
		 return ResponseEntity.ok("Order placed successfully.");
		
	}

}
