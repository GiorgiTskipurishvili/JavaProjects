package Task_10;

import java.util.ArrayList;

public class Student {
    /**Write a Java program to create a class called "Student"
     *  with a name, grade, and courses attributes,
     *  and methods to add and remove courses.**/

    private String name;
    private int grade;
    private ArrayList <String > courses;

    public Student(String name, int grade){
        this.name= name;
        this.grade=grade;
        this.courses = new ArrayList<String>();
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
            this.name = name;
    }

    public int getGrade(){
        return grade;
    }
    public void setGrade(int grade){
        this.grade = grade;
    }


    public ArrayList<String> getCourses(){
        return courses;
    }

    public void addCourse(String course){
        courses.add(course);
    }
    public void removeCourse(String course){
        courses.remove(course);
    }

    public void infoStudent(){
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
//        System.out.println("Course: " + courses);
    }
}
