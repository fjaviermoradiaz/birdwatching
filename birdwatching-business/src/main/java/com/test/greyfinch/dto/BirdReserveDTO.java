package com.test.greyfinch.dto;


public class BirdReserveDTO {

    private BirdExtendedDTO bird;
    private ReserveDTO reserve;

    public BirdExtendedDTO getBird() {
        return bird;
    }

    public void setBird(BirdExtendedDTO bird) {
        this.bird = bird;
    }

    public ReserveDTO getReserve() {
        return reserve;
    }

    public void setReserve(ReserveDTO reserve) {
        this.reserve = reserve;
    }
}
