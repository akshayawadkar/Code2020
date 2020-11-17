package com.egen.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.egen.bussiness.EcommerceBussiness;
import com.egen.bussiness.response.OrderInputRequest;
import com.egen.bussiness.response.OrderOutputResponse;
import com.egen.dao.beans.OrderStatus;

@RestController
@RequestMapping("/egensolutions")
public class EcommerceController {

	@Autowired
	EcommerceBussiness obj;

	@GetMapping("/test")
	public String test() {
		return "test";
	}

	@GetMapping("/findOrderById/{id}")
	public OrderOutputResponse getOrderById(@PathVariable Long id) {
		OrderOutputResponse orderById = obj.getOrderById(id);
		return orderById;
	}

	@PostMapping("/createSingleOrder")
	public ResponseEntity<OrderInputRequest> saveSingleOrder(@RequestBody OrderInputRequest orderInputRequest) {
		obj.saveSingleOrder(orderInputRequest);

		return new ResponseEntity<OrderInputRequest>(HttpStatus.CREATED);
	}

	@PostMapping("/createOrderInBulk")
	public ResponseEntity<OrderInputRequest> saveOrderInBulk(@RequestBody List<OrderInputRequest> orderInputRequest) {
		obj.saveOrderInBulk(orderInputRequest);

		return new ResponseEntity<OrderInputRequest>(HttpStatus.CREATED);
	}

	@PutMapping("/cancelOrder/{id}")
	public void cancelOrder(@PathVariable Long id) {
		obj.cancelOrder(id);
	}

	@PutMapping("/updateOrderStatus")
	public void updateOrderInBulk(@RequestBody Map<Long, OrderStatus> statusMap) {
			obj.updateOrderInBulk(statusMap);
	}

}
