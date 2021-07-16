package br.com.italo.loot_analyzer.service;

import br.com.italo.loot_analyzer.model.request.ItemsRequest;
import br.com.italo.loot_analyzer.model.response.ItemResponse;
import br.com.italo.loot_analyzer.model.response.LootResponse;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class LootService {

    private int profit = 0;


    public LootResponse pricingItems(List<ItemsRequest> items){

        profit = 0;
        LootResponse lootResponse = new LootResponse();
        ArrayList<ItemResponse> itemResponses = new ArrayList<>();

        items.forEach(item -> {
            itemResponses.add(createItemResponse(item));
        });

        itemResponses.forEach(item -> profit = item.getPrice()+ profit);

        lootResponse.setItems(itemResponses);
        lootResponse.setTotal(profit);

        return lootResponse;
    }


    private ItemResponse createItemResponse(ItemsRequest itemsRequest) {
        return new ItemResponse() {{
            setName(itemsRequest.getName());
            setCount(itemsRequest.getCount());
            setPrice(itemsRequest.getCount()*itemsRequest.getPrice());
        }};
    }

}
