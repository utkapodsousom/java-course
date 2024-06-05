// (Count positive and negative numbers and compute the average of numbers)
// Write a program that reads an unspecified number of integers, determines how
// many positive and negative values have been read, and computes the total and av-
// erage of the input values (not counting zeros). Your program ends with the input
// 0. Display the average as a floating-point number. 
package chapter5;

import java.util.Scanner;

public class Exercise5_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer, the input ends if it is 0: ");

        int positives = 0;
        int negatives = 0;
        float total = 0;
        float average = 0;
        int data = input.nextInt();

        if (data == 0) {
            System.out.println("No numbers entered except 0"); 
            System.exit(1);
        }

        while (data != 0) {
            if (data > 0) {
                positives++;
            } else {
                negatives++;
            }

            total += data;
            data = input.nextInt();
        }

        average = total / (positives + negatives);

        System.out.println("The number of positives is " + positives);
        System.out.println("The number of negatives is " + negatives);
        System.out.println("The total is " + total);
        System.out.println("The average is " + average);
    }
}
