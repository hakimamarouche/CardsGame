package com.example.demo.model;

import lombok.*;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "cards")
public class Card extends BaseEntity {

    @Builder
    public Card(Long id, CardValue value, Suit suit) {
        super(id);
        this.cardValue = value;
        this.suit = suit;
    }

    @Enumerated(EnumType.STRING)
    @Column(name = "suit")
    private Suit suit;

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "card_value")
    private CardValue cardValue;

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public CardValue getValue() {
        return cardValue;
    }

    public void setValue(CardValue value) {
        this.cardValue = value;
    }
}
