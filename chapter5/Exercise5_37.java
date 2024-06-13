// (Decimal to binary) Write a program that prompts the user to enter a decimal
// integer then displays its corresponding binary value. Don’t use Java’s Integer.
// toBinaryString(int) in this program.
package chapter5;

import java.util.Scanner;

public class Exercise5_37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 

        System.out.print("Enter a decimal integer: ");
        int decimal = input.nextInt();

        String bits = "";
        int number = decimal;
        while (number != 0) {
            bits += number % 2;
            number = number / 2;
        }

        String bitsReversed = "";
        for (int i = 0; i < bits.length(); i++) {
            bitsReversed = bits.charAt(i) + bitsReversed;
        }

        System.out.println("The binary value of " + decimal + " is " + bitsReversed);
    }
}
