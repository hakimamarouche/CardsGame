package com.example.demo.services.map;

import com.example.demo.model.Card;
import com.example.demo.model.Deck;
import com.example.demo.services.DeckService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.security.acl.Owner;
import java.util.Set;

@Service
@Profile({"default", "map"})
public class DeckMapService extends AbstractMapService<Deck, Long> implements DeckService {
    @Override
    public Set<Deck> findAll() {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public Deck save(Deck object) {
        return super.save(object);
    }

    @Override
    public void delete(Deck object) {

    }

    @Override
    public Deck findById(Long id) {
        return null;
    }
}
