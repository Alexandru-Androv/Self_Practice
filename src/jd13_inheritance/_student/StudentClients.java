package jd13_inheritance._student;

public class StudentClients {
    public static void main(String[] args) {
        GraduateStudent student1 = new GraduateStudent("Alex",21, "male",
                "221","programing", 'C', "Cydeo");
        student1.study();
        student1.grade();
        System.out.println(student1);

        System.out.println();

        CydeoStudents student2 = new CydeoStudents("Jenn", 20, "female", "222",
                "programing", 'A',"Cydeo", 33,
                06, "Java" );
        student2.study();
        System.out.println(student2);

        System.out.println();

        Undergraduated student3 = new Undergraduated("Vasy", 34, "male",
                "223", "Programing", 'E',"");
        System.out.println(student3);
    }

}
/*
Create a class named "StudentClients":
   - Create multiple objects representing different students.
   - Test the methods and attributes of each object.

 */
