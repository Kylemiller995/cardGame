package com.example.simonanger.cardgame;

/**
 * Created by simonanger on 07/09/2017.
 */

public enum Values {

        TWO(2),
        THREE(3),
        FOUR(4),
        FIVE(5),
        SIX(6),
        SEVEN(7),
        EIGHT(8),
        NINE(9),
        TEN(10),
        JACK(11),
        QUEEN(12),
        KING(13),
        ACE(14);

        int numericValue;

        Values(int numericValue) {
                this.numericValue = numericValue;
        }

        int getNumericValue() {
                return numericValue;
        }
}
