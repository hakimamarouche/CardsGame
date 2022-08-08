package com.example.demo.controller;

import com.example.demo.model.Game;
import com.example.demo.pojo.JsonResponseCreateGame;
import com.example.demo.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

@RestController
@RequestMapping("/games")
public class GamesController {

    private final GameService gameService;

    public GamesController(GameService gameService) {
        this.gameService = gameService;
    }

    @PostMapping
    public ResponseEntity<Game> create() {
        return new ResponseEntity<>(gameService.save(new Game()), HttpStatus.CREATED);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity deleteById(@PathVariable("id") Long id) {

        gameService.deleteById(id);

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }


}
