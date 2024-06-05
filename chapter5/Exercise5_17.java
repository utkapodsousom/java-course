// (Display pyramid) Write a program that prompts the user to enter an integer from
// 1 to 15 and displays a pyramid, as presented in the following sample run:
// Enter the number of lines: 7
//             1
//           2 1 2
//         3 2 1 2 3
//       4 3 2 1 2 3 4
//     5 4 3 2 1 2 3 4 5
//   6 5 4 3 2 1 2 3 4 5 6
// 7 6 5 4 3 2 1 2 3 4 5 6 7
package chapter5;

import java.util.Scanner;

public class Exercise5_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer from 1 to 15: ");
        int number = input.nextInt();
        String rowPadding = " ";

        for (int i = 1; i <= number; i++) {
            for (int j = 0; j < (number - i); j++) {
                System.out.print(rowPadding.repeat(2));
            }

            for (int j = i; j >= 1; j--) {
                System.out.print(j + rowPadding); 
            }

            for (int j = 2; j <= i; j++) {
                System.out.print(j + rowPadding); 
            }

            System.out.println();
        }
    }
}
