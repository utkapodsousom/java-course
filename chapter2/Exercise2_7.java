import java.util.Scanner;

public class Exercise2_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of minutes: ");
        int minutes = input.nextInt();

        int daysLeft = minutes / 60 / 24; 
        int years = daysLeft / 365;

        daysLeft = daysLeft % 365;

        System.out.println(minutes + " minutes is approximately " + years + " years and " + daysLeft + " days");
    }
}
