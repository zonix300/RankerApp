package com.zonix.musicrankerapp.database.repository;

import com.zonix.musicrankerapp.database.entity.Track;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TrackRepository extends JpaRepository<Track, Long> {

    Optional<Track> findByTitle(String title);
}
