package jd13_inheritance._employee;
   public class Driver extends Employee{

       public Driver(String name, int age, String gender, String employeeId, String jobTitle, double salary, String companyName) {
           super(name, age, gender, employeeId, jobTitle, salary, companyName);
       }

       public void works(){
        System.out.println(super.getName() + "is a " + super.getJobTitle() + " and is drivin.");

    }
}
/*
 Driver:
       - work(): Displays "[name] is driving".
 */
