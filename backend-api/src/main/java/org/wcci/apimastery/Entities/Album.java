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
    @ManyToMany
    private Collection<Artist> artist;
    @OneToMany
    private Collection<Song> songs;

    public Album(String name) {
        this.name = name;
        this.artist = new ArrayList<>();
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

    public Collection<Artist> getArtist() {
        return artist;
    }

    public Collection<Song> getSongs() {
        return songs;
    }
}
