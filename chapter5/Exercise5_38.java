// (Decimal to octal) Write a program that prompts the user to enter a decimal
// integer and displays its corresponding octal value. Don’t use Java’s Integer.
// toOctalString(int) in this program.
package chapter5;

import java.util.Scanner;

public class Exercise5_38 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 

        System.out.print("Enter a decimal integer: ");
        int decimal = input.nextInt();

        String output = "The binary value of " + decimal + " is ";
        String octals = "";
        int number = decimal;
        while (number != 0) {
            if (decimal < 8) {
                System.out.println(output + decimal);
                System.exit(1);
            } 

            octals += number % 8;
            number = number / 8;
        }

        String octalsReversed = "";
        for (int i = 0; i < octals.length(); i++) {
            octalsReversed = octals.charAt(i) + octalsReversed;
        }

        System.out.println(output + octalsReversed);
    }
}