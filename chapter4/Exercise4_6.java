// (Random points on a circle) Write a program that generates three random points
// on a circle centered at (0, 0) with radius 40 and displays three angles in a ­triangle
// formed by these three points,
package chapter4;

public class Exercise4_6 {
    public static void main(String[] args) {
        double angle1 = Math.random() * 360;
        double angle2 = Math.random() * 360;
        double angle3 = Math.random() * 360;

        final double RADIUS = 40;

        double x1 = RADIUS * Math.cos(angle1);
        double y1 = RADIUS * Math.sin(angle1);
        double x2 = RADIUS * Math.cos(angle2);
        double y2 = RADIUS * Math.sin(angle2);
        double x3 = RADIUS * Math.cos(angle3);
        double y3 = RADIUS * Math.sin(angle3);

        System.out.println("Point 1 is (" + x1 + ", " + y1 + ")");
        System.out.println("Point 2 is (" + x2 + ", " + y2 + ")");
        System.out.println("Point 3 is (" + x3 + ", " + y3 + ")");
    }
}
