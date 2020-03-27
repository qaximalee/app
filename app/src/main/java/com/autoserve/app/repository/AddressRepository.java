package com.autoserve.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.autoserve.app.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long>{

}
