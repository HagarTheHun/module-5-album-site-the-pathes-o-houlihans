package org.wcci.apimastery.Entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
public class Album {
    @Id
    @GeneratedValue
    private Long Id;
    private String name;
    private String artist;

    @OneToMany(mappedBy = "album")
    private Collection<Song> songs;

    public void setSongs(Collection<Song> songs) {
        this.songs = songs;
    }

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }
    public Album () {

    }

    public Long getId() {
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
