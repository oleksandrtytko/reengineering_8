package com.example.videorental1.model;

import lombok.Data;

@Data
public class Movie {

    private String id;
    private String name;
    private Genre genre;

    // Movie does not contain price because in current project movie is considered as dto (price can be added to other class and saved to the db in the getTotalPrice() method)
}
