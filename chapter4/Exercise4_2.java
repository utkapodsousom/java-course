// (Geometry: great circle distance) The great circle distance is the distance be-
// tween two points on the surface of a sphere. Let (x1, y1) and (x2, y2) be the
// ­geographical latitude and longitude of two points. The great circle distance be-
// tween the two points can be computed using the following formula:
// d = radius * arccos(sin (x 1) * sin(x2) + cos(x1) * cos(x 2) * cos(y 1 - y2))
// Write a program that prompts the user to enter the latitude and longitude of two
// points on the earth in degrees and displays its great circle distance. The average
// radius of the earth is 6,371.01 km. 
package chapter4;

import java.util.Scanner;

public class Exercise4_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double RADIUS = 6371.01;        

        System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
        double lat1 = input.nextDouble();
        double lon1 = input.nextDouble();
        System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
        double lat2 = input.nextDouble();
        double lon2 = input.nextDouble();

        double latInRadians1 = Math.toRadians(lat1);
        double lonInRadians1 = Math.toRadians(lon1);
        double latInRadians2 = Math.toRadians(lat2);
        double lonInRadians2 = Math.toRadians(lon2);

        double distance = RADIUS * Math.acos(Math.sin(latInRadians1) * 
                                             Math.sin(latInRadians2) + 
                                             Math.cos(latInRadians1) *
                                             Math.cos(latInRadians2) *
                                             Math.cos(lonInRadians1 - lonInRadians2)); 

        System.out.println("The distance between the two points is " + distance + " km");
    }
}
