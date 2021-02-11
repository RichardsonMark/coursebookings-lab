package com.example.codeclan.coursebookings.controllers;

import com.example.codeclan.coursebookings.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController{
    @Autowired
    CourseRepository courseRepository;
}
