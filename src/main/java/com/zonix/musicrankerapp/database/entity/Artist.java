package com.zonix.musicrankerapp.database.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Table(name = "artists")
public class Artist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "artist_id")
    private Long id;

    private String name;

    private String bio;

    private String country;

    private String activeYears;

    @OneToMany
    private ArrayList<Genre> genres = new ArrayList<>();
}
