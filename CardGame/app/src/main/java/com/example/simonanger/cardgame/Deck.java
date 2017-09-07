package com.example.simonanger.cardgame;
import java.util.Random;
import java.util.ArrayList;

/**
 * Created by simonanger on 07/09/2017.
 */

public class Deck {
    private Random randomGenerator;


    private ArrayList<Card> deck;

    public Deck() {
        deck = new ArrayList<Card>();
        randomGenerator = new Random();
        populate();
    }

    private void populate() {
        for(Suits suit: Suits.values() ){
            for(Values value: Values.values()){
                Card card = new Card(suit, value);
                deck.add(card);
            }
        }
    }

    public ArrayList<Card> getDeck() {
        return deck;
    }

    public Card deal(){
        int index = randomGenerator.nextInt(deck.size());
        return deck.get(index);
    }





}