package main.java;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class CardTest {

    @Test
    void testToString() {
        // random value from 1-9
        Random random = new Random();
        int randomValue = random.nextInt(10);
        Card card1 = new Card("7", "H", null);
        assertEquals("7- H", card1.toString());
    }

    @Test
    void setCard() {
    }

    @Test
    void getCardValue() {
    }

    @Test
    void compareCards() {
    }
}