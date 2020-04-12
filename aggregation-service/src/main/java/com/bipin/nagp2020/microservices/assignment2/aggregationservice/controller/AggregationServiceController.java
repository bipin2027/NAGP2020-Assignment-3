package com.bipin.nagp2020.microservices.assignment2.aggregationservice.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.bipin.nagp2020.microservices.assignment2.aggregationservice.model.AggregateOrderData;
import com.bipin.nagp2020.microservices.assignment2.aggregationservice.model.User;
import com.bipin.nagp2020.microservices.assignment2.aggregationservice.model.UserDto;
import com.bipin.nagp2020.microservices.assignment2.aggregationservice.model.UserOrderList;

@RestController
public class AggregationServiceController {
	/*
	 * @Autowired private OrderServiceFeignClient orderServiceFeignClient;
	 * 
	 * @Autowired private UserServiceFeignClient userServiceFeignClient;
	 * 
	 */	@Autowired
    private RestTemplate template;
	
	@Value("${ORDER_SERVICE_URI:http://localhost}:8686")
	private String OrderServiceUrl;
	
	@Value("${USER_SERVICE_URI:http://localhost}:8700")
	private String userServiceUrl;
	
	/**
	 * Gets the aggregate order details.
	 *
	 * @param userId the user id
	 * @return the aggregate order details
	 */
	@GetMapping("/orderdetails/{userId}")
	public AggregateOrderData getAggregateOrderDetails(@PathVariable String userId) {
		Map<String, String> uriVariables = new HashMap<>();
		uriVariables.put("userId", userId);
		
		UserDto userResponse1= template.getForObject(userServiceUrl+"/user/"+userId, UserDto.class);
		UserOrderList orderResponse1=template.getForObject(OrderServiceUrl+"order/"+userId, UserOrderList.class);
		//User userResponse = userServiceFeignClient.retriveUserDetails(userId);
		//UserOrderList orderResponse = orderServiceFeignClient.retriveUserOrder(userId);
		return new AggregateOrderData(userResponse1, orderResponse1.getOrders());
	}
	
	@GetMapping("/aggregationService")
	public String welcome() {
		return "welcome to User order Aggregation Service";
	}
}
