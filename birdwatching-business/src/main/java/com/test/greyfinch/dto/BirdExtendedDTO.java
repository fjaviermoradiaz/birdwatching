package com.test.greyfinch.dto;

import org.springframework.stereotype.Component;

@Component
public class BirdExtendedDTO extends BirdDTO{

    private String size;
    private String photo;
    private String[] colour;

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

    public String[] getColour() {
        return colour;
    }

    public void setColour(String[] colour) {
        this.colour = colour;
    }
}
