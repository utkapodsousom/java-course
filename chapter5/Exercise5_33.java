// (Perfect number) A positive integer is called a perfect number if it is equal to the sum
// of all of its positive divisors, excluding itself. For example, 6 is the first perfect num-
// ber because 6 = 3 + 2 + 1. The next is 28 = 14 + 7 + 4 + 2 + 1 . There are
// four perfect numbers 6 10,000. Write a program to find all these four numbers.
package chapter5;

public class Exercise5_33 {
    public static void main(String[] args) {
        final int LIMIT = 10000;
        
        String perfectNumbers = "";

        for (int divisible = 1; divisible < LIMIT; divisible++) {
            int sumOfDivisors = 0;

            for (int divisor = divisible / 2; divisor > 0; divisor--) {

                if (divisible % divisor == 0) {
                    sumOfDivisors += divisor;
                }

                if (sumOfDivisors == divisible && divisor == 1) {
                    perfectNumbers += divisible + " ";
                }
            }

        }

        System.out.println(perfectNumbers);
    }
}
