package com.example.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class StudentApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentApplication.class, args);
	}

	// The run method is overridden from the CommandLineRunner interface. It is executed after the application context is loaded and right before the Spring Boot application starts. In this method, we call the displayStdDetails() method of the StudentClass bean to print the details of the student to the console.
	@Override
	public void run(String... args) throws Exception {
		stdBean().displayStdDetails();
	}

	// this bean was created to demonstrate the use of @Bean annotation in Spring Boot. It creates an instance of StudentClass with predefined values and makes it available for dependency injection throughout the application.
	@Bean
	public StudentClass stdBean() {
		return new StudentClass("John Doe", 20, "A");
	}

}
