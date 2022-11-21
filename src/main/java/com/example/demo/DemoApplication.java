package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping
	public String myhello() {
		return "Hell World!";
	}

	@GetMapping("/list")
	public List<String> hello() {
		List<String> res = new ArrayList<>();
		res.add("hello");
		res.add("world");
		return res;
	}


}
