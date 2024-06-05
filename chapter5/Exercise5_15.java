// (Display the ASCII character table) Write a program that prints the characters in
// the ASCII character table from ! to ~. Display 10 characters per line. Characters
// are separated by exactly one space. 
package chapter5;

public class Exercise5_15 {
    public static void main(String[] args) {
        final int CHARACTERS_PER_LINE = 10;

        for (char i = '!'; i <= '~'; i++) {
            if ((i - 32) % CHARACTERS_PER_LINE == 0) {
                System.out.println(i);
            } else {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
