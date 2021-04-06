package org.wcci.apimastery.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
public class Song {

    @Id
    @GeneratedValue
    private long id;
    private String title;
    @Lob
    private String lyrics;
   private String duration;
   private int ratings;
    @ManyToOne
    @JsonIgnore
    private Album album;
    @OneToMany
    private List<Comment> comments;



    public Song(String title, String lyrics, String duration, int ratings, Album album) {
        this.title = title;
        this.lyrics = lyrics;
        this.duration = duration;
        this.ratings = ratings;
        this.album = album;
    }
        public void addAlbum(Album album){
        this.album = album;
        }
        public void addComment(Comment newComment){
        if(comments == null){
            comments= new ArrayList<>();
            }
        }

    public Song () {

    }
    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getLyrics() {
        return lyrics;
    }

    public String getDuration() {
        return duration;
    }

    public int getRatings() {
        return ratings;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setLyrics(String lyrics) {
        this.lyrics = lyrics;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public void setRatings(int ratings) {
        this.ratings = ratings;
    }

    //
//     }

//    public Collection<Album> getAlbums() {
//        return album;
//    }


}


