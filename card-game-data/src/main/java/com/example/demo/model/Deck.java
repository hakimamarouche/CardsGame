package com.example.demo.model;

import lombok.*;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.security.acl.Owner;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "decks")
public class Deck extends BaseEntity {

    @Builder
    public Deck(Long id, List<Card> cards) {
        super(id);

        if (cards == null || cards.size() > 0 ) {
            this.cards = cards;
        }
    }

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Card> cards = new ArrayList<>();


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Deck)) return false;

        Deck deck = (Deck) o;

        return getId() != null ? getId().equals(deck.getId()) : deck.getId() == null;
    }

    @Override
    public int hashCode() {
        return getId() != null ? getId().hashCode() : 0;
    }
}
