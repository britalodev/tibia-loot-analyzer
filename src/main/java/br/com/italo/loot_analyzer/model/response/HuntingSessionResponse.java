package br.com.italo.loot_analyzer.model.response;

import br.com.italo.loot_analyzer.model.Item;
import br.com.italo.loot_analyzer.model.Monster;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class HuntingSessionResponse {

    @JsonProperty("Balance")
    private String balance;

    @JsonProperty("Damage")
    private String damage;

    @JsonProperty("Damage/h")
    private String damageH;

    @JsonProperty("Healing")
    private String healing;

    @JsonProperty("Healing/h")
    private String healingH;

    @JsonProperty("Killed Monsters")
    private List<Monster> killedMonsters;

    @JsonProperty("Loot")
    private String loot;

    @JsonProperty("Looted Items")
    private List<Item> items;

    @JsonProperty("Session end")
    private String sessionEnd;

    @JsonProperty("Session length")
    private String sessionLength;

    @JsonProperty("Session start")
    private String sessionStart;

    @JsonProperty("Supplies")
    private String supplies;

    @JsonProperty("XP Gain")
    private String xpGain;

    @JsonProperty("XP/h")
    private String xpH;

}
