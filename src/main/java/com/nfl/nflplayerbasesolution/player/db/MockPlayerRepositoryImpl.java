package com.nfl.nflplayerbasesolution.player.db;

import com.nfl.nflplayerbasesolution.player.domain.Player;
import org.springframework.stereotype.Repository;

@Repository
public class MockPlayerRepositoryImpl implements PlayerRepository {
    @Override
    public Player get(String id) {
        return new Player(id, "Tyreek", "Hill", "Cheetah");
    }
}
