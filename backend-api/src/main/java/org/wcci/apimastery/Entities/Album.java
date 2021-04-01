package org.wcci.apimastery.Entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

@Entity
public class Album {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String artist;
    private String img;

    @OneToMany(mappedBy = "album", cascade = CascadeType.ALL,orphanRemoval = true)
    private Collection<Song> songs= Collections.EMPTY_LIST;

    public void setSongs(Collection<Song> songs) {
        this.songs = songs;
    }

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.img = img;
        this.songs = new ArrayList<>();


    }
    public Album () {

    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getArtist() {
        return artist;
    }

    public String getImg() {
        return img;
    }

    public Collection<Song> getSongs() {
        return songs;
    }
}
