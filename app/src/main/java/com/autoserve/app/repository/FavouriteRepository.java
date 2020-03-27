package com.autoserve.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.autoserve.app.model.Favourite;

public interface FavouriteRepository extends JpaRepository<Favourite, Long>{

}
