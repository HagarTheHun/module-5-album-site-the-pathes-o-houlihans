package org.wcci.apimastery.Entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
public class Song {

    @Id
    @GeneratedValue
    private long id;
    private String title;
//    private String releaseDate;
//    private boolean isSingle;
//    private int duration;
    @OneToMany
    private Collection<Album> albums;


    public Song(String title) {
        this.title = title;
//        this.releaseDate = releaseDate;
//        this.isSingle = isSingle;
//        this.duration = duration;
//        this.albums = new ArrayList<>();
    }
    public Song () {

    }


    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

//    public String getReleaseDate() {
//        return releaseDate;
//    }
//
//    public boolean isSingle() {
//        return isSingle;
//    }
//
//    public int getDuration() {
//        return duration;
//    }

    public Collection<Album> getAlbums() {
        return albums;
    }


}


