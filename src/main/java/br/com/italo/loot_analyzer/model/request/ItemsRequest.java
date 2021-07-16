package br.com.italo.loot_analyzer.model.request;

import br.com.italo.loot_analyzer.model.Count;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ItemsRequest extends Count {

    @JsonProperty("price")
    private int price;

}
