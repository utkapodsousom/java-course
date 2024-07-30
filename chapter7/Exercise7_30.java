// (Pattern recognition: consecutive four equal numbers) Write the following method
// that tests whether the array has four consecutive numbers with the same value:
// public static boolean isConsecutiveFour(int[] values)
// Write a test program that prompts the user to enter a series of integers and dis-
// plays it if the series contains four consecutive numbers with the same value. Your
// program should first prompt the user to enter the input size—i.e., the number of
// values in the series.
package chapter7;

import java.util.Scanner;

public class Exercise7_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        System.out.print("Enter the number of values: ");
        int[] values = new int[input.nextInt()];
        System.out.print("Enter the values: ");
        for (int i = 0; i < values.length; i++) {
            values[i] = input.nextInt(); 
        }
        String option = isConsecutiveFour(values) ? " " : " no ";
        System.out.println("The list has" + option + "consecutive fours");
        input.close();
    }

    public static boolean isConsecutiveFour(int[] values) {
        int occurences = 1;
        for (int i = 1; i < values.length; i++) {
            if (values[i] != values[i - 1]) {
                occurences = 1;
            } else {
                occurences++;
            }
            if (occurences >= 4) {
                return true;
            }
        }
        return false;
    }
}
