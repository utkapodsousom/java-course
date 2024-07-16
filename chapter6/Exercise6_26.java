// (Palindromic prime) A palindromic prime is a prime number and also palin-
// dromic. For example, 131 is a prime and also a palindromic prime, as are 313
// and 757. Write a program that displays the first 100 palindromic prime numbers.
// Display 10 numbers per line, separated by exactly one space, as follows:
// 2 3 5 7 11 101 131 151 181 191
// 313 353 373 383 727 757 787 797 919 929
// ...
package chapter6;

public class Exercise6_26 {
    public static void main(String[] args) {
        final int NUMBER_OF_PALINDROMIC_PRIMES = 100;
        final int NUMBERS_PER_LINE = 10;
        int nextNumber = 2;
        int primes = 0;
        
        while (primes < NUMBER_OF_PALINDROMIC_PRIMES) {
            if (isPalindrome(nextNumber) && isPrime(nextNumber)) {
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

    public static boolean isPalindrome(int number) {
        return reverse(number) == number;    
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
