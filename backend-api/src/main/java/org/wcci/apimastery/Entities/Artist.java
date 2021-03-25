package org.wcci.apimastery.Entities;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.Collection;

@Entity
public class Artist {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    @ManyToMany(mappedBy = "artist")
    private Collection<Song> songs;
    @ManyToMany
    @JsonIgnore
    private Collection<Album> albums;

    public Artist (String name) {
        this.name = name;
        this.songs = new ArrayList<>();
        this.albums = new ArrayList<>();
    }
    public Artist () {

    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Collection<Song> getSongs() {
        return songs;
    }

    public Collection<Album> getAlbums() {
        return albums;
    }

}


