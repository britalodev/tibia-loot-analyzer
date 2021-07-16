package br.com.italo.loot_analyzer.mapper;

import br.com.italo.loot_analyzer.model.request.HuntingSessionRequest;
import br.com.italo.loot_analyzer.model.response.HuntingSessionResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface HuntingSessionMapper {

    @Mapping(source = "balance", target = "balance")
    @Mapping(source = "damage", target = "damage")
    @Mapping(source = "healing", target = "healing")
    @Mapping(source = "healingH", target = "healingH")
    @Mapping(source = "killedMonsters", target = "killedMonsters")
    @Mapping(source = "loot", target = "loot")
    @Mapping(source = "items", target = "items")
    @Mapping(source = "sessionEnd", target = "sessionEnd")
    @Mapping(source = "sessionLength", target = "sessionLength")
    @Mapping(source = "sessionStart", target = "sessionStart")
    @Mapping(source = "supplies", target = "supplies")
    @Mapping(source = "xpGain", target = "xpGain")
    @Mapping(source = "xpH", target = "xpH")
    HuntingSessionResponse toHuntingSessionResponse(HuntingSessionRequest huntingSessionRequest);

}
