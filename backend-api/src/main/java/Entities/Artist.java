package Entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Artist {
    @Id
    @GeneratedValue
    private Long id;
    private String name;

    public Artist(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    protected Artist(){

    }

}
