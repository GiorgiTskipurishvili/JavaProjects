package Task_9;

import java.time.LocalDate;
import java.time.Period;

public class Employee {
    /**Write a Java program to create a class called "Employee"
     * with a name, salary, and hire date attributes,
     * and a method to calculate years of service.**/
    private String name ;
    private double salary;
    private LocalDate hireDate;

    public Employee(String name, double salary, LocalDate hireDate){
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }

    public LocalDate getHireDate(){
        return hireDate;
    }
    public void setHireDate(LocalDate hireDate){
        this.hireDate = hireDate;
    }

    public int getYearsOfService(){
        return Period.between(hireDate, LocalDate.now()).getYears();
    }

    public void infoEmployee(){
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Hire date: " + hireDate);
    }
}
