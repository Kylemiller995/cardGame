package com.example.simonanger.cardgame;

/**
 * Created by simonanger on 07/09/2017.
 */

public class Card {
    private Suits suits;
    private Values value;

    public Card(Suits suits, Values value) {
        this.suits = suits;
        this.value = value;
    }

    public Suits getSuits() {
        return suits;
    }

    public Values getValue() {
        return value;
    }

    public String toString(){
        return value + " of " + suits;
    }
}

//card.getValue().getNumericValue()