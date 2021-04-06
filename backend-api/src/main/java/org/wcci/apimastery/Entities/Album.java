package org.wcci.apimastery.Entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Entity
public class Album {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String artist;
    private int ratings;
    private String img;
    @OneToMany

//    @ElementCollection
    private List<Comment> comments;

    @OneToMany(mappedBy = "album", cascade = CascadeType.ALL,orphanRemoval = true)
    private Collection<Song> songs= Collections.EMPTY_LIST;

    public void setSongs(Collection<Song> songs) {
        this.songs = songs;
    }

//    public Album(String name, String artist) {
//        this.name = name;
//        this.artist = artist;
//        this.img = img;
//        this.songs = new ArrayList<>();


    public Album(String name, String artist, int ratings, String img ) {
        this.name = name;
        this.artist = artist;
        this.ratings = ratings;
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

    public int getRatings() {
        return ratings;
    }

    public List<Comment> getComment() {
        return comments;
    }

    public Collection<Song> getSongs() {
        return songs;

    }
    public void setImg(String img){
        this.img=img;
    }
}
