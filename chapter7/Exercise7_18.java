// (Bubble sort) Write a sort method that uses the bubble-sort algorithm. The
// ­bubble-sort algorithm makes several passes through the array. On each pass, suc-
// cessive neighboring pairs are compared. If a pair is not in order, its values are
// swapped; otherwise, the values remain unchanged. The technique is called a bub-
// ble sort or sinking sort because the smaller values gradually “bubble” their way to
// the top, and the larger values “sink” to the bottom. Write a test program that reads
// in 10 double numbers, invokes the method, and displays the sorted numbers.
package chapter7;

import java.util.Scanner;

public class Exercise7_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];
        System.out.print("Enter 10 double numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }
        
        bubbleSort(numbers);

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        input.close();
    }

    public static void bubbleSort(double[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    double temp = array[j]; 
                    array[j] = array[i];
                    array[i] = temp;
                } 
            }
        }
    } 
}
