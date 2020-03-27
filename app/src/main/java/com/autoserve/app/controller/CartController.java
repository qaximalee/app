package com.autoserve.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.autoserve.app.service.CartService;

@RestController
public class CartController {


	@Autowired
	private CartService cartService;
}
