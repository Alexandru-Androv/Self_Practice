package jd13_inheritance._student;

public class Student1 extends Student{

    private String studentId, fieldOfStudy;
    private char grade;
    private String schoolName;

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        if (studentId.isEmpty() || studentId.isBlank() || studentId == null){
            System.err.println("Student ID can't be empty, blank or null");
            System.exit(1);
        }
        this.studentId = studentId;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        if (fieldOfStudy.isEmpty() || fieldOfStudy.isBlank() || fieldOfStudy == null){
            System.err.println("Field of study can't be empty, blank or null");
            System.exit(1);
        }
        this.fieldOfStudy = fieldOfStudy;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        if (grade < 'A' && grade < 'F'){
            System.err.println("Grade must be between 'A' and 'F'");
            System.exit(1);
        }
        this.grade = grade;
    }

    public String getSchoolName() {

        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        if (schoolName.isEmpty() || schoolName.isBlank() || schoolName == null){
            System.err.println("School name can't be empty, blank or null");
            System.exit(1);
        }
        this.schoolName = schoolName;
    }
    public void study(){
        System.out.println(super.getName() + " studing at " + schoolName);
    }

    public Student1(String name, int age, String gender, String studentId,
                    String fieldOfStudy, char grade, String schoolName) {
        super(name, age, gender);
        setStudentId(studentId);
        setFieldOfStudy(fieldOfStudy);
        setGrade(grade);
        setSchoolName(schoolName);
    }

    @Override
    public String toString() {
        return super.toString() +
                "studentId='" + studentId + '\'' +
                "\n fieldOfStudy='" + fieldOfStudy + '\'' +
                ", grade=" + grade +
                ", schoolName='" + schoolName + '\'';
    }
}
/*
Create a subclass named "Student" with the following specifications:
   Attributes:
       - studentId: String
       - fieldOfStudy: String
       - grade: char
       - schoolName: String

   Encapsulation:
       - Same as previous tasks.

   Actions:
       - study(): Displays a message stating the student's name and school.
       - toString(): Prints the information of the Student object (including all attributes).
 */
