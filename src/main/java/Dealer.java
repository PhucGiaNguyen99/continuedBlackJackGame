package main.java;

public class Dealer {
    // Create a card hand for the dealer
    CardHand dealerHand;

    public Dealer() {
        this.dealerHand = new CardHand();
    }

    public CardHand getDealerHand() {
        return dealerHand;
    }

    public void setDealerHand(CardHand dealerHand) {
        this.dealerHand = dealerHand;
    }

    public boolean isDealerBusted() {
        return dealerHand.calculateTotalPoint() > 21;
    }

    // Add one card to the dealer hand
    public void addFront(Card card) {
        dealerHand.addCardToHand(card);
    }

    public int calculateTotalDealerHand() {
        return dealerHand.calculateTotalPoint();
    }

    public void printHand() {
        dealerHand.presentCardHand();
    }

    // Add one card to the player hand
    public void dealCardForDealer(Card cardNode) {
        this.getDealerHand().addCardToHand(cardNode);
    }

    public boolean isBusted() {
        return dealerHand.isBusted();
    }

    public boolean isBlackJack() {
        return dealerHand.isBlackJack();
    }

    // Check if there is any Ace in the dealer hand
    public boolean containAce(){
        return dealerHand.containAce();
    }
}
