package com.example.demo.controller;

import com.example.demo.model.*;
import com.example.demo.services.DeckService;
import com.example.demo.services.GameDeckService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/game-decks")
public class GameDeckController {

    private final GameDeckService gameDeckService;

    public GameDeckController(GameDeckService gameDeckService) {
        this.gameDeckService = gameDeckService;
    }

    @PostMapping
    public ResponseEntity<GameDeck> create() {
        return new ResponseEntity<>(gameDeckService.save(new GameDeck()), HttpStatus.CREATED);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<GameDeck> addDeck(@RequestBody GameDeck requestGameDeck, @PathVariable("id") Long id) {
        
        GameDeck gameDeck = gameDeckService.findById(id);
        for (Deck deck: requestGameDeck.getDecks()) {
            // TODO 2022-08-08 amarouch : verify if deck exists in db and is the same
            if (!gameDeck.getDecks().contains(deck)) {
                gameDeck.getDecks().add(deck);
                gameDeck.getCards().addAll(deck.getCards());
            }
        }

        gameDeckService.save(gameDeck);

        return new ResponseEntity<>(gameDeck, HttpStatus.OK);
    }

}
