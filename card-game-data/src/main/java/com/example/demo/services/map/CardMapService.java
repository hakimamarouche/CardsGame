package com.example.demo.services.map;

import com.example.demo.model.Card;
import com.example.demo.services.CardService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.security.acl.Owner;
import java.util.Set;

@Service
@Profile({"default", "map"})
public class CardMapService extends AbstractMapService<Card, Long> implements CardService {

    @Override
    public Set<Card> findAll() {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public void delete(Card object) {

    }

    @Override
    public Card save(Card object) {
        return super.save(object);
    }

    @Override
    public Card findById(Long id) {
        return null;
    }
}
