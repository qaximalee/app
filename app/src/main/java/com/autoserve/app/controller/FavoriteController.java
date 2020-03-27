package com.autoserve.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.autoserve.app.service.FavoriteService;

@RestController
public class FavoriteController {

	@Autowired
	private FavoriteService favoriteService;
}
