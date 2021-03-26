package org.wcci.apimastery.Entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
public class Album {
    @Id
    @GeneratedValue
    private long Id;
    private String name;
    private String artist;

    @OneToMany
    private Collection<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }
    public Album () {

    }

    public long getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public String getArtist() {
        return artist;
    }

    public Collection<Song> getSongs() {
        return songs;
    }
}
