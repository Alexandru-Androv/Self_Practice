package jd13_inheritance._employee;

public class Tester extends Employee{
    public Tester(String name, int age, String gender, String employeeId,
                  String jobTitle, double salary, String companyName) {
        super(name, age, gender, employeeId, jobTitle, salary, companyName);
    }

    @Override
    public void work() {
        System.out.println(super.getJobTitle() + super.getName() + " is testing.");
    }
}
/*
2.1 Tester:
       - work(): Displays "[jobTitle] [name] is testing".
 */