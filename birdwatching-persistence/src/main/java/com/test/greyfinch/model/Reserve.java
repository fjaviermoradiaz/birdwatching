package com.test.greyfinch.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "reserve")
public class Reserve implements Serializable {

    private Long id;
    private String name;
    private String region;

    public Reserve() {
    }

    public Reserve(Long id, String name, String region) {
        this.id = id;
        this.name = name;
        this.region = region;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Override
    public String toString() {
        return "Reserve{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", region='" + region + '\'' +
                '}';
    }
}
