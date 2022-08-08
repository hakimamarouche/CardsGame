package com.example.demo.services.map;

import com.example.demo.model.Deck;
import com.example.demo.model.GameDeck;
import com.example.demo.services.DeckService;
import com.example.demo.services.GameDeckService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile({"default", "map"})
public class GameDeckMapService extends AbstractMapService<GameDeck, Long> implements GameDeckService {
    @Override
    public Set<GameDeck> findAll() {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public GameDeck save(GameDeck object) {
        return super.save(object);
    }

    @Override
    public void delete(GameDeck object) {

    }

    @Override
    public GameDeck findById(Long id) {
        return super.findById(id);
    }
}
