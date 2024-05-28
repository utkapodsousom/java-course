// (Geometry: two circles) Write a program that prompts the user to enter the center
// coordinates and radii of two circles and determines whether the second circle
// is inside the first or overlaps with the first
package chapter3;

import java.util.Scanner;

public class Exercise3_29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter circle1's center x-, y-coordinates, and radius: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double r1 = input.nextDouble();

        System.out.print("Enter circle2's center x-, y-coordinates, and radius: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double r2 = input.nextDouble();

        double distance = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2)); 

        if (distance <= Math.abs(r1 - r2)) {
            if (r1 > r2) {
                System.out.println("circle2 is inside circle1");
            } else if (r2 > r1) {
                System.out.println("circle1 is inside circle2");
            } else {
                System.out.println("both circles are identical and are in the same spot");
            }
        } else if (distance <= r1 + r2) {
            System.out.println("circle1 overlaps circle2");
        } else {
            System.out.println("circle1 does not overlap circle2");
        }
    }
    
}
