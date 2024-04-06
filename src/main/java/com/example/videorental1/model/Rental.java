package com.example.videorental1.model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Rental {

    private String id;
    private Customer customer;
    private Movie movie;
    private LocalDateTime start;
    private LocalDateTime finish;
}
