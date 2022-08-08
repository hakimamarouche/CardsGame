package com.example.demo.controller;

import com.example.demo.model.*;
import com.example.demo.services.CardService;
import com.example.demo.services.DeckService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/deck")
public class DeckController {

    private final DeckService deckService;
    private final CardService cardService;

    public DeckController(DeckService deckService, CardService cardService) {
        this.deckService = deckService;
        this.cardService = cardService;
    }

    @PostMapping
    public ResponseEntity<Deck> create() {

        Deck deck = new Deck();

        List<Card> cards = new ArrayList<>();

        for (CardValue value: CardValue.values()) {
            for (Suit suit: Suit.values()) {
                Card card = new Card();
                card.setSuit(suit);
                card.setValue(value);
                cards.add(cardService.save(card));
            }
        }

        deck.setCards(cards);

        deckService.save(deck);

        return new ResponseEntity<>(deck, HttpStatus.CREATED);
    }
}
