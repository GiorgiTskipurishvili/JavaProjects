package Task_2;

public class Main {
    public static void main(String[] args) {
        //create two instance of the dog class
        Dog dog1 = new Dog("Messi", "Irish Setter");
        Dog dog2 = new Dog("Max", "German Shepherd");

        //print the initial values
        System.out.println("Dog 1 - Name: " + dog1.getName() + ", Breed: " + dog1.getBreed());
        System.out.println("Dog 2 - Name: " + dog2.getName() + ", Breed: " + dog2.getBreed());

        //using setter methods
        dog1.setName("Charlie");
        dog2.setBreed("Golden Retriever");

        //print the new values.
        System.out.println("Dog 1 - Name: " + dog1.getName() + ", Breed: " + dog1.getBreed());
        System.out.println("Dog 1 - Name: " + dog1.getName() + ", Breed: " + dog1.getBreed());
    }
}
