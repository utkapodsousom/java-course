import java.util.Scanner;

public class Exercise2_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the monthly saving amount: ");
        double savingAmount = input.nextDouble();
        double monthlyInterest = 1 + (0.05 / 12);

        // after 1st month
        double result = savingAmount * monthlyInterest;
        // after 2nd month
        result = (savingAmount + (savingAmount * monthlyInterest)) * monthlyInterest;
        // after 3rd month
        result = (savingAmount + result) * monthlyInterest; 
        // after 4th month
        result = (savingAmount + result) * monthlyInterest; 
        // after 5th month
        result = (savingAmount + result) * monthlyInterest; 
        // after 6th month
        result = (savingAmount + result) * monthlyInterest; 
        
        double resultTruncated = (int)(result * 100) / 100.0;
        System.out.println("After the sixth month, the account value is $" + resultTruncated);
    }
}
