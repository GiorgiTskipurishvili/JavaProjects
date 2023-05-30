package Task_1;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("David Backem",20);
        Person person2 = new Person("Alex Devis", 25);
        Person person3 = new Person("Mao Levis", 29);
        System.out.println("Person 1 - " + person1.getName() + ", Age: " + person1.getAge());
        System.out.println("Person 2 - " + person2.getName() + ", Age: " + person2.getAge());
        System.out.println("Person 3 - " + person3.getName() + ", Age: " + person3.getAge());

    }
}
