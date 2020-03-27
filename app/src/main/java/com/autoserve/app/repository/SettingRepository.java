package com.autoserve.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.autoserve.app.model.Setting;

@Repository
public interface SettingRepository extends JpaRepository<Setting, Long> {

}
