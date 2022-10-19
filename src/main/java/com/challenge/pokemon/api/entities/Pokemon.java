package com.challenge.pokemon.api.entities;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Generated;

import java.util.List;

@Generated
@Data
public class Pokemon {

    @JsonProperty("name")
    private String name;

    @JsonProperty("moves")
    private List<String> moves;

    @JsonProperty("type")
    private String type;

    @JsonProperty("stats")
    private PokemonStats stats;

}
