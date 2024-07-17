// (Twin primes) Twin primes are a pair of prime numbers that differ by 2. For
// example, 3 and 5 are twin primes, 5 and 7 are twin primes, and 11 and 13 are
// twin primes. Write a program to find all twin primes less than 1,000. Display the
// output as follows:
// (3,(5,...
// 5)
// 7)
package chapter6;

public class Exercise6_29 {
    public static void main(String[] args) {
        final int BIGGEST_PRIME = 1000;        
        int nextNumber = 1;
        int currentPrime = 1;
        int nextPrime = 1;

        while (nextNumber < BIGGEST_PRIME) {
            nextNumber++;

            if (isPrime(nextNumber)) {
                nextPrime = nextNumber;

                if (nextPrime - currentPrime == 2) {
                    System.out.println("(" + currentPrime + ", " + nextPrime + ")");
                }

                currentPrime = nextPrime;
            }
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
