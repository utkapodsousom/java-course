// (Financial application: compute future tuition) Suppose the tuition for a univer-
// sity is $10,000 this year and increases 5% every year. In one year, the tuition will
// be $10,500. Write a program that displays the tuition in 10 years, and the total
// cost of four years’ worth of tuition starting after the tenth year.
package chapter5;

public class Exercise5_7 {
    public static void main(String[] args) {
        final double PERCENT = 1.05;
        final int PERIOD = 10; 
        double tuition = 10000; 

        for (int i = 0; i <= PERIOD; i++) {
            tuition = tuition * PERCENT; 
        }

        System.out.printf("In " + PERIOD + " years the tuition will be $%.2f\n", tuition);

        double sum = 0;
        for (int j = 0; j < 4; j++) {
            tuition = tuition * PERCENT; 
            sum += tuition; 
        }

        System.out.printf("The total cost of four years' worth of tuition is $%.2f\n", sum);
    }
}
