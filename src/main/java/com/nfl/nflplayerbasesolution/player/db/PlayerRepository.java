package com.nfl.nflplayerbasesolution.player.db;

import com.nfl.nflplayerbasesolution.player.domain.Player;

public interface PlayerRepository {
    Player get(String id);
}
