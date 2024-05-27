package chapter3;

import java.util.Scanner;

public class Exercise3_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a month and a year: ");
        int month = input.nextInt();
        int year = input.nextInt();

        String monthName = "";

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
            default -> System.out.println("Invalid month number");
        }

        System.out.println(monthName + " " + year + " has ");

        int days = 31;

        switch (month) {
            case 4, 6, 9, 11: days = 30; break;
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) 
                    days = 29; 
                else
                    days = 28;
            break;
        }

        System.out.println(days + " days");
    }
}
