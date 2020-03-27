package com.autoserve.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.autoserve.app.model.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {

}
