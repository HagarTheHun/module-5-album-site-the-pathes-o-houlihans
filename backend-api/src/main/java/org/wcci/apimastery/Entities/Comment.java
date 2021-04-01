package org.wcci.apimastery.Entities;

import javax.persistence.*;

@Entity
public class Comment {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
//    @Column(columnDefinition = "TEXT")
//    @OneToMany(mappedBy = Comment)
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

