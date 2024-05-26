package chapter3;

import java.util.Scanner;

public class Exercise3_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double dqe = b * b - 4 * a * c;
        double root1 = (-b + Math.pow(dqe, 0.5)) / (2 * a);
        double root2 = (-b - Math.pow(dqe, 0.5)) / (2 * a);

        if (dqe < 0)
            System.out.println("The equation has no real roots");
        else if (dqe == 0) {
            System.out.println("The equation has one root " + root1);
        } else {
            System.out.println("The equation has two roots " + root1 + " and " + root2); 
        }
    }
}
