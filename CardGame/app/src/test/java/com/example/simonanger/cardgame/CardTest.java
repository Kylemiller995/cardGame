package com.example.simonanger.cardgame;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by kylemiller on 07/09/2017.
 */

public class CardTest {

    Card card1;
    Card card2;



    @Before
    public void before(){
        card1 = new Card(Suits.CLUBS, Values.QUEEN);
        card2 = new Card(Suits.DIAMONDS, Values.FIVE);
    }

    @Test
    public void testDeckSize(){


    }
}
