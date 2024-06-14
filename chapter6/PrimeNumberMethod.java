package chapter6;

public class PrimeNumberMethod {
    public static void main(String[] args) {
        final int NUMBER_OF_PRIMES = 50;
        final int NUMBER_OF_PRIMES_PER_LINE = 10;
        int count = 0;
        int number = 2;

        System.out.println("The first 50 prime numbers are \n");

        while (count < NUMBER_OF_PRIMES) {
            if (isPrime(number)) {
                count++;

                if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
                    System.out.printf("%-4d\n", number);
                } else {
                    System.out.printf("%-4d", number);
                }
            }

            number++;
        }
    }

    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }

        return true;
    }
}
