// (Merge two sorted lists) Write the following method that merges two sorted lists
// into a new sorted list:
// public static int[] merge(int[] list1, int[] list2)
// 		Implement the method in a way that takes at most list1.length + list2.
// l e n g t h comparisons. See liveexample.pearsoncmg.com/dsanimation/­
// MergeSortNeweBook.html for an animation of the implementation. Write a test
// program that prompts the user to enter two sorted lists and displays the merged
// list. Here is a sample run. Note the first number in the input indicates the number
// of the elements in the list. This number is not part of the list.
package chapter7;

import java.util.Scanner;

public class Exercise7_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        System.out.print("Enter list1 size and contents: ");
        int[] list1 = new int[input.nextInt()];
        fillList(list1, input);
        System.out.print("Enter list2 size and contents: ");
        int[] list2 = new int[input.nextInt()];
        fillList(list2, input);
        System.out.print("list1 is ");
        printList(list1);
        System.out.print("\nlist2 is ");
        printList(list2);
        System.out.print("\nThe merged list is ");
        printList(merge(list1, list2));
        System.out.println();
    }

    public static void printList(int[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }

    public static void fillList(int[] list, Scanner input) {
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }
    }

    public static int[] merge(int[] list1, int[] list2) {
        int list1Length = list1.length;
        int list2Length = list2.length;
        int[] mergedList = new int[list1Length + list2Length];

        int j = 0, k = 0;
        for (int i = 0; i < mergedList.length; i++) {
            if (k < list2Length && list1[j] > list2[k]) {
                mergedList[i] = list2[k];
                k++;                 
            } else if (j < list1Length) {
                mergedList[i] = list1[j];
                j++;
            }
        }
        
        return mergedList;
    }
}
