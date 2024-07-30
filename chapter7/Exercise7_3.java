// (Count occurrence of numbers) Write a program that reads the integers between
// 1 and 100 and counts the occurrences of each. Assume the input ends with 0. Here
// is a sample run of the program: Note that if a number occurs more than one time, the
// plural word “times” is used in the output. Numbers are displayed in increasing order.
package chapter7;

import java.util.Scanner;

public class Exercise7_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        System.out.print("Enter the integers between 1 and 100: ");

        int[] numbers = new int[0];
        
        while (input.hasNextInt()) {
            int currentNumber = input.nextInt();
            if (currentNumber != 0) {
                numbers = pushNumber(numbers, currentNumber);
            } else {
                break;
            }
        }

        // TODO: go back to this exercise later because it is incorrect

        int searchNumber = 0; int searchCount = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (searchNumber != numbers[i] && numbers[i] != 0) {
                searchNumber = numbers[i];
            }

            for (int j = i; j < numbers.length; j++) {
                if (searchNumber == numbers[j]) {
                    searchCount++;
                    numbers[j] = 0;
                }
            }

            System.out.print(searchNumber + " occurs " + searchCount);
            if (searchCount > 1) {
                System.out.println(" times");
            } else {
                System.out.println(" time");
            }

            searchCount = 0;
        }

        input.close();
    }

    public static int[] pushNumber(int[] array, int number) {
        int[] result = new int[array.length + 1];
        System.arraycopy(array, 0, result, 0, array.length);
        result[result.length - 1] = number;
        return result;
    }
}
