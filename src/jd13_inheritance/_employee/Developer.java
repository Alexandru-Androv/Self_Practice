package jd13_inheritance._employee;

public class Developer extends Employee{
    private String programingLanguage;

    public Developer(String name, int age, String gender, String employeeId, String jobTitle, double salary, String companyName) {
        super(name, age, gender, employeeId, jobTitle, salary, companyName);
        this.programingLanguage = programingLanguage;
    }


    public String getProgramingLanguage() {
        return programingLanguage;
    }

    public void setProgramingLanguage(String programingLanguage) {
     if (programingLanguage.isBlank() || programingLanguage.isEmpty() || programingLanguage == null){
            System.err.println("Programing language can't be empty,blank or null.");
            System.exit(1);
        }
        this.programingLanguage = programingLanguage;
    }

    public void work( String programinglanguage) {
        System.out.println(super.getJobTitle() + super.getName() +
                " is coding in " + programinglanguage);
    }

    @Override
    public String toString() {
        return super.toString() +
                ", programingLanguage='" + programingLanguage + '\'' +
                '}';
    }
}
/*
 Developer:
       - Extra Variable:
           - programmingLanguage: String
       - work(): Displays "[jobTitle] [name] is coding in [programmingLanguage]".
 */
