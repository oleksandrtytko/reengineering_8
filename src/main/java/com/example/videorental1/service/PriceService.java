package com.example.videorental1.service;

import com.example.videorental1.model.Price;
import org.springframework.stereotype.Service;

@Service
public class PriceService {

    public Double getPrice(Integer daysRented, Price price) {
        return daysRented <= price.getRentWithoutPenalty() ? price.getPriceWithoutPenalty() : price.getPriceForPenalDay() * (daysRented - price.getRentWithoutPenalty());
    }
}
