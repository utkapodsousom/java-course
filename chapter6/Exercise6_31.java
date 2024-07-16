// (Financial: credit card number validation) Credit card numbers follow certain
// patterns. A credit card number must have between 13 and 16 digits. It must start
// with
// ■■ 4 for Visa cards
// ■■ 5 for Master cards
// ■■ 37 for American Express cards
// ■■ 6 for Discover cards
// In 1954, Hans Luhn of IBM proposed an algorithm for validating credit card
// numbers. The algorithm is useful to determine whether a card number is entered
// correctly, or whether a credit card is scanned correctly by a scanner. Credit card
// numbers are generated following this validity check, commonly known as the
// Luhn check or the Mod 10 check, which can be described as follows (for illustra-
// tion, consider the card number 4388576018402626):
// 1. Double every second digit from right to left. If doubling of a digit results in a
// two-digit number, add up the two digits to get a single-digit number.
// 4388576018402626
// 2 ∗ 2 = 4
// 2 ∗ 2 = 4
// 4 ∗ 2 = 8
// 1 ∗ 2 = 2
// 6 ∗ 2 = 12 (1 + 2 = 3)
// 5 ∗ 2 = 10 (1 + 0 = 1)
// 8 ∗ 2 = 16 (1 + 6 = 7)
// 4 ∗ 2 = 8
// 2. Now add all single-digit numbers from Step 1.
// 4 + 4 + 8 + 2 + 3 + 1 + 7 + 8 = 37
// 3. Add all digits in the odd places from right to left in the card number.
// 6 + 6 + 0 + 8 + 0 + 7 + 8 + 3 = 38
// 4. Sum the results from Step 2 and Step 3.
// 37 + 38 = 75
// 5. If the result from Step 4 is divisible by 10, the card number is valid; other-
// wise, it is invalid. For example, the number 4388576018402626 is invalid,
// but the number 4388576018410707 is valid.
// Write a program that prompts the user to enter a credit card number as a long
// integer. Display whether the number is valid or invalid. 
package chapter6;

import java.util.Scanner;

public class Exercise6_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter card number without spaces: ");
        long cardNumber = input.nextLong();
        System.out.print("The number you entered is ");
        if (isValid(cardNumber)) {
            System.out.println("valid");
        } else {
            System.out.println("not valid");
        }
        input.close(); }

    public static boolean isValid(long number) {
        int finalSum = sumOfDoubleEvenPlace(number) + sumOfOddPlace(number); 
        return finalSum % 10 == 0;
    }    
    
    public static int sumOfDoubleEvenPlace(long number) {
        int sum = 0;
        String numberString = Long.toString(number); 

        for (int i = numberString.length() - 2; i >= 0; i -= 2) {
            char currentDigitChar = numberString.charAt(i); 
            int currentDigit = getDigit(Character.getNumericValue(currentDigitChar) * 2);  
            sum += currentDigit;
        }

        return sum;
    }

    public static int getDigit(int number) {
        if (number < 10) {
            return number;
        } else {
            return number % 10 + 1;
        }
    }

    public static int sumOfOddPlace(long number) {
        int sum = 0;
        String numberString = Long.toString(number); 

        for (int i = numberString.length() - 1; i > 0; i -= 2) {
            char currentDigitChar = numberString.charAt(i); 
            sum += Character.getNumericValue(currentDigitChar);
        }

        return sum;
    }
    
    public static boolean prefixMatched(long number, int d) {
        return getPrefix(number, getSize(d)) == d;
    }

    public static int getSize(long d) {
        return Long.toString(d).length();
    }

    public static long getPrefix(long number, int k) {
        String zeroes = "0".repeat(getSize(number) - 1);
        long divisor = Long.parseLong(1 + zeroes);

        long result = 0;
        for (int i = 0; i < k; i++) {
            long digit = number / divisor % 10; 
            divisor = divisor / 10;
            result = result * 10 + digit;
        }

        return result;
    }
}
