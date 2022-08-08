package com.example.demo.model;

import lombok.*;

import javax.persistence.*;
import java.security.acl.Owner;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "games")
public class Game extends BaseEntity {

    @Builder
    public Game(Long id, GameDeck gameDeck, Set<Player> players) {
        super(id);
        this.gameDeck = gameDeck;

        if (players == null || players.size() > 0 ) {
            this.players = players;
        }
    }

    @OneToOne(cascade = CascadeType.ALL)
    private GameDeck gameDeck;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "game")
    private Set<Player> players = new HashSet<>();
}
