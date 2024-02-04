package jd07_class_and_objects;

public class EmployeeClient {
    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.name = "John";
        employee1.age = 20;
        employee1.gender = 'M';
        employee1.jobTitle = "supervisor";
        employee1.salary = 234.32;

        employee1.work();
        System.out.println(employee1);

        employee1.about();
        System.out.println(employee1);
        System.out.println("__________________________>>>>>>>>>");


        Employee employee2 = new Employee();
        employee2.name = "Mark";
        employee2.age = 34;
        employee2.gender = 'M';
        employee2.jobTitle = "labor";
        employee2.salary = 123.32;

        employee2.work();
        System.out.println(employee2);

        employee2.about();
        System.out.println(employee2);




    }
}
