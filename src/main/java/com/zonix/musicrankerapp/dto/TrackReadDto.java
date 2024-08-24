package com.zonix.musicrankerapp.dto;

import com.zonix.musicrankerapp.database.entity.Album;
import lombok.Value;

@Value
public class TrackReadDto {
    Long id;
    Album album;
    String title;
    String duration;
    Integer trackNumber;
    String lyrics;
}
