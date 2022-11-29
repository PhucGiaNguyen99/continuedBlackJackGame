package main.java;

import java.util.ArrayList;

public class GameDriver {
    private int numOfPlayers;

    // the first element of playersList is for Dealer, so adding players from index 1
    private ArrayList<Player> playersList;

    // index to control the turn of players and initialize turnIndex to 1
    private int turnIndex;

    private Deck deck;

    // create an object for dealer with empty name and phone number
    private Player dealer = new Player("", "", true);

    // a boolean to keep track whether the game is finished or ongoing
    private boolean isGameFinished;

    private ArrayList<Player> winnersArrayList; // DELETE. Use player status to keep track of whether player is Black Jack or busted


    // Control the whole game
    public void initGame(ArrayList<Player> players, int deckCount) {

        // initialize the turn index to 0
        turnIndex = 0;
        numOfPlayers = players.size();
        pla
    }
}
