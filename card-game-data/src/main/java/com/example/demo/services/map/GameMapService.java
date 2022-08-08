package com.example.demo.services.map;

import com.example.demo.model.Card;
import com.example.demo.model.Game;
import com.example.demo.model.GameDeck;
import com.example.demo.services.GameDeckService;
import com.example.demo.services.GameService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile({"default", "map"})
public class GameMapService extends AbstractMapService<Game, Long> implements GameService {
    @Override
    public Set<Game> findAll() {
        return null;
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Game save(Game object) {
        return super.save(object);
    }

    @Override
    public void delete(Game object) {

    }

    @Override
    public Game findById(Long id) {
        return null;
    }
}
