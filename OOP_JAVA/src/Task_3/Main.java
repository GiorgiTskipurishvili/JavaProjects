package Task_3;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(7,10);

        System.out.println("the area of rectangle is: " + rectangle.getArea());
        System.out.println("the perimeter of rectangle is: " + rectangle.getPerimeter());


        rectangle.setWidth(14);
        rectangle.setHeight(20);
        System.out.println("\nnew rectangle area and perimeter from set methods");
        System.out.println("the area of rectangle is: " + rectangle.getArea());
        System.out.println("the perimeter of rectangle is: " + rectangle.getPerimeter());
    }
}
