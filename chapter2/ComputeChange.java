import java.util.Scanner;

public class ComputeChange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an amount in double, for example 11.56: ");
        double amount = input.nextDouble();
        int centsLeft = (int)(amount * 100);

        int amountOfDollars = centsLeft / 100;
        centsLeft = centsLeft % 100;

        int quartersLeft = centsLeft / 25;
        centsLeft = centsLeft % 25;

        int dimesLeft = centsLeft / 10;
        centsLeft = centsLeft % 10;

        int nickelsLeft = centsLeft / 5;
        int penniesLeft = centsLeft % 5;

        System.out.println("Your amount " + amount + " consists of: ");
        System.out.println(amountOfDollars + " dollars");
        System.out.println(quartersLeft + " quarters");
        System.out.println(dimesLeft + " dimes");
        System.out.println(nickelsLeft + " nickels");
        System.out.println(penniesLeft + " pennies");
    }
}
