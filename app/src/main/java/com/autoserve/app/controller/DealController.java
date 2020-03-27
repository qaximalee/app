package com.autoserve.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.autoserve.app.service.DealService;

@RestController
public class DealController {


	@Autowired
	private DealService dealService;
}
