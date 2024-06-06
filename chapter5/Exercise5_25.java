// (Compute p) 
// Write a program that displays the p value for i = 10000, 20000 and 100000.
package chapter5;

public class Exercise5_25 {
    public static void main(String[] args) {
        double pi = 0; 

        for (int i = 1; i <= 100000; i++) {
            pi += Math.pow(-1, i + 1) / (2 * i - 1);

            if (i == 10000) {
                System.out.println("PI at i = 10000 is " + pi * 4);
            } else if (i == 20000) {
                System.out.println("PI at i = 20000 is " + pi * 4);
            } else if (i == 100000) {
                System.out.println("PI at i = 100000 is " + pi * 4);
            }
        }
    }
}
