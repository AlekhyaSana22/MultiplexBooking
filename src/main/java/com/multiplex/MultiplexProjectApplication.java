package com.multiplex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MultiplexProjectApplication {
	@GetMapping("/message")
	public String getMessage() {
		return "Welcome to MultiplexBookingSystem";
	}

	public static void main(String[] args) {
		SpringApplication.run(MultiplexProjectApplication.class, args);
	}

}
