// (Geography: estimate areas) Use the GPS locations for Atlanta, Georgia;
// Orlando, Florida; Savannah, Georgia; and Charlotte, North Carolina in the fig-
// ure in Section 4.1 to compute the estimated area enclosed by these four cities.
package chapter4;

public class Exercise4_3 {
    public static void main(String[] args) {
        final double RADIUS = 6371.01;        
        final double LAT_A = Math.toRadians(33.7489954);
        final double LON_A = Math.toRadians(-84.3879824); 
        final double LAT_C = Math.toRadians(35.2270869);
        final double LON_C = Math.toRadians(-80.8431267);
        final double LAT_O = Math.toRadians(28.5383355); 
        final double LON_O = Math.toRadians(-81.3792365); 
        final double LAT_S = Math.toRadians(32.0835407); 
        final double LON_S = Math.toRadians(-81.0998342); 

        // triangle 1: C - S - O 
        double distanceCtoS = RADIUS * Math.acos(Math.sin(LAT_C) * 
                                                 Math.sin(LAT_S) + 
                                                 Math.cos(LAT_C) *
                                                 Math.cos(LAT_S) *
                                                 Math.cos(LON_C - LON_S)); 

        double distanceStoO = RADIUS * Math.acos(Math.sin(LAT_S) * 
                                                 Math.sin(LAT_O) + 
                                                 Math.cos(LAT_S) *
                                                 Math.cos(LAT_O) *
                                                 Math.cos(LON_S - LON_O)); 

        double distanceCtoO = RADIUS * Math.acos(Math.sin(LAT_C) * 
                                                 Math.sin(LAT_O) + 
                                                 Math.cos(LAT_C) *
                                                 Math.cos(LAT_O) *
                                                 Math.cos(LON_C - LON_O)); 
        // triangle 2: O - A - C - O
        double distanceOtoA = RADIUS * Math.acos(Math.sin(LAT_O) * 
                                                 Math.sin(LAT_A) + 
                                                 Math.cos(LAT_O) *
                                                 Math.cos(LAT_A) *
                                                 Math.cos(LON_O - LON_A)); 

        double distanceAtoC = RADIUS * Math.acos(Math.sin(LAT_A) * 
                                                 Math.sin(LAT_C) + 
                                                 Math.cos(LAT_A) *
                                                 Math.cos(LAT_C) *
                                                 Math.cos(LON_A - LON_C)); 

        double s1 = (distanceCtoS + distanceStoO + distanceCtoO) / 2;
        double s2 = (distanceOtoA + distanceAtoC + distanceCtoO) / 2;

        double area1 = Math.sqrt(s1 * (s1 - distanceCtoS) * (s1 - distanceStoO) * (s1 - distanceCtoO));
        double area2 = Math.sqrt(s1 * (s2 - distanceOtoA) * (s2 - distanceAtoC) * (s2 - distanceCtoO));

        System.out.println("The area that the cities cover is " + (int)((area1 + area2) * 100) / 100.0 + " km");
    }    
}
