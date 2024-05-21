public class Exercise_11 {
    public static void main(String[] args) {
        System.out.println("Population after 1st year:");
        System.out.println(312_032_486 + (60 * 60 * 24 * 365 / 7) - (60 * 60 * 24 * 365 / 13) + (60 * 60 * 24 * 365 / 45));
        System.out.println("Population after 2nd year:");
        System.out.println(312_032_486 + 2 * ((60 * 60 * 24 * 365 / 7) - (60 * 60 * 24 * 365 / 13) + (60 * 60 * 24 * 365 / 45)));
        System.out.println("Population after 3rd year:");
        System.out.println(312_032_486 + 3 * ((60 * 60 * 24 * 365 / 7) - (60 * 60 * 24 * 365 / 13) + (60 * 60 * 24 * 365 / 45)));
        System.out.println("Population after 4th year:");
        System.out.println(312_032_486 + 4 * ((60 * 60 * 24 * 365 / 7) - (60 * 60 * 24 * 365 / 13) + (60 * 60 * 24 * 365 / 45)));
        System.out.println("Population after 5th year:");
        System.out.println(312_032_486 + 5 * ((60 * 60 * 24 * 365 / 7) - (60 * 60 * 24 * 365 / 13) + (60 * 60 * 24 * 365 / 45)));
    }
}
