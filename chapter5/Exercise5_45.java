// (Statistics: compute mean and standard deviation) In business applications, you
// are often asked to compute the mean and standard deviation of data. The mean is
// simply the average of the numbers. The standard deviation is a statistic that tells
// you how tightly all the various data are clustered around the mean in a set of data.
// For example, what is the average age of the students in a class? How close are the
// ages? If all the students are the same age, the deviation is 0.
package chapter5;

import java.util.Scanner;

public class Exercise5_45 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 10 numbers: ");
        final int NUMBERS = 10;

        double[] numbers = new double[NUMBERS];
        double mean = 0;
        double deviation = 0;
        for (int i = 0; i < NUMBERS; i++) {
            double currentNumber = input.nextDouble(); 
            numbers[i] = currentNumber;
            mean += currentNumber; 
        }

        mean = mean / NUMBERS;

        for (int i = 0; i < NUMBERS; i++) {
            deviation += Math.pow(numbers[i] - mean, 2); 
        }
        deviation = Math.sqrt(deviation / (NUMBERS - 1));

        System.out.println("The mean is " + mean);
        System.out.printf("The standard deviation is %.5f\n", deviation);
    }    
}
