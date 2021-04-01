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

    public void setImg(String img) {
        this.img = img;
    }

    public void changeName(String newName) {
        this.name = newName;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        Album album = (Album) o;
//
//        if (name != null ? !name.equals(album.name) : album.name != null) return false;
//        if (artist != null ? !artist.equals(album.artist) : album.artist != null) return false;
//        return img != null ? img.equals(album.img) : album.img == null;
//    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (artist != null ? artist.hashCode() : 0);
        result = 31 * result + (img != null ? img.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Album{" +
                "name='" + name + '\'' +
                ", artist='" + artist + '\'' +
                ", img='" + img + '\'' +
                '}';
    }

    //    @Override
//    public int hashCode() {
//        return super.hashCode();
//    }

//    @Override
//    public boolean equals(Object obj) {
//        return super.equals(obj);
//    }
}

