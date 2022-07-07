import main.java.CardHand;
import main.java.Card;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class CardHandTest {

    @Test
    void getStatus() {
    }

    @Test
    void isBusted() {
    }

    @Test
    void isBlackJack() {
    }

    @Test
    void calculateTotalPoint() {
        CardHand cardHand1 = new CardHand();

        // Generate 3 random numbers to put in the hand
        Random random = new Random();
        //int randNum1 = random.nextInt(14);
        //int randNum2 = random.nextInt(14);
        //int randNum3 = random.nextInt(14);
        cardHand1.addCardToHand(new Card(String.valueOf(1), "H", null));
        cardHand1.addCardToHand(new Card(String.valueOf(1), "C", null));
        //cardHand1.addCardToHand(new CardNode(String.valueOf(randNum3), "S", null));
        //cardHand1.addCardToHand(new CardNode("9", "S", null));
        assertEquals(12, cardHand1.calculateTotalPoint());
    }

    @Test
    void presentCardHand() {
    }

    @Test
    void addCardToHand() {
    }

    @Test
    void compareTo() {
    }

    @Test
    void containAce() {
        CardHand cardHand = new CardHand();
        cardHand.addCardToHand(new Card("1", "S", null));
        cardHand.addCardToHand(new Card("10", "S", null));
        assertEquals(false, cardHand.containAce());
    }

    @Test
    void main() {
    }
}