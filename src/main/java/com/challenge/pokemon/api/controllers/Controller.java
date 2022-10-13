package com.challenge.pokemon.api.controllers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Controller {

	public static void main(String[] args) {
		SpringApplication.run(Controller.class, args);
	}

	@GetMapping("/pokemon")
	public String hello(String name) {
		return String.format("Hello World");
	}
}
