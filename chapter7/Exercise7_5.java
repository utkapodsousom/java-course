// (Print distinct numbers) Write a program that reads in 10 numbers and displays the
// number of distinct numbers and the distinct numbers in their input order and sepa-
// rated by exactly one space (i.e., if a number appears multiple times, it is displayed
// only once). (Hint: Read a number and store it to an array if it is new. If the number is
// already in the array, ignore it.) After the input, the array contains the distinct numbers.
package chapter7;

import java.util.Scanner;

public class Exercise7_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        int[] numbers = new int[10];
        System.out.print("Enter 10 numbers: ");

        int currentInt, j, k = 0, index = 0;
        while (k < 10) {
            currentInt = input.nextInt();
            k++;

            for (j = 0; j <= index; j++) {
                if (numbers[j] == currentInt) {
                    break; 
                }
            }

            if (j - index == 1) {
                numbers[index] = currentInt;
                index++;
            }
        }
        
        System.out.println("The number of distinct numbers is: " + index); 
        System.out.print("The distinct numbers are: ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                continue;
            } else {
                System.out.print(numbers[i] + " ");
            }
        }
        System.out.println();
        
        input.close();
    }
}
