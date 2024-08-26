package chapter9;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println("The area of the circle of radius " +
                            circle1.getRadius() + " is " + circle1.getArea());

        Circle circle2 = new Circle(25);
        System.out.println("The area of the circle of radius " +
                            circle2.getRadius() + " is " + circle2.getArea());

        Circle circle3 = new Circle(125);
        System.out.println("The area of the circle of radius " +
                            circle3.getRadius() + " is " + circle3.getArea());

        circle2.setRadius(100);
        System.out.println("The area of the circle of radius " +
                            circle2.getRadius() + " is " + circle2.getArea());
    }
}
