// (Game: hangman) Write a hangman game that randomly generates a word and
// prompts the user to guess one letter at a time, as presented in the sample run.
// Each letter in the word is displayed as an asterisk. When the user makes a correct
// guess, the actual letter is then displayed. When the user finishes a word, display
// the number of misses and ask the user whether to continue to play with another
// word. Declare an array to store words, as follows:
// // Add any words you wish in this array
// String[] words = {"write", "that",...};
package chapter7;

import java.util.*;

public class Exercise7_35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = {"journey", "beautiful", "elephant", "adventure", "butterfly", "hospital", "freedom", "mountain", "sunshine", "chocolate"}; 

        do {
            String randomWord = words[(int) (Math.random() * words.length)];
            String maskedWord = "*".repeat(randomWord.length());
            int mistakes = 0;
            while (!maskedWord.equals(randomWord)) {
                System.out.print("(Guess) Enter a letter in word " + maskedWord + " > ");
                String letter = input.next();
                if (!randomWord.contains(letter)) {
                    mistakes++;
                    System.out.println("     " + letter + " is not in the word");
                } else {
                    if (maskedWord.contains(letter)) {
                        System.out.println("     " + letter + " is alreay in the word");
                    } else {
                        for (int i = 0; i < randomWord.length(); i++) {
                            if (randomWord.charAt(i) == letter.charAt(0)) {
                                maskedWord = unmaskLetter(maskedWord, letter.charAt(0), i); 
                            }
                        }
                    }
                }
            }
            String option = (mistakes > 1) ? "times" : "time";        
            System.out.print("The word is " + randomWord);
            if (mistakes > 0) {
                System.out.print(" . You missed " + mistakes + " " + option);
            }
            System.out.print("\nDo you want to guess another word? Enter y or n> ");
        } while (input.next().equals("y"));
        input.close();
    }

    public static String unmaskLetter(String word, char letter, int index) {
        char[] chars = word.toCharArray();
        chars[index] = letter;
        return String.valueOf(chars);
    }

    public static void startGame() {

    }
}