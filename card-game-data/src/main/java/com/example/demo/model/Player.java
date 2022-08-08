package com.example.demo.model;

import lombok.*;

import javax.persistence.*;
import java.security.acl.Owner;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "players")
public class Player extends BaseEntity{

    @Builder
    public Player(Long id, String name, Game game, Set<Card> cards) {
        super(id);
        this.name = name;
        this.game = game;

        if (cards == null || cards.size() > 0 ) {
            this.cards = cards;
        }
    }

    @Column(name = "name")
    private String name;

    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private Set<Card> cards = new HashSet<>();

    @ManyToOne
    private Game game;
}
