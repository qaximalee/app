package com.autoserve.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.autoserve.app.model.Deal;

public interface DealRepository extends JpaRepository<Deal, Long>{

}
