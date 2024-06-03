//  (Find the character of an ASCII code) Write a program that receives an ASCII code
// (an integer between 0 and 127 ) and displays its character. 
package chapter4;

import java.util.Scanner;

public class Exercise4_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 

        System.out.print("Enter an ASCII code: ");
        int charValue = input.nextInt();

        if (0 > charValue || charValue > 127) {
            System.out.println("invalid value");     
            System.exit(1);
        }

        String output = "The character fo ASCII code ";

        System.out.println(output + charValue + " is " + (char)(charValue));
    }
}
