// (Geometry: point in a circle?) Write a program that prompts the user to enter a
// point (x, y) and checks whether the point is within the circle centered at (0, 0)
// with radius 10. For example, (4, 5) is inside the circle and (9, 9) is outside the
// circle, as shown in Figure 3.7a.
// (Hint: A point is in the circle if its distance to (0, 0) is less than or equal to 10.
package chapter3;

import java.util.Scanner;

public class Exercise3_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a point with two coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)); 
        String mod = " ";

        if (distance > 10) {
           mod = " not "; 
        }
        
        System.out.println("Point (" + x + ", " + y + ") is" + mod + "in the circle");
    }
}
