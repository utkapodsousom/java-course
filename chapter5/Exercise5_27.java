// (Display leap years) Write a program that displays all the leap years, 10 per line,
// from 101 to 2100, separated by exactly one space. Also display the number of
// leap years in this period.
package chapter5;

public class Exercise5_27 {
    public static void main(String[] args) {
        final int YEARS_PER_LINE = 10;
        int leapCount = 0;

        for (int i = 101; i <= 2100; i++) {
            boolean isLeapYear = (i % 4 == 0 && i % 100 != 0) || (i % 400 == 0);

            if (isLeapYear) {
                leapCount++;

                if (leapCount % YEARS_PER_LINE == 0) {
                    System.out.println(i);
                } else {
                    System.out.print(i + " ");
                }
            }            
        }

        System.out.println();
        System.out.println("The number of leap years is " + leapCount);
    }
}
