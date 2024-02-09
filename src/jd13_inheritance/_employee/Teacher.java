package jd13_inheritance._employee;

public class Teacher extends Employee{


    public Teacher(String name, int age, String gender, String employeeId, String jobTitle, double salary, String companyName) {
        super(name, age, gender, employeeId, jobTitle, salary, companyName);
    }

    public void works(){
        System.out.println(super.getName() + " is teaching.");
    }


}
/*
Teacher:
       - work(): Displays "[name] is teaching".
 */
