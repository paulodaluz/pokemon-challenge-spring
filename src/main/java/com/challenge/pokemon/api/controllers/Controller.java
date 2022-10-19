package com.challenge.pokemon.api.controllers;

import com.challenge.pokemon.api.entities.Pokemon;
import com.challenge.pokemon.api.services.PokemonService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class Controller {

	public static void main(String[] args) {
		SpringApplication.run(Controller.class, args);
	}

	@GetMapping("/pokemon/{pokemonName}")
	public Pokemon getPokemon(@PathVariable("pokemonName") String pokemon) {
		return new PokemonService().GetPokemon(pokemon);
	}
}
