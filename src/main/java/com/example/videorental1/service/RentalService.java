package com.example.videorental1.service;

import com.example.videorental1.model.Rental;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.List;

@Service
public class RentalService {

    @Autowired
    private Prices prices;

    @Autowired
    private PriceService priceService;

    private Integer getRentedDays(LocalDateTime start, LocalDateTime finish) {
        return Math.toIntExact(ChronoUnit.DAYS.between(start, finish));
    }

    public Double getTotalPrice(List<Rental> rental) {
       return rental.stream()
               .mapToDouble(r -> priceService.getPrice(getRentedDays(r.getStart(), r.getFinish()), prices.getPriceStrategyByGenre(r.getMovie().getGenre())))
               .sum();
    }
}
