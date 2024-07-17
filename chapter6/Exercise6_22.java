// (Math: approximate the square root) There are several techniques for implementing the sqrt method in the Math class. One such technique is known as the
// Babylonian method. It approximates the square root of a number, n, by repeatedly performing the calculation using the following formula:
// nextGuess = (lastGuess + n / lastGuess) / 2
// When nextGuess and lastGuess are almost identical, nextGuess is the
// approximated square root. The initial guess can be any positive value (e.g., 1).
// This value will be the starting value for lastGuess. If the difference between
// nextGuess and lastGuess is less than a very small number, such as 0.0001,
// you can claim that nextGuess is the approximated square root of n. If not,
// nextGuess becomes lastGuess and the approximation process continues.
// Implement the following method that returns the square root of n:
// public static double sqrt(long n)
package chapter6;

import java.util.Scanner;

public class Exercise6_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive double value: ");
        long number = input.nextLong();

        System.out.println("The approximate square root of " + number + " is " + sqrt(number));
        input.close();
    }

    public static double sqrt(long n) {
        double lastGuess = 1;
        double nextGuess = 0;

        while (true) {
            nextGuess = (lastGuess + n / lastGuess) / 2;
            if (difference(lastGuess, nextGuess) < 0.0001) {
                return nextGuess;
            }
            lastGuess = nextGuess; 
        }
    }

    public static double difference(double a, double b) {
        if (a > b) {
            return a - b;
        } else if (a < b) {
            return b - a;
        } else {
            return 0;
        }
    }
}
