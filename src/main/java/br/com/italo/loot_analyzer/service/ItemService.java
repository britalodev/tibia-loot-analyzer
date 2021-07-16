package br.com.italo.loot_analyzer.service;

import br.com.italo.loot_analyzer.model.Item;
import br.com.italo.loot_analyzer.model.request.ItemsRequest;
import br.com.italo.loot_analyzer.model.response.ItemResponse;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Component
public class ItemService {

    int profit = 0;

    public List<ItemResponse> sortAndRemoveStartWithASpace(List<Item> items) {

        removeAandSpace(items);

        items.sort(Comparator.comparing(Item::getName));

        ArrayList<ItemResponse> itemResponses = new ArrayList<>();

        items.forEach(item -> {
            itemResponses.add(createItemResponse(item));
        });

        return itemResponses;
    }

    private ItemResponse createItemResponse(Item item) {
        return new ItemResponse() {{
            setName(item.getName());
            setCount(item.getCount());
        }};
    }

    private void removeAandSpace(List<Item> items) {
        items.forEach(item -> {
            if(item.getName().startsWith("a ")){
                item.setName(item.getName().substring(2));
            }
        });
    }
}
