// (Check password) Some Websites impose certain rules for passwords. Write a
// method that checks whether a string is a valid password. Suppose the password
// rules are as follows:
// ■■ A password must have at least eight characters.
// ■■ A password must contain only letters and digits.
// ■■ A password must contain at least two digits.
// Write a program that prompts the user to enter a password and displays Valid
// Password if the rules are followed, or Invalid Password otherwise.
package chapter6;

import java.util.Scanner;

public class Exercise6_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);    

        System.out.print("Enter a password: ");
        String password = input.next();
        System.out.println(isOver8Characters(password));
        System.out.println(isOnlyLettersAndDigits(password));
        System.out.println(isOverTwoDigits(password));
        if (isValidPassword(password)) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }

        input.close();
    }
    
    public static boolean isValidPassword(String password) {
        return (isOver8Characters(password) && isOnlyLettersAndDigits(password) && isOverTwoDigits(password));
    }

    public static boolean isOver8Characters(String password) {
        return password.length() >= 8;
    }

    public static boolean isOnlyLettersAndDigits(String password) {
        boolean result = true;

        for (int i = 0; i < password.length(); i++) {
            char currentChar = password.charAt(i); 
           
            if (!isAlphaNumeric(currentChar)) {
                return false;
            } 
        }

        return result;
    }

    public static boolean isAlphaNumeric(char ch) {
        return ((ch >= '0' && ch <= '9') || (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'));
    } 

    public static boolean isOverTwoDigits(String password) {
        int count = 0;

        for (int i = 0; i < password.length(); i++) {
            char currentChar = password.charAt(i); 

            if (currentChar >= '0' && currentChar <= '9') {
                count = count + 1; 
            }
        }

        return count >= 2;
    }
}
