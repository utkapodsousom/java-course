// (Emirp) An emirp (prime spelled backward) is a nonpalindromic prime number
// whose reversal is also a prime. For example, 17 is a prime and 71 is a prime, so
// 17 and 71 are emirps. Write a program that displays the first 100 emirps. Display
// 10 numbers per line, separated by exactly one space, as follows:
// 13 17 31 37 71 73 79 97 107 113
// 149 157 167 179 199 311 337 347 359 389
// ...
package chapter6;

public class Exercise6_27 {
    public static void main(String[] args) {
        final int NUMBER_OF_PRIMES = 100;
        final int NUMBERS_PER_LINE = 10;
        int nextNumber = 2;
        int primes = 0;
        
        while (primes < NUMBER_OF_PRIMES) {
            if (isPrime(nextNumber) && isPrime(reverse(nextNumber))) {
                primes++;

                if (primes % NUMBERS_PER_LINE == 0) {
                    System.out.println(nextNumber);
                } else {
                    System.out.print(nextNumber + " ");
                }
            } 

            nextNumber++;
        }
        System.out.println();

    }

    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number / 2 ; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }

        return true;
    }
    
    public static int reverse(int number) {
        int reversed = 0;

        while (number != 0) {
            int lastDigit = number % 10; 
            reversed = reversed * 10 + lastDigit;
            number = number / 10;
        }

        return reversed;
    }
}
