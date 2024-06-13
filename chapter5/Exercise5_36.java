package chapter5;

import java.util.Scanner;

public class Exercise5_36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        int isbn = input.nextInt();

        String isbn10 = "";

        int d10 = 0;
        for (int i = 1; i <= 9; i++) {
            int d = isbn % 10;
            isbn = isbn / 10;
            isbn10 += d;

            d10 += d * i; 
        }

        d10 = d10 % 11;

        String isbn10Reversed = "";
        for (int i = 0; i < isbn10.length(); i++) {
            isbn10Reversed = isbn10.charAt(i) + isbn10Reversed;
        }

        System.out.print("The ISBN-10 number is " + isbn10Reversed);

        if (d10 == 10)
            System.out.println("X");
        else 
            System.out.println(d10);
    }
}