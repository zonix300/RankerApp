package com.zonix.musicrankerapp.service;

import com.zonix.musicrankerapp.database.repository.TrackRepository;
import com.zonix.musicrankerapp.dto.TrackReadDto;
import com.zonix.musicrankerapp.mapper.TrackReadMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;


@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class TrackService {

    private final TrackRepository trackRepository;
    private final TrackReadMapper trackReadMapper;

    public List<TrackReadDto> findAll() {
        return trackRepository.findAll().stream()
                .map(trackReadMapper::map)
                .toList();
    }

    public Optional<TrackReadDto> findByTitle(String title) {
        return trackRepository.findByTitle(title)
                .map(trackReadMapper::map);
    }
}
