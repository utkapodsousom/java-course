// (Compute the greatest common divisor) Another solution for Listing 5.9 to find
// the greatest common divisor of two integers n1 and n2 is as follows: First find d
// to be the minimum of n1 and n2, then check whether d, d–1, d–2, ..., 2, or 1 is
// a divisor for both n1 and n2 in this order. The first such common divisor is the
// greatest common divisor for n1 and n2. Write a program that prompts the user to
// enter two positive integers and displays the gcd.
package chapter5;

import java.util.Scanner;

public class Exercise5_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter two positive integers: ");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int d = Math.min(n1, n2);
        int gcd = d;
        
        for (int i = d; i > 1; i--) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
                break;
            } else {
                gcd = 1;
            } 
        }

        System.out.println("The greatest common divisor of " + n1 + " and " + n2 + " is " + gcd);
    }
}
