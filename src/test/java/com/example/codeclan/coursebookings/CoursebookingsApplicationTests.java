package com.example.codeclan.coursebookings;

import com.example.codeclan.coursebookings.models.Booking;
import com.example.codeclan.coursebookings.models.Course;
import com.example.codeclan.coursebookings.models.Customer;
import com.example.codeclan.coursebookings.repositories.BookingRepository;
import com.example.codeclan.coursebookings.repositories.CourseRepository;
import com.example.codeclan.coursebookings.repositories.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CoursebookingsApplicationTests {

	@Autowired
	CourseRepository courseRepository;

	@Autowired
	BookingRepository bookingRepository;

	@Autowired
	CustomerRepository customerRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void canCreateAndSaveBooking() {
		Course course = new Course("Python", "Leven", 5);
		courseRepository.save(course);

		Customer customer = new Customer("Mark", "Leven", 28);
		customerRepository.save(customer);

		Booking booking = new Booking("22/02/2020", course, customer);
		bookingRepository.save(booking);

	}

}
