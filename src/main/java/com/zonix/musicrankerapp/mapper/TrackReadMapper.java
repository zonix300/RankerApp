package com.zonix.musicrankerapp.mapper;

import com.zonix.musicrankerapp.database.entity.Track;
import com.zonix.musicrankerapp.dto.TrackReadDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class TrackReadMapper implements Mapper<Track, TrackReadDto> {


    @Override
    public TrackReadDto map(Track source) {
        return new TrackReadDto(
                source.getId(),
                source.getAlbum(),
                source.getTitle(),
                source.getDuration(),
                source.getTrackNumber(),
                source.getLyrics()
        );
    }
}
