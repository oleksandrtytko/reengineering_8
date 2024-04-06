package com.example.videorental1.model;

import lombok.Data;

@Data
public class Price {

    private String id;
    private Double rentWithoutPenalty;
    private Double priceWithoutPenalty;
    private Double priceForPenalDay;

    public Price() {
    }

    public Price(Double rentWithoutPenalty, Double priceWithoutPenalty, Double priceForPenalDay) {
        this.rentWithoutPenalty = rentWithoutPenalty;
        this.priceWithoutPenalty = priceWithoutPenalty;
        this.priceForPenalDay = priceForPenalDay;
    }
}
