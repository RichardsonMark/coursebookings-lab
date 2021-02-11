package com.example.codeclan.coursebookings;

import com.example.codeclan.coursebookings.models.Course;
import com.example.codeclan.coursebookings.repositories.CourseRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CoursebookingsApplicationTests {

	@Autowired
	CourseRepository courseRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void canCreateAndSaveBooking() {
		Course course = new Course("Python", "Leven", 5);
		courseRepository.save(course);

	}

}
