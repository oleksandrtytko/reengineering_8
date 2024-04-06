package com.example.videorental1.controller;

import com.example.videorental1.model.*;
import com.example.videorental1.service.RentalService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.time.LocalDateTime;
import java.util.List;

@Controller
public class RentalController {

    @Autowired
    private RentalService rentalService;

    @PostConstruct
    public void getPrices() {

        Customer customer = new Customer();
        Movie children = new Movie();
        children.setGenre(Genre.CHILDREN);
        Rental childrenRental = new Rental();
        childrenRental.setCustomer(customer);
        childrenRental.setMovie(children);
        childrenRental.setStart(LocalDateTime.now().minusDays(12));
        childrenRental.setFinish(LocalDateTime.now());

        Movie regular = new Movie();
        regular.setGenre(Genre.REGULAR);
        Rental regularRental = new Rental();
        regularRental.setCustomer(customer);
        regularRental.setMovie(children);
        regularRental.setStart(LocalDateTime.now().minusDays(1));
        regularRental.setFinish(LocalDateTime.now());

        Movie newRelease = new Movie();
        newRelease.setGenre(Genre.NEW_RELEASE);
        Rental newReleaseRental = new Rental();
        newReleaseRental.setCustomer(customer);
        newReleaseRental.setMovie(children);
        newReleaseRental.setStart(LocalDateTime.now().minusDays(6));
        newReleaseRental.setFinish(LocalDateTime.now());

        System.out.println(rentalService.getTotalPrice(List.of(childrenRental, regularRental, newReleaseRental)));

    }

}
