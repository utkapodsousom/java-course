// (Partition of a list) Write the following method that partitions the list using the
// first element, called a pivot:
// 		public static int partition(int[] list)
// After the partition, the elements in the list are rearranged so all the elements before
// the pivot are less than or equal to the pivot, and the elements after the pivot are
// greater than the pivot. The method returns the index where the pivot is located in
// the new list. For example, suppose the list is {5, 2, 9, 3, 6, 8}. After the partition,
// the list becomes {3, 2, 5, 9, 6, 8}. Implement the method in a way that takes at
// most list.length comparisons. See liveexample.pearsoncmg.com/dsanima-
// tion/QuickSortNeweBook.html for an animation of the implementation. Write a
// test program that prompts the user to enter the size of the list and the contents of
// the list and displays the list after the partition.
package chapter7;

import java.util.Scanner;

public class Exercise7_32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter list size: ");
        int[] list = new int[input.nextInt()];
        System.out.print("Enter list content: ");
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }
        System.out.print("After the partition, the list is ");
        partition(list);
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
        input.close();
    }
    public static int partition(int[] list) {
        int pivot = list[0];
        int pivotIndex = 0;
        int low = 1;
        int high = list.length - 1; 
        while (high >= low) {
            if (list[high] > pivot) {
                high--;
            } else if (list[low] <= pivot) {
                low++; 
            } else {
                swap(list, high, low);
            }
        }
        swap(list, pivotIndex, high);
        pivotIndex = high;
        return pivotIndex;
    }
   
    public static void swap(int[] list, int a, int b) {
        int temp = list[a];
        list[a] = list[b];
        list[b] = temp;
    }
}
