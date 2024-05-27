package chapter3;

import java.util.Scanner;

public class Exercise3_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the weight of the package in pounds: ");
        double weight = input.nextDouble();

        String feedback = "The shipping cost is $";

        if (weight <= 0) {
            System.out.println("Invalid input.");
            System.exit(0);
        } else if (weight > 20) 
            System.out.println("The package cannot be shipped.");
        else if (weight <= 1)
            System.out.println(feedback + 3.5);
        else if (weight <= 3)
            System.out.println(feedback + 5.5);
        else if (weight <= 10)
            System.out.println(feedback + 8.5);
        else 
            System.out.println(feedback + 10.5);
    }
}
