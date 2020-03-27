package com.autoserve.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.autoserve.app.model.Restaurant;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {

}
