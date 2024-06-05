// (Find the factors of an integer) Write a program that reads an integer and dis-
// plays all its smallest factors in an increasing order. For example, if the input
// integer is 120, the output should be as follows: 2, 2, 2, 3, 5.
package chapter5;

import java.util.Scanner;

public class Exercise5_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        int factor = 2;
        String output = "";

        while (number != 1) {
            if (number % factor == 0) {
                number /= factor;
                output = output + ", " + factor;
            } else {
                factor++;
            }
        }
        System.out.println("The factors are: " + output.substring(2) + ".");
    }
}
