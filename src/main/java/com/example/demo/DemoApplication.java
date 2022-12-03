package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	@GetMapping(path = "/welcome")
	public String Welcome(){

		return ("Hello");
	}

	public static void main(String[] args) {
<<<<<<< Updated upstream
=======


>>>>>>> Stashed changes
		SpringApplication.run(DemoApplication.class, args);
	}

}
