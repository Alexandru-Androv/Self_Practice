package jd09_arrays;

import java.util.Arrays;

public class StudentGrade {
    public static void main(String[] args) {
        String[] names = {"Anna", "Nancy", "Sarah"};
        int[] scores = {90, 75, 85};
        char[] grade = new char[scores.length];

        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(scores));

        for (int i = 0; i < scores.length; i++) {
            if (scores[i]>100 || scores[i]<0) {
                System.err.println("Invalid score");
                return;
            }
            if (scores[i] > 89){
                grade[i] = 'A';
            } else if (scores[i]> 79) {
                grade[i] = 'B';
            } else if (scores[i]>69) {
                grade[i] = 'C';
            } else {
                grade[i] = 'F';
            }

        }
        System.out.println(Arrays.toString(grade));
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] +"'s" + " score is " + scores[i] + ","
                    + " and grade is " + grade[i]);

        }



    }
}
/*

4. Create a class named StudentGrade and write a program with the following specifications:
	4.1 Given two arrays with the same length:
		   studentNames (String[])
		   scores (int[])

   	4.2 Write a program to determine and store the students' grades in an array of characters named grades.

   2.3 Print the grade report for each student in separate lines.

			Example:
				String[] names = {"Anna", "Nancy", "Sarah"};
				int[] scores = {90, 75, 80};

			Output:
				grades = {'A', 'C', 'B'};
				Anna's score is 90, and grade is A
				Nancy's score is 75, and grade is C
				Sarah's score is 80, and grade is B
 */
