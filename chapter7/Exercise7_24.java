// (Simulation: coupon collector’s problem) Coupon collector is a classic ­ statistics
// problem with many practical applications. The problem is to repeatedly pick
// objects from a set of objects and find out how many picks are needed for all the
// objects to be picked at least once. A variation of the problem is to pick cards from
// a shuffled deck of 52 cards repeatedly, and find out how many picks are needed
// before you see one of each suit. Assume a picked card is placed back in the deck
// Programming Exercisesbefore picking another. Write a program to simulate the number of picks needed
// to get four cards from each suit and display the four cards picked (it is possible a
// card may be picked twice).
package chapter7;

public class Exercise7_24 {
    public static void main(String[] args) {
        int deck[] = new int[51];
        String suits[] = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String ranks[] = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;
        }

        for (int i = 0; i < deck.length; i++) {
            int index = (int) (Math.random() * deck.length); 
            int temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;
        }

        boolean[] isCollected = new boolean[51];
        int uniqPics = 0, totalPicks = 0;
        while (uniqPics < 4) {
            int cardIndex = (int) (Math.random() * deck.length);
            int pickedSuit = deck[cardIndex] / 13;
            int pickedRank = deck[cardIndex] % 13; 
            
            if (!isCollected[pickedSuit]) {
                isCollected[pickedSuit] = true; 
                uniqPics++;
                System.out.println(ranks[pickedRank] + " of " + suits[pickedSuit]);
            }

            totalPicks++;
        }

        System.out.println("Number of picks: " + totalPicks);
    }
}
