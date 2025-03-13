package com.microservice.ci_cd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CiCdPracticeApplication {
	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome";
	}
	public static void main(String[] args) {
		SpringApplication.run(CiCdPracticeApplication.class, args);
	}

}
