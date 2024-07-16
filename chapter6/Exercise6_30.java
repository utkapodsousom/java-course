// (Game: craps) Craps is a popular dice game played in casinos. Write a program
// to play a variation of the game, as follows:
// Roll two dice. Each die has six faces representing values 1, 2, . . ., and 6, respec-
// tively. Check the sum of the two dice. If the sum is 2, 3, or 12 (called craps), you
// lose; if the sum is 7 or 11 (called natural), you win; if the sum is another value
// (i.e., 4, 5, 6, 8, 9, or 10), a point is established. Continue to roll the dice until either
// a 7 or the same point value is rolled. If 7 is rolled, you lose. Otherwise, you win.
package chapter6;

public class Exercise6_30 {
    public static void main(String[] args) {
        boolean isPlaying = true;
        boolean secondRoll = false;
        int point = 0;
        
        while (isPlaying) {
            int diceRoll1 = rollDice();
            int diceRoll2 = rollDice();
            int sum = diceRoll1 + diceRoll2;
            System.out.println("You rolled " + diceRoll1 + " + " + diceRoll2 + " = " + sum);
            
            if (!secondRoll) {
                if (sum == 2 || sum == 3 || sum == 12) {
                    System.out.println("You lose");
                    isPlaying = false;
                } else if (sum == 7 || sum == 11) {
                    System.out.println("You win"); 
                    isPlaying = false;
                } else {
                    point = sum;
                    System.out.println("point is " + point);
                    secondRoll = true;
                }
            } else {
                if (sum == 7) {
                    System.out.println("You lose");
                    isPlaying = false;
                } else if (sum == point) {
                    System.out.println("You win"); 
                    isPlaying = false;
                } else {
                    continue;
                }
            }
        }
    } 

    public static int rollDice() {
        return (int) (1 + Math.random() * 6);
    }
}
