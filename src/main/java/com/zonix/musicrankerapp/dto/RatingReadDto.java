package com.zonix.musicrankerapp.dto;

import com.zonix.musicrankerapp.database.entity.Album;
import com.zonix.musicrankerapp.database.entity.Artist;
import com.zonix.musicrankerapp.database.entity.Tag;
import com.zonix.musicrankerapp.database.entity.Track;

public class RatingReadDto {
    Integer id;
    Tag tag;
    Album album;
    Track track;
    Artist artist;
}
