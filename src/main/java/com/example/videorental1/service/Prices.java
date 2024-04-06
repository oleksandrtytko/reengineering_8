package com.example.videorental1.service;

import com.example.videorental1.model.Genre;
import com.example.videorental1.model.Price;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class Prices {

    // In real project active prices must be taken from db and constructed into map dynamically at the project startup
    private Map<Genre, Price> genreToPrice = new HashMap<>() {{
        put(Genre.NEW_RELEASE, new Price(1D, 2D, 3D));
        put(Genre.CHILDREN, new Price(2D, 4D, 5D));
        put(Genre.REGULAR, new Price(1D, 2D, 3D));
    }};

    public Price getPriceStrategyByGenre(Genre genre) {
        return genreToPrice.get(genre);
    }
}
