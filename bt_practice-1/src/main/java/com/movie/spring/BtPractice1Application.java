package com.movie.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class BtPractice1Application {
	@GetMapping("/")
	public String home() {
		return "hello, world!";
	}
	public static void main(String[] args) {
		SpringApplication.run(BtPractice1Application.class, args);
		
	}

}
