package com.autoserve.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.autoserve.app.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{

}
