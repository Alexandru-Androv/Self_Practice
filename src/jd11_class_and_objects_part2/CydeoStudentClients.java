package jd11_class_and_objects_part2;

public class CydeoStudentClients {
    public static void main(String[] args) {
        CydeoStudents student1 = new CydeoStudents("Alex",28,123,'D',
                "B33", 6);
        System.out.println(student1.study());
        System.out.println(student1.atendClass());
        System.out.println(student1.printProgLanguage());
        System.out.println(student1.printSchoolName());
        System.out.println(student1);
        System.out.println();

        CydeoStudents student2 = new CydeoStudents("Jenn",23,125,'A',
                "B33", 6);
        System.out.println(student2.study());
        System.out.println(student2.atendClass());
        System.out.println(student2.printProgLanguage());
        System.out.println(student2.printSchoolName());
        System.out.println(student2);
        System.out.println();
        
        CydeoStudents student3 = new CydeoStudents("Pendar",32,112,'A',
                "B33", 6);
        System.out.println(student3.study());
        System.out.println(student3.atendClass());
        System.out.println(student3.printProgLanguage());
        System.out.println(student3.printSchoolName());
        System.out.println(student3);

    }
}
