package Task_10;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Carlos Baka",10);
        Student student2 = new Student("Chisco Munioz", 11);

        student1.infoStudent();

        System.out.println();
        student2.infoStudent();

        System.out.println("\nAdding Course for: " + student1.getName());
        student1.addCourse("Math");
        student1.addCourse("Physic");
        student1.addCourse("English");
        System.out.println(student1.getName() + "'s courses: " + student1.getCourses());


        System.out.println("\nAdding courses for " + student2.getName());
        student2.addCourse("History");
        student2.addCourse("Geography");
        student2.addCourse("English");
        System.out.println(student2.getName() + "'s courses: " + student2.getCourses());
        System.out.println("\nRemoving 'Science' course for " + student1.getName());
        student1.removeCourse("Physic");
        System.out.println(student1.getName() + "'s courses: " + student1.getCourses());


    }
}
