package com.lms.userservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class UserserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserserviceApplication.class, args);
	}
	@GetMapping("/studentone")
	public String studentone() {
		return "congrats sai for your first day";
	}
	@GetMapping("/studenttwo")
	public String studenttwo() {
		return "congrats bala for your first day";
	}
	@GetMapping("/studentthree")
	public String studentthree() {
		return "congrats sarmeena for your first day";
	}
}
