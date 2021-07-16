package br.com.italo.loot_analyzer.controller;

import br.com.italo.loot_analyzer.mapper.HuntingSessionMapper;
import br.com.italo.loot_analyzer.model.request.HuntingSessionRequest;
import br.com.italo.loot_analyzer.model.request.ItemsRequest;
import br.com.italo.loot_analyzer.model.response.HuntingSessionResponse;
import br.com.italo.loot_analyzer.model.response.ItemResponse;
import br.com.italo.loot_analyzer.model.response.LootResponse;
import br.com.italo.loot_analyzer.service.ItemService;
import br.com.italo.loot_analyzer.service.LootService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("hunting")
public class HuntingSessionController {


    @Autowired
    private ItemService itemService;

    @Autowired
    private LootService lootService;

    @Autowired
    private HuntingSessionMapper huntingSessionMapper;

    @PostMapping
    public HuntingSessionResponse postHuntingSession(@RequestBody HuntingSessionRequest huntingSessionRequest) {

       return huntingSessionMapper.toHuntingSessionResponse(huntingSessionRequest);

    }


    @PostMapping("/items")
    public List<ItemResponse> postHuntingSessionItems(@RequestBody HuntingSessionRequest huntingSession) {

        return itemService.sortAndRemoveStartWithASpace(huntingSession.getItems());

    }

    @PostMapping("/loot")
    public LootResponse postHuntingSessionLoot(@RequestBody List<ItemsRequest> itemsRequest) {

        return lootService.pricingItems(itemsRequest);

    }

}
