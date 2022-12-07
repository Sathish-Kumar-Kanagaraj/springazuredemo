package com.sathish.springazuredemo.springazuredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringazuredemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringazuredemoApplication.class, args);
	}

	@GetMapping("/messages")
	public String message() {
		return "Success Az";
	}

}
