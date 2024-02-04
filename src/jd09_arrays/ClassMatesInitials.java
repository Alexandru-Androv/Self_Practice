package jd09_arrays;

public class ClassMatesInitials {
    public static void main(String[] args) {
        String[] names = {"Berna Santiago", "Jen Nest", "Pendar Shamsollahi",
                "Chiyavan Banavi", "Alexandru Alexandrov", "Gholam Parwiz", "Eren Acan",
                "Mehdi Messaoudi", "Konstantin Gavrilov", "Vicor Chow"};
        String[] initials = new String[names.length];
        for (int i = 0; i < names.length; i++) {
        initials[i] = names[i].charAt(0) + "." + names[i].charAt(names[i].indexOf(" ")+1);
            System.out.println(initials[i]);

        }

    }
}
/*
2. Create a class named ClassMatesInitials and write a program with the following specifications:
   2.1 Create an array of strings named classmates.
   2.2 Store full names of 10 classmates.
   2.3 Print the initials of each student's name in separate lines.

 */
