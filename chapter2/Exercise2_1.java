
import java.util.Scanner;

public class Exercise2_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter value in celsius: ");
        double celsius = input.nextDouble();
        double fahrenheit = (9 / 5.0) * celsius + 32;

        System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit");
    }
}
