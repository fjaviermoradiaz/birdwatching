package com.test.greyfinch.dto;

import org.springframework.stereotype.Component;

@Component
public class ReserveUpdateDTO extends ReserveDTO{

    private String region;

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}
