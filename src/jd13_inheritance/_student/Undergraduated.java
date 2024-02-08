package jd13_inheritance._student;

public class Undergraduated extends Student1 {
    public Undergraduated(String name, int age, String gender, String studentId,
                          String fieldOfStudy, char grade, String schoolName) {
        super(name, age, gender, studentId, fieldOfStudy, grade, schoolName);
    }

    public void study() {
        System.out.println(super.getName() +
                " did not graduated at " + super.getSchoolName());
    }

    public void grade() {
        System.out.println(super.getName() + " did not graduated at " + super.getSchoolName() +
                "  because his grade was " + super.getGrade());
    }


}
/*
 UndergraduateStudent:
       - Same as GraduateStudent
 */
