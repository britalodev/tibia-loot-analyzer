package br.com.italo.loot_analyzer.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class LootResponse {

    @JsonProperty("items")
    List<ItemResponse> items;

    @JsonProperty("total")
    private int total;

}
