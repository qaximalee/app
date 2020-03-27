package com.autoserve.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.autoserve.app.model.Orders;

public interface OrdersRepository extends JpaRepository<Orders, Long>{

}
