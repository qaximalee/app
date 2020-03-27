package com.autoserve.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.autoserve.app.model.Favorite;

@Repository
public interface FavouriteRepository extends JpaRepository<Favorite, Long>{

}
