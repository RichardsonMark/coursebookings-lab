package com.example.codeclan.coursebookings.controllers;

import com.example.codeclan.coursebookings.repositories.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookingController {
    @Autowired
    BookingRepository bookingRepository;
}
