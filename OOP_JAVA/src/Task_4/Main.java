package Task_4;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(2);
        System.out.println("Radius is: " + circle.getRadius());
        System.out.println("the area of the circle: " + circle.getArea());
        System.out.println("the circumference of the circle : " + circle.getCircumference());

        circle.setRadius(6);
        System.out.println("\nset method");
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.getArea());
        System.out.println("Circumference: " + circle.getCircumference());

    }
}
