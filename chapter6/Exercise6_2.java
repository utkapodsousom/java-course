// (Sum the digits in an integer) Write a method that computes the sum of the digits
// in an integer.
package chapter6;

import java.util.Scanner;

public class Exercise6_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        long number = input.nextLong();
        System.out.println("THe sum of all digits in " + number + " is " + sumDigits(number));
        input.close();
    }

    public static int sumDigits(long n) {
        int sum = 0;
        while (n > 0) {
            int digit = (int) n % 10;
            sum += digit;
            n = n / 10;
        }

        return sum;
    }
}
