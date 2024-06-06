// (Financial application: compare loans with various interest rates) Write a pro-
// gram that lets the user enter the loan amount and loan period in number of years,
// and displays the monthly and total payments for each interest rate starting from
// 5% to 8%, with an increment of 1/8. 
package chapter5;

import java.util.Scanner;

public class Exercise5_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Loan Amount: ");
        double loanAmount = input.nextDouble();
        System.out.print("Number of years: ");
        int numberOfYears = input.nextInt();

        double interestRate = 5;
        System.out.printf("%-18s%-18s%-18s\n", "Interest Rate", "Monthly Payment", "Total Payment");

        while (interestRate <= 8) {
            double monthlyInterestRate = interestRate / 1200;
            double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(monthlyInterestRate + 1, numberOfYears * 12));
            double totalPayment = monthlyPayment * numberOfYears * 12;

            System.out.printf("%-18.3f%-18.2f%-18.2f\n", interestRate, monthlyPayment, totalPayment);
            interestRate = interestRate + 0.125;
        }
    }
}
