package org.wcci.apimastery.Entities;

import javax.persistence.*;

@Entity
public class Comment {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @ManyToOne
    private Album album;
//    @Column(columnDefinition = "TEXT")
//    @OneToMany(mappedBy = Comment)

//    private String date;

    protected Comment() {

    }

    public Comment(String name, Album album) {
        this.name = name;
        this.album = album;
    }
    //    public Comment(String name, String comment, String date) {
//        this.name = name;
//        this.album= album;
// //       this.date = date;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Album getAlbum(){
        return album;
    }

}

  //  public String getDate() {
 //       return date;



