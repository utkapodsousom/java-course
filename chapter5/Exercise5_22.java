// (Financial application: loan amortization schedule) The monthly payment for a given
// loan pays the principal and the interest. The monthly interest is computed by multiply-
// ing the monthly interest rate and the balance (the remaining principal). The principal
// paid for the month is therefore the monthly payment minus the monthly interest. Write
// a program that lets the user enter the loan amount, number of years, and interest rate
// then displays the amortization schedule for the loan. 
package chapter5;

import java.util.Scanner;

public class Exercise5_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Loan Amount: ");
        double loanAmount = input.nextDouble();
        System.out.print("Number of Years: ");
        int years = input.nextInt();
        System.out.print("Annual Interest Rate: ");
        double interestRate = input.nextDouble();

        double monthlyInterestRate = interestRate / 1200;
        double monthlyPayment = loanAmount * monthlyInterestRate
                / (1 - 1 / Math.pow(monthlyInterestRate + 1, years * 12));
        double totalPayment = monthlyPayment * years * 12;

        System.out.println("Monthly payment: " + (int) (monthlyPayment * 100) / 100.0);
        System.out.println("Total payment: " + (int) (totalPayment * 100) / 100.0);
        System.out.println();
        System.out.printf("%-18s%-18s%-18s%-18s\n", "Payment#", "Interest", "Principal", "Balance");

        for (int i = 1; i <= years * 12; i++) {
            double interest = monthlyInterestRate * loanAmount;
            double principal = monthlyPayment - interest;
            loanAmount = loanAmount - principal < 0 ? 0 : loanAmount - principal;
            System.out.printf("%-18d%-18.2f%-18.2f%-18.2f\n", i, interest, principal, loanAmount);
        }
    }
}
