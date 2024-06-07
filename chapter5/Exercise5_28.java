// (Display the first days of each month) Write a program that prompts the user to
// enter the year and first day of the year, then displays the first day of each month
// in the year. For example, if the user entered the year 2013, and 2 for Tuesday,
// January 1, 2013, your program should display the following output:
// January 1, 2013 is Tuesday
// ...
// December 1, 2013 is Sunday
package chapter5;

import java.util.Scanner;

public class Exercise5_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = input.nextInt();
        System.out.print("Enter a first day of the year: ");
        int day = input.nextInt();

        for (int month = 0; month < 12; month++) {
            switch (month) {
                case 4, 6, 9, 11:
                    day += 30;
                    break;
                case 2:
                    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
                        day += 29;
                    else
                        day += 28;
                    break;
                case 1, 3, 5, 7, 8, 10:
                    day += 31;
            }


            String monthName = "";
            switch (month) {
                case 0 -> monthName = "January";
                case 1 -> monthName = "February";
                case 2 -> monthName = "March";
                case 3 -> monthName = "April";
                case 4 -> monthName = "May";
                case 5 -> monthName = "June";
                case 6 -> monthName = "July";
                case 7 -> monthName = "August";
                case 8 -> monthName = "September";
                case 9 -> monthName = "October";
                case 10 -> monthName = "November";
                case 11 -> monthName = "December";
            }

            String dayName = "";
            switch (day % 7) {
                case 1:
                    dayName = "Monday";
                    break;
                case 2:
                    dayName = "Tuesday";
                    break;
                case 3:
                    dayName = "Wednesday";
                    break;
                case 4:
                    dayName = "Thursday";
                    break;
                case 5:
                    dayName = "Friday";
                    break;
                case 6:
                    dayName = "Saturday";
                    break;
                case 0:
                    dayName = "Sunday";
                    break;
                default:
                    break;
            }

            System.out.println(monthName + " 1, " + year + " is " + dayName);
        }
    }
}
