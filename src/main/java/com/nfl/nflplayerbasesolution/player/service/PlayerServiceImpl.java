package com.nfl.nflplayerbasesolution.player.service;

import com.nfl.nflplayerbasesolution.player.db.PlayerRepository;
import com.nfl.nflplayerbasesolution.player.domain.Player;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
class PlayerServiceImpl implements PlayerService {
    PlayerRepository playerRepository;

    @Override
    public Player get(String id) {
        return playerRepository.get(id);
    }
}
