package com.test.greyfinch.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "bird")
public class Bird implements Serializable {

    private Long id;
    private String name;
    private String size;
    private String photo;
    private String colour;

    @Id
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", photo='" + photo + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }
}
