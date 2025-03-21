package com.mackenzie.JavaProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
public class JavaProjectApplication {
	@RestController
	public class HelloController {
	
		@GetMapping("/")
		public String hello() {
			return "API funcionando!";
		}
	}
	public static void main(String[] args) {
		SpringApplication.run(JavaProjectApplication.class, args);
	}

}
