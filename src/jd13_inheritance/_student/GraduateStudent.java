package jd13_inheritance._student;

public class GraduateStudent extends Student1{
    public GraduateStudent(String name, int age, String gender, String studentId,
                           String fieldOfStudy, char grade, String schoolName) {
        super(name, age, gender, studentId, fieldOfStudy, grade, schoolName);
    }
    public void study(){
        System.out.println(super.getName() + " graduated at " + super.getSchoolName());
    }
    public void grade(){
        System.out.println(super.getName() + " graduated at " + super.getSchoolName() +
                " with grade " + super.getGrade());
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
/*
Create the following subclasses of the Student class:
   3.1 GraduateStudent:
       - Override the study method.
       - Add any additional fields and methods as necessary.
 */
