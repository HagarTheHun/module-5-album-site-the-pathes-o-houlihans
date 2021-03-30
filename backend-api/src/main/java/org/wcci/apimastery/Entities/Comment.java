package org.wcci.apimastery.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Comment {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @Column(columnDefinition = "TEXT")
    private String comment;
    private String date;

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
}

