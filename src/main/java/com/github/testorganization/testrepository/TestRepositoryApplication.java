package com.github.testorganization.testrepository;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TestRepositoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestRepositoryApplication.class, args);
	}
	
	@RequestMapping("/")
	public String home() {
		return"Hallo Welt";
		
	}

}

