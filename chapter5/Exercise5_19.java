package chapter5;

public class Exercise5_19 {
    public static void main(String[] args) {
        int rows = 8;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= (rows - i); j++) {
                System.out.print("    ");
            }

            for (int j = 0; j < i; j++) {
                System.out.printf("%4d", (int)Math.pow(2, j));
            }

            for (int j = i - 2; j >= 0; j--) {
                System.out.printf("%4d", (int)Math.pow(2, j));
            }

            System.out.println();
        }
    }
}
