package com.zonix.musicrankerapp.database.repository;

import com.zonix.musicrankerapp.database.entity.Rating;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RatingRepository extends JpaRepository<Rating, Integer> {

    Optional<Rating> findByTrack_Id(Integer id);
}
