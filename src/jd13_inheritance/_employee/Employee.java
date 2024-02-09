package jd13_inheritance._employee;

public class Employee extends Person {
    private String employeeId;
    private String jobTitle;
    private double salary;
    private String companyName;

    public Employee(String name, int age, String gender, String employeeId, String jobTitle, double salary, String companyName) {
        super(name, age, gender);
        setEmployeeId(employeeId);
        setJobTitle(jobTitle);
        setSalary(salary);
        setCompanyName(companyName);
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        if (employeeId.isEmpty() || employeeId.isBlank() || employeeId == null){
            System.err.println("Employe ID can't be empty,blank or null");
            System.exit(1);
        }
        this.employeeId = employeeId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        if (jobTitle.isEmpty() || jobTitle.isBlank() || jobTitle == null){
            System.err.println("Job title can't be empty,blank or null");
            System.exit(1);
        }
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary<0){
            System.err.println("Salary can't be less then 0.");
            System.exit(1);
        }
        this.salary = salary;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        if (companyName.isEmpty() || companyName.isBlank() || companyName == null){
            System.err.println("Company name can't be empty,blank or null");
            System.exit(1);
        }
        this.companyName = companyName;
    }
    public void work(){
        System.out.println(jobTitle + super.getName() + " is working.");
    }

    @Override
    public String toString() {
        return super.toString()+
                "employeeId='" + employeeId + '\'' +
                "\n jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", companyName='" + companyName + '\'';
    }
}

/*
 Create a subclass of Person named "Employee" with the following specifications:
   Attributes:
       - employeeId: String
       - jobTitle: String
       - salary: double
       - companyName: String

   Encapsulation:
       - Same as previous tasks.

   Constructor:
       - Same as previous tasks.

   Methods:
       - work(): Displays the employee's job title and name.
       - toString(): Returns a string representation of the Employee object.

 */
