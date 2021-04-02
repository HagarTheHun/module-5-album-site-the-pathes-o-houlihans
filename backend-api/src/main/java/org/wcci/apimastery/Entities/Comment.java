package org.wcci.apimastery.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class Comment {
    @Id
    @GeneratedValue
    @JsonIgnore
    private Long id;
    private String name;
    @Column(columnDefinition = "TEXT")
    private String comment;
    private String date;
    @ManyToOne
    private Album album;
    private String rating;




    protected Comment() {

    }
    public Comment(String name, String comment, String date) {
        this.name = name;
        this.comment = comment;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getComment() {
        return comment;
    }

    public String getDate() {
        return date;
    }

    public String getRating() {
        return rating;
    }
}

