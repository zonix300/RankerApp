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
@Table(name = "list_items")
public class ListItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "list_item_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "list_id")
    private List list;

    @OneToOne
    @JoinColumn(name = "album_id")
    private Album album;

    @OneToMany
    @JoinColumn(name = "track_id")
    private java.util.List<Track> track = new ArrayList<>();

    private Integer position;

}
