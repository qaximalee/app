package com.autoserve.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.autoserve.app.model.Setting;

public interface SettingRepository extends JpaRepository<Setting, Long> {

}
