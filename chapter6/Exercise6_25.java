// (Convert milliseconds to hours, minutes, and seconds) Write a method that con-
// verts milliseconds to hours, minutes, and seconds using the following header:
// public static String convertMillis(long millis)
// The method returns a string as hours:minutes:seconds. For example, con-
// vertMillis(5500) returns a string 0:0:5, convertMillis(100000)
// returns a string 0:1:40, and convertMillis(555550000) returns a string
// 154:19:10. Write a test program that prompts the user to enter a long integer
// for milliseconds and displays a string in the format of hours:minutes:seconds.
package chapter6;

import java.util.Scanner;

public class Exercise6_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);        
        System.out.print("Enter long integer for milliseconds: ");
        long millis = input.nextLong();

        System.out.println(convertMillis(millis));
        input.close();
    }

    public static String convertMillis(long millis) {
        String result = "";

        int totalSeconds = (int) (millis / 1000);
        int seconds = totalSeconds % 60;
        totalSeconds = totalSeconds - seconds;
        int totalMinutes = totalSeconds / 60;
        int minutes = totalMinutes % 60;
        totalMinutes = totalMinutes - minutes;
        int totalHours = totalMinutes / 60;

        result = totalHours + ":" + minutes + ":" + seconds;
        return result;
    } 
}
