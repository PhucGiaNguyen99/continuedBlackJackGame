package main.java;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


class PlayerTest {

    @Test
    void calculateTotalPointPlayerHand() {
        Player player1 = new Player("Phuc", "0062");

    }


    // test a void method
    @Test
    void printHandTest() {

        /* player1 = new Player("Phuc", "0062");
        player1.dealCard(new Card("2", "K", null));
        //player1.dealCard(new CardNode("5", "Q", null));
        //player1.dealCard(new CardNode("9", "J", null));

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        player1.printHand();

        String expectedOutput = "2- K";

        Assert.assertEquals(expectedOutput, outContent.toString());
*/

    }

    @Test
    void dealCard() {
    }

    @Test
    void isBusted() {
    }

    @Test
    void isBlackJack() {
    }
}