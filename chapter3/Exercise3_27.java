// (Geometry: points in triangle?) Suppose a right triangle is placed in a plane as
// shown below. The right-angle point is placed at (0, 0), and the other two points
// are placed at (200, 0) and (0, 100). Write a program that prompts the user to enter
// a point with x- and y-coordinates and determines whether the point is inside the
// triangle. 
package chapter3;

import java.util.Scanner;

public class Exercise3_27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        System.out.print("Enter a point's x- and y-coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        String mod = " ";

        if (!((y > 0) && (x > 0) && (x + 2 * y < 200))) {
            mod = " not ";
        }

        System.out.println("The point is" + mod + "in the triangle");
    }

}
