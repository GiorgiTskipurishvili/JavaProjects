package Task_6;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Martin Luther", "Software Engineer" , 87519.59);
        Employee employee2 = new Employee("Dea Ravi", "HR Manager", 47221.96 );
        System.out.println("Employees details ");
        employee1.printEmployee();
        System.out.println();
        employee2.printEmployee();

        System.out.println("\nupdated");
        System.out.println("After raising salary 8%");
        employee1.calculateSalaryIncrease(8);
        employee1.printEmployee();

        System.out.println("\nAfter raising salary 15%");
        employee2.calculateSalaryIncrease(15);
        employee2.printEmployee();
    }
}
