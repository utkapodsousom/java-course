// (Mersenne prime) A prime number is called a Mersenne prime if it can be written
// in the form 2p - 1 for some positive integer p. Write a program that finds all
// Mersenne primes with p <= 31 and displays the output
package chapter6;

public class Exercise6_28 {
    public static void main(String[] args) {
        System.out.println("p         2^p - 1    ");
        System.out.println("---------------------");
        int nextNumber = 2;

        while (nextNumber <= 31) {
            if (isPrime(nextNumber)) {
                int mersenne = (int) (Math.pow(2, nextNumber) - 1);

                if (isPrime(mersenne)) {
                    System.out.printf("%-10d%-10d\n", nextNumber, mersenne);
                }
            }

            nextNumber++;
        }
    }

    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number / 2 ; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }

        return true;
    }
}
