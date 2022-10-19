package com.challenge.pokemon.api.services;

import com.challenge.pokemon.api.entities.Pokemon;
import com.challenge.pokemon.api.entities.PokemonStats;
import com.challenge.pokemon.api.repository.PokemonRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PokemonService {
    public Pokemon GetPokemon(String name) {

        Pokemon pokemon = new Pokemon();

        List<String> moves = new ArrayList();
        moves.add("mega-punch");
        moves.add("toxic");

        PokemonStats stats = new PokemonStats();
        stats.setHp(50);
        stats.setAttack(50);
        stats.setDefense(50);
        stats.setSpecial_attack(50);
        stats.setSpecial_defense(50);
        stats.setSpeed(50);

        pokemon.setName(name);
        pokemon.setMoves(moves);
        pokemon.setType("electric");
        pokemon.setStats(stats);

        return pokemon;
        // return new PokemonRepository().GetPokemon("a");
    }
}
