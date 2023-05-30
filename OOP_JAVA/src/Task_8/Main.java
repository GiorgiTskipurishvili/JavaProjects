package Task_8;

public class Main {
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight("red",25);
        System.out.println("the light is red: " +trafficLight.red());
        System.out.println("The light is green: " + trafficLight.green());

        trafficLight.changeColor("green");
        System.out.println();
        System.out.println("The light is now green: " + trafficLight.green());
        System.out.println("The light duration is: " + trafficLight.getDuration());

        System.out.println();
        trafficLight.setDuration(50);
        System.out.println("The light durations is now: " + trafficLight.getDuration());
    }
}
