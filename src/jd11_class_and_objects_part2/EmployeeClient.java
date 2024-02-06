package jd11_class_and_objects_part2;

public class EmployeeClient {
    public static void main(String[] args) {

        Employee employee1 = new Employee();
        System.out.println(employee1);

        Employee employee2 = new Employee("John",24,'M',"Ingineer");
        System.out.println(employee2);

        Employee employee3 = new Employee("Rex",32,'M',"Mechanic",80_000);
        System.out.println(employee3);
        System.out.println(employee3.work());
    }

}
