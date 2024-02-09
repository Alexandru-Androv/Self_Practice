package jd13_inheritance._employee;

public class EmployeeClients {
    public static void main(String[] args) {
        Tester employee1 = new Tester("John",12, "male","221",
                "SDET", 100_000, "Cydeo");
        System.out.println(employee1);

        System.out.println();

        Developer employee2 = new Developer("Rex", 22, "male", "123",
                "developer", 123_345, "Amazon");
        employee2.work("java");
        System.out.println(employee2);
    }
}
/*
Create a class named "EmployeeClients":
   - Create multiple objects representing different employees.
   - Test the methods and attributes of each object.
 */
