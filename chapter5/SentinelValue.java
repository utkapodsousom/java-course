package chapter5;

import java.util.Scanner;

public class SentinelValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int sum = 0;
        while (input.hasNext()) {
            sum += input.nextInt(); 
        }

        System.out.println("The sum is " + sum);
    }
}
