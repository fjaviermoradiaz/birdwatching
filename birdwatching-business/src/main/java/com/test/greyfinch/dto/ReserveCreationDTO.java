package com.test.greyfinch.dto;

import org.springframework.stereotype.Component;
import javax.validation.constraints.NotNull;

@Component
public class ReserveCreationDTO {

    @NotNull
    private String name;

    @NotNull
    private String region;

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
}
