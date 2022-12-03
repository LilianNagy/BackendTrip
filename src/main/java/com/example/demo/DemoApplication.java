package com.example.demo;

import com.example.demo.DataInterface.StationDataAccess;
import com.example.demo.Modells.Station;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class DemoApplication {

	@GetMapping(path = "/welcome")
	public String Welcome(){

		return ("Hello");
	}

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
	}




}
