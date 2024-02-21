package com.nfl.nflplayerbasesolution.player.web;

import com.nfl.nflplayerbasesolution.player.domain.Player;
import com.nfl.nflplayerbasesolution.player.service.PlayerService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/player")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
class PlayerController {
    PlayerService playerService;

    @GetMapping("/{id}")
    Player get(@PathVariable("id") String id){
        return playerService.get(id);
    }
}
