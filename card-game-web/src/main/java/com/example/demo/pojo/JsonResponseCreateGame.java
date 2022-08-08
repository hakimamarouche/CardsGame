package com.example.demo.pojo;

import com.example.demo.model.Game;

public class JsonResponseCreateGame extends JsonResponse {
    private Game game;

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }
}
