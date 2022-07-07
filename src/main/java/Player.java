package main.java;

public class Player {
    private String name;
    private String phoneNumber;

    // card hand to hold the player's cards
    private CardHand playerHand;

    private int status;

    // constants for player's status: -1 if the player loses, 1 if he wins, 0 if he ties or 13 for the start of the game
    public static final int STATUS_LOSE = -1, STATUS_WIN = 1, STATUS_TIE = 0, STATUS_UNDETERMINED = 13;

    // initialize the player with name, phone number, an object of Card Hand and undetermined status
    public Player(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.playerHand = new CardHand();
        this.status = STATUS_UNDETERMINED;
    }

    public String getStatus() {
        switch (status) {
            case STATUS_LOSE:
                return "Lose";
            case STATUS_TIE:
                return "Tie";
            case STATUS_WIN:
                return "Win";
        }
        return "Undetermined";
    }

    // method to present status of player
    public String getResult() {
        return "Player: " + this.getName() + "\nStatus: " + this.getStatus();
    }


    // setters and getters
    public void setStatus(int status) {
        this.status = status;
    }

    public void setStatusTie() {
        setStatus(STATUS_TIE);
    }

    public void setStatusWin() {
        setStatus(STATUS_WIN);
    }

    public void setStatusLose() {
        setStatus(STATUS_LOSE);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public CardHand getPlayerHand() {
        return playerHand;
    }

    /*public void setPlayerHand(CardHand playerHand) {
        this.playerHand = playerHand;
    }*/


    // method to calculate the total point of the player's hand
    public int calculateTotalPointPlayerHand() {
        return playerHand.calculateTotalPoint();
    }

    // method to present the player hand
    public void printHand() {
        playerHand.presentCardHand();
    }

    // method to present the name and phone number of the player
    public String toString() {
        return "Name: " + name + ".  " + "Phone number: " + phoneNumber;
    }

    // add one card to the player hand
    public void dealCard(Card cardNode) {
        this.getPlayerHand().addCardToHand(cardNode);
    }

    // check if the player busted or not
    public boolean isBusted() {
        return playerHand.isBusted();
    }

    // check if the player has Blackjack or not
    public boolean isBlackJack() {
        return playerHand.isBlackJack();
    }

    public static void main(String[] args) {
        Player player1 = new Player("Phuc", "0062");
        player1.dealCard(new Card("2", "K", null));
        player1.dealCard(new Card("5", "K", null));

        player1.printHand();
        System.out.println(player1.calculateTotalPointPlayerHand());
    }
}
