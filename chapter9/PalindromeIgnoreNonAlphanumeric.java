package chapter9;

import java.util.Scanner;

public class PalindromeIgnoreNonAlphanumeric {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = input.nextLine();
        System.out.println("Ignoring non alphanumeric characters, \nis " + s + " a palindrome? " + isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        String s1 = filter(s);
        String s2 = reverse(s1);
        return s1.equals(s2);
    }

    public static String filter(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                result.append(ch); 
            } 
        }
        return result.toString();
    }

    public static String reverse(String s) {
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        return sb.toString();
    }
}
