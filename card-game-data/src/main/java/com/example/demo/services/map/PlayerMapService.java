package com.example.demo.services.map;

import com.example.demo.model.Card;
import com.example.demo.model.Game;
import com.example.demo.model.Player;
import com.example.demo.services.GameService;
import com.example.demo.services.PlayerService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile({"default", "map"})
public class PlayerMapService extends AbstractMapService<Player, Long> implements PlayerService {
    @Override
    public Set<Player> findAll() {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public Player save(Player object) {
        return null;
    }

    @Override
    public void delete(Player object) {

    }

    @Override
    public Player findById(Long id) {
        return null;
    }
}
