package jd11_class_and_objects_part2;

public class Employee {
    public String name;
    public int age;
    public char gender;
    public String jobTitle;
    public double salary;

    public Employee(){
        name = "unknown";
        age = 0;
        gender = 'N';
        jobTitle = "unknown";
        salary = 0.0;
    }
      public Employee(String name, int age){
          this.name = name;
          this.age = age;

    }
      public Employee(String name, int age, char gender, String jobTitle ){
        this(name,age);
        this.gender = gender;
        this.jobTitle = jobTitle;
    }

      public Employee(String name, int age, char gender, String jobTitle, double salary) {
        this(name, age, gender, jobTitle);
        this.salary = salary;
    }

    public String work(){
        return jobTitle + " "+ name + " with salary " + salary +" is working.";
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", works= " + work();
    }
}
/*
Create a custom class named Employee with the following specifications:

	Attributes:
			name (String)
			age (int)
			gender (char)
			jobTitle (String)
			salary (double)

    Constructors:
			Add multiple constructors to set different fields of the employee object.

    Actions:
		work(): prints the job title and name of the employee concatenated with " is working."
		toString(): returns a string representation of the employee object.

	Create another class named EmployeeClients, create multiple employee objects, and test each function of the employee object.

 */
