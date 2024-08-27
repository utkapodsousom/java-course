package chapter9;

public class Exercise9_1 {
    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle(4, 40);
        Rectangle rec2 = new Rectangle(3.5, 35.9);

        System.out.printf("%-20s%-20s%-20s%-20s", "Width", "Height", "Area", "Perimeter");
        System.out.println();
        System.out.printf("%-20s%-20s%-20s%-20s", rec1.getWidth(), rec1.getHeight(), rec1.getArea(), rec1.getPerimeter());
        System.out.println();
        System.out.printf("%-20s%-20s%-20s%-20s", rec2.getWidth(), rec2.getHeight(), rec2.getArea(), rec2.getPerimeter());
        System.out.println();
    }
}
