package com.bipin.nagp2020.microservices.assignment2.aggregationservice.model;

import java.util.List;

/**
 * The Class AggregateOrderData.
 */
public class AggregateOrderData {
	private UserDto user;
	private List<Order> orderList;
	
	public AggregateOrderData() {
		
	}

	public AggregateOrderData(UserDto user, List<Order> orderList) {
		super();
		this.user = user;
		this.orderList = orderList;
	}

	public UserDto getUser() {
		return user;
	}

	public void setUser(UserDto user) {
		this.user = user;
	}

	public List<Order> getOrderList() {
		return orderList;
	}

	public void setOrderList(List<Order> orderList) {
		this.orderList = orderList;
	}
	
}
