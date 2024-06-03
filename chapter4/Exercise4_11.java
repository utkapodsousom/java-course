// (Decimal to hex) Write a program that prompts the user to enter an integer be-
// tween 0 and 15 and displays its corresponding hex number. For an incorrect
// input number, display invalid input. 
package chapter4;

import java.util.Scanner;

public class Exercise4_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a decimal value (0 to 15): ");
        int value = input.nextInt();

        String output = "The hex value is ";

        if (0 > value || value > 15) {
            System.out.println(value + " is an invalid input");
            System.exit(1);
        }

        System.out.println(output + Integer.toHexString(value).toUpperCase());
    }
}
