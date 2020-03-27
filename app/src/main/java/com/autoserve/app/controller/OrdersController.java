package com.autoserve.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.autoserve.app.service.FavoriteService;
import com.autoserve.app.service.OrdersService;

@RestController
public class OrdersController {


	@Autowired
	private OrdersService ordersService;
}
