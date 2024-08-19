package com.zonix.musicrankerapp.database.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Table(name = "tables")
public class Album{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "album_id")
    private Long id;

    private String title;

    @ManyToOne
    private Artist artist;

    private LocalDate releaseDate;

    private String albumType;

    private String coverArt;

    @ManyToOne
    private Genre genre;

    private String description;

}
