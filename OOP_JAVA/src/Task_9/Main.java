package Task_9;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Alen Delon", 1500, LocalDate.parse("2021-04-01"));
        Employee employee2 = new Employee("Alex Levis", 6500, LocalDate.parse("2012-01-01"));
        employee1.infoEmployee();
        System.out.println("Years of Service: " + employee1.getYearsOfService());
        System.out.println();
        employee2.infoEmployee();
        System.out.println("Years of Service: " + employee2.getYearsOfService());
    }
}
