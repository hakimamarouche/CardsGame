package com.example.demo.model;

public enum CardValue {

    ACE(1L),
    TWO(2L),
    THREE(3L),
    FOUR(4L),
    FIVE(5L),
    SIX(6L),
    SEVEN(7L),
    EIGHT(8L),
    NINE(9L),
    TEN(10L),
    JACK(11L),
    QUEEN(12L),
    KING(13L);

    private final Long cardValue;

    CardValue(Long cardValue) {
        this.cardValue = cardValue;
    }

    public Long getCardValue() {
        return cardValue;
    }
}
