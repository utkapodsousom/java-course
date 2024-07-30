// (Sorted?) Write the following method that returns true if the list is already sorted
// in nondecreasing order:
// 		public static boolean isSorted(int[] list)
// Write a test program that prompts the user to enter a list and displays whether the
// list is sorted or not. 
package chapter7;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise7_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        System.out.print("Enter the size of the list: ");
        int[] list = new int[input.nextInt()];
        System.out.print("Enter the contents of the list: ");
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }
        System.out.print("The list has " + list.length + " integers ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
        System.out.print("The list is ");
        if (isSorted(list)) {
            System.out.print("already sorted"); 
        } else {
            System.out.print("not sorted");
        }
        System.out.println();
        input.close();
    }

    public static boolean isSorted(int[] list) {
        return Arrays.equals(list, selectionSort(list));
    }

    public static int[] selectionSort(int[] list) {
        int[] resultList = new int[list.length];
        System.arraycopy(list, 0, resultList, 0, list.length);
        for (int i = 0; i < resultList.length - 1; i++) {
            int currentMin = resultList[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < resultList.length; j++) {
                if (currentMin > resultList[j]) {
                    currentMin = resultList[j];
                    currentMinIndex = j;
                } 
            }

            if (currentMinIndex != i) {
                resultList[currentMinIndex] = list[i];
                resultList[i] = currentMin;
            }
        }

        return resultList;
    }
}
