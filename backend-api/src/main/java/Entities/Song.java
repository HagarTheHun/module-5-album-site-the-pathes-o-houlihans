package Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Collection;

@Entity
public class Song {

    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String releaseDate;
    private boolean isSingle;
    private int duration;
//    private Artist artist;
//    private Collection<Album> albums;
//    private Collection<SongComments> songCommentSection;

    protected Song(){

    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public boolean isSingle() {
        return isSingle;
    }

    public int getDuration() {
        return duration;
    }

//    public Artist getArtist() {
//        return artist;
//    }
}
