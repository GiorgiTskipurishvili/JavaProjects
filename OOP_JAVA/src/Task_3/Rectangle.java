package Task_3;

public class Rectangle {
    /**Write a Java program to create a class called "Rectangle" with width and height attributes.
     * Calculate the area and perimeter of the rectangle.**/

    private double width;
    private double height;

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }

    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height = height;
    }


    public double getArea(){
        return width * height ;
    }
    public double getPerimeter(){
        return 2* (width+height);
    }

}
