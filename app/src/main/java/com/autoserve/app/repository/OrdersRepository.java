package com.autoserve.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.autoserve.app.model.Orders;

@Repository
public interface OrdersRepository extends JpaRepository<Orders, Long>{

}
