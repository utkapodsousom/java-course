// (Display calendars) Write a program that prompts the user to enter the year and
// first day of the year and displays the calendar table for the year on the console. For
// example, if the user entered the year 2013, and 2 for Tuesday, January 1, 2013,
// your program should display the calendar for each month in the year,
package chapter5;

import java.util.Scanner;

public class Exercise5_29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = input.nextInt();
        System.out.print("Enter a first day of the year: ");
        int day = input.nextInt();
        int offset = day;

        String monthName = "";
        // print each month
        for (int month = 1; month <= 12; month++) {
            switch (month) {
                case 1 -> monthName = "January";
                case 2 -> monthName = "February";
                case 3 -> monthName = "March";
                case 4 -> monthName = "April";
                case 5 -> monthName = "May";
                case 6 -> monthName = "June";
                case 7 -> monthName = "July";
                case 8 -> monthName = "August";
                case 9 -> monthName = "September";
                case 10 -> monthName = "October";
                case 11 -> monthName = "November";
                case 12 -> monthName = "December";
            }

            System.out.println("                " + monthName + " " + year);
            String divider = "-".repeat(45);
            System.out.println(divider);

            int days = 31;

            switch (month) {
                case 4, 6, 9, 11:
                    days = 30;
                    break;
                case 2:
                    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
                        days = 29;
                    else
                        days = 28;
                    break;
                default:
                    offset += days;
            }

            // print day titles
            System.out.printf("%6s%6s%6s%6s%6s%6s%6s\n", "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat");
            // print days row

            for (int i = 1; i <= days; i++) {
                if (i % 7 == 0) {
                    System.out.printf("%6d\n", i);
                } else {
                    System.out.printf("%6d", i);
                }
            }

            System.out.println();
        }
    }
}
