package br.com.italo.loot_analyzer.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public abstract class Count {

    @JsonProperty("Count")
    private int count;

    @JsonProperty("Name")
    private String name;

}
