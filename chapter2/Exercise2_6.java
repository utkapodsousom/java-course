import java.util.Scanner;

public class Exercise2_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number between 0 and 1000: ");
        int number = input.nextInt();

        int last = number % 10;
        int rest = number / 10;

        int mid = rest % 10;
        int first = rest / 10;

        int sum = last + mid + first;

        System.out.println("The sum of digits is " + sum);
    }
}
