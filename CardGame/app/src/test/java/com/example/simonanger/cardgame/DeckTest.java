package com.example.simonanger.cardgame;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static junit.framework.Assert.assertEquals;

/**
 * Created by kylemiller on 07/09/2017.
 */

public class DeckTest {

    Card card1;
    Card card2;
    Deck deck;
    Card spyCard1;
    Card spyCard2;

    @Before
    public void before(){
        card1 = new Card(Suits.CLUBS, Values.QUEEN);
        card2 = new Card(Suits.DIAMONDS, Values.FIVE);
        deck = new Deck();
        spyCard1 = Mockito.spy(card1);
        spyCard2 = Mockito.spy(card2);
    }

    @Test
    public void testDeckSize() {
        assertEquals(52, deck.getDeck().size());

    }

//   

    }


