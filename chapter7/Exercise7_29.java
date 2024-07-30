// (Game: pick four cards) Write a program that picks four cards from a deck of 52
// cards and computes their sum. An Ace, King, Queen, and Jack represent 1, 13, 12,
// and 11, respectively. Your program should display the number of picks that yields
// the sum of 24.
package chapter7;

import java.util.Arrays;

public class Exercise7_29 {
    public static void main(String[] args) {
        int deck[] = new int[51];
        String ranks[] = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        final int SUM_OF_CARDS = 24;

        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;
        }

        for (int i = 0; i < deck.length; i++) {
            int index = (int) (Math.random() * deck.length); 
            int temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;
        }

        int[] listCards = new int[4];
        int totalPicks = 0, sum = 0;
        while (sum != SUM_OF_CARDS) {
            Arrays.fill(listCards, 0);
            sum = 0;
            for (int i = 0; i < listCards.length; i++) {
                int cardIndex = (int) (Math.random() * deck.length);
                int pickedRank = deck[cardIndex] % 13; 
                sum += pickedRank + 1;
                listCards[i] = pickedRank;
                totalPicks++;
            }
        }

        System.out.print("You picked ");
        for (int i = 0; i < listCards.length; i++) {
            System.out.print(ranks[listCards[i]] + " ");
        }
        System.out.println();
        System.out.println("Number of picks: " + totalPicks);
    }
}
