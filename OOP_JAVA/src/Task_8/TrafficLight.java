package Task_8;

public class TrafficLight {
    /**Write a Java program to create class called "TrafficLight"
     * with attributes for color and duration, and methods to change
     * the color and check for red or green.*/

    private String color;
    private int duration;

    public TrafficLight(String color, int duration){
        this.color = color;
        this.duration = duration;
    }

    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }

    public int getDuration(){
        return duration;
    }
    public void setDuration(int duration){
        this.duration =duration;
    }

    public void changeColor(String newColor){
        color = newColor;
    }

    public boolean red(){
        return color.equals("red");
    }
    public boolean green(){
        return color.equals("green");
    }
}
