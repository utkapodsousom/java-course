// (Geometry: area of a pentagon) Write a program that prompts the user to enter
// the length from the center of a pentagon to a vertex and computes the area of the
// pentagon
package chapter4;

import java.util.Scanner;

public class Exercise4_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length from the center to a vertex: ");
        double length = input.nextDouble();
        double side = 2 * length * Math.sin(Math.PI / 5);
        double area = (5 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 5));

        System.out.println("The area of the pentagin is " + (int)(area * 100) / 100.0);
    } 
}
