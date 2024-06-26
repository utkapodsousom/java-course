import java.util.Scanner;

public class ComputeLoan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter annual interest rate, e.g., 7.25: ");
        double annualInterestRate = input.nextDouble();

        System.out.print("Enter number of years as an integer, e.g., 5: ");
        int numberOfYears = input.nextInt();

        System.out.print("Enter loan amount, e.g., 120000.95: ");
        double loanAmount = input.nextDouble();

        double monthlyInterestRate = annualInterestRate / 1200;

        double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(monthlyInterestRate + 1, numberOfYears * 12));
        double totalPayment = monthlyPayment * numberOfYears * 12;

        System.out.println("Monthly payment is $" + (int)(monthlyPayment * 100) / 100.0);
        System.out.println("Total payment is $" + (int)(totalPayment * 100) / 100.0);
    }
}
