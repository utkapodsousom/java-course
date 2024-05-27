package chapter3;

import java.util.Scanner;

public class Exercise3_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter today's day: ");
        int dayNumber = input.nextInt();

        System.out.print("Enter the number of days elapsed since today: ");
        int daysFromToday = input.nextInt();

        String todayString = "";

        switch (dayNumber % 7) {
            case 0 -> todayString = "Sunday";
            case 1 -> todayString = "Monday";
            case 2 -> todayString = "Tuesday";
            case 3 -> todayString = "Wednesday";
            case 4 -> todayString = "Thursday";
            case 5 -> todayString = "Friday";
            case 6 -> todayString = "Saturday";
        }

        System.out.print("Today is " + todayString + " and the future day is ");

        switch (dayNumber + daysFromToday % 7) {
            case 0 -> System.out.println("Sunday");
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
        }
    }
}
