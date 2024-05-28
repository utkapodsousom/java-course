// (Game: pick a card) Write a program that simulates picking a card from a deck
// of 52 cards. Your program should display the rank (Ace, 2, 3, 4, 5, 6, 7, 8, 9, 10,
// Jack, Queen, King) and suit ( Clubs, Diamonds, Hearts, Spades) of the card.
package chapter3;

public class Exercise3_24 {
    public static void main(String[] args) {
        final int CARDS_IN_DECK = 52;
        int randomCard = (int)(Math.random() * CARDS_IN_DECK);

        int rank = randomCard % 13;
        int suit = randomCard / 13;

        String rankName = "";
        String suitName = "";

        switch (rank) {
            case 0:
                rankName = "Ace";
                break;
            case 10:
                rankName = "Jack";
                break;
            case 11:
                rankName = "Queen";
                break;
            case 12:
                rankName = "King";
                break;
            default:
                rankName = "" + (rank + 1);
                break;
        }

        switch (suit) {
            case 0:
                suitName = "Clubs";
                break;
            case 1:
                suitName = "Diamonds";
                break;
            case 2:
                suitName = "Hearts";
                break;
            case 3:
                suitName = "Spades";
                break;
            default:
                break;
        }

        System.out.println("The card you picked is " + rankName + " of " + suitName);
    }
}