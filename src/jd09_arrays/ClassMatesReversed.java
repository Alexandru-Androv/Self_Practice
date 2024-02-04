package jd09_arrays;

import java.util.Arrays;

public class ClassMatesReversed {
    public static void main(String[] args) {
        String[] classMates = {"Berna Santiago", "Jen Nest", "Pendar Shamsollahi",
                "Chiyavan Banavi", "Alexandru Alexandrov", "Gholam Parwiz", "Eren Acan",
                "Mehdi Messaoudi", "Konstantin Gavrilov", "Vicor Chow"};
        String[] reversed = new String[classMates.length];

        for (int i = 0,j = 0; i < classMates.length; i++, j++) {
            reversed[j] = "\n" + classMates[i].substring(classMates[i].indexOf(" ")+ 1)
                    + " " + classMates[i].substring(0,classMates[i].indexOf(" "));


        }
        System.out.println(Arrays.toString(reversed));


    }

}
/*
. Create a class named ClassMatesReversed and write a program with the following specifications:
   6.1 Create an array of strings named classmates.
   6.2 Store full names of 10 classmates.
   6.3 Reverse each student's name and print them on separate lines.
 */
