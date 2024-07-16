// (Palindrome integer) Write the methods with the following headers:
// // Return the reversal of an integer, e.g., reverse(456) re-
// turns 654
// public static int reverse(int number)
// // Return true if number is a palindrome
// public static boolean isPalindrome(int number)
// Use the reverse method to implement isPalindrome. A number is a palin-
// drome if its reversal is the same as itself. Write a test program that prompts the
// user to enter an integer and reports whether the integer is a palindrome.
package chapter6;

import java.util.Scanner;

public class Exercise6_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int inputNumber = input.nextInt();

        if (isPalindrome(inputNumber)) {
            System.out.print("The number " + inputNumber + " is "); 
        } else {
            System.out.print("The number " + inputNumber + " is not ");
        }
        System.out.println("a palindrome");
        input.close();
    }

    public static boolean isPalindrome(int number) {
        return reverse(number) == number;    
    }

    public static int reverse(int number) {
        int reversed = 0;

        while (number != 0) {
            int lastDigit = number % 10; 
            reversed = reversed * 10 + lastDigit;
            number = number / 10;
        }

        return reversed;
    }
}
