import java.util.Scanner;

public class Exercise2_11 {
    public static void main(String[] args) {
        final int POPULATION = 312_032_486;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of years: ");
        int years = input.nextInt();

        int totalPopulation = POPULATION + years * ((60 * 60 * 24 * 365 / 7) - (60 * 60 * 24 * 365 / 13) + (60 * 60 * 24 * 365 / 45));
        System.out.println("Population in " + years + " years is " + totalPopulation);
    }
}

