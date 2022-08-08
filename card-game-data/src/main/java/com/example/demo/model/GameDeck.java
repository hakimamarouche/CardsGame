package com.example.demo.model;

import lombok.*;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "game_decks")
public class GameDeck extends BaseEntity {

    @Builder
    public GameDeck(Long id, Set<Deck> decks, List<Card> cards) {
        super(id);

        if(decks != null) {
            this.decks = decks;
        }

        if(cards != null) {
            this.cards = cards;
        }
    }

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Deck> decks = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Card> cards = new ArrayList<>();
}
