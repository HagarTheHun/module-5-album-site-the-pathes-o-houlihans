package org.wcci.apimastery.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
public class Song {

    @Id
    @GeneratedValue
    private long id;
    private String title;
    @Lob
    private String lyrics;
//    private String releaseDate;
//    private boolean isSingle;
//    private int duration;
    @ManyToOne
    @JsonIgnore
    private Album album;

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }


    public Song(String title, Album album, String lyrics) {
        this.title = title;
        this.album = album;
        this.lyrics= lyrics;

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

    public String getLyrics() {
        return lyrics;
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

//    public Collection<Album> getAlbums() {
//        return album;
//    }


}


