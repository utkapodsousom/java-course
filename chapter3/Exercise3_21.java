// (Science: day of the week) Zeller’s congruence is an algorithm developed by
// ­Christian Zeller to calculate the day of the week. 
// Note all divisions in this exercise perform an integer division. Write a program
// that prompts the user to enter a year, month, and day of the month, and displays
// the name of the day of the week.
package chapter3;

import java.util.Scanner;

public class Exercise3_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter year: (e.g., 2012): ");
        int year = input.nextInt();

        System.out.print("Enter month: 1-12: ");
        int month = input.nextInt();

        System.out.print("Enter the day of the month: 1-31: ");
        int day = input.nextInt();

        if (month == 1) {
            month = 13;
            --year;
        }
        else if (month == 2) {
            month = 14;
            --year;
        }

        int j = year / 100;
        int k = year % 100;

        int dow = (day + (26 * (month + 1)) / 10 + k + k / 4 + j / 4 + 5 * j) % 7;

        String dayName = "";

        switch (dow) {
            case 1:
                dayName = "Sunday"; 
                break;
            case 2:
                dayName = "Monday"; 
                break;
            case 3:
                dayName = "Tuesday"; 
                break;
            case 4:
                dayName = "Wednesday"; 
                break;
            case 5:
                dayName = "Thursday"; 
                break;
            case 6:
                dayName = "Friday"; 
                break;
            case 0:
                dayName = "Saturday"; 
                break;
            default:
                break;
        }

        System.out.println("Day of the week is " + dayName);

    }
}
