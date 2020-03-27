package com.autoserve.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.autoserve.app.model.Tables;

@Repository
public interface TablesRepository extends JpaRepository<Tables, Long>{

}
