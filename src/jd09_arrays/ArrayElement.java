package jd09_arrays;

import java.util.Arrays;

public class ArrayElement {
    public static void main(String[] args) {
        int[] arr1 = new int[100];
        for (int i = 0; i < 100; i++) {
            arr1[i] = i;
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println("-----------------------------------------");
        for (int i = 0; i < 100; i++) {
            System.out.print(arr1[i] +" ");
        }
        System.out.println();
        System.out.println("-----------------------------------");

        for (int i = 99; i >= 0; i--) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        System.out.println("------------------------------------");
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 5 ==0)
                System.out.print(i + " ");

        }



    }


}
/*
1. Create a class named ArrayElements and write a program with the following specifications:
   1.1 Create an array of integers with a length of 100.
   1.2 Assign values from 1 to 100 to the indexes of the array.
   1.3 Display the array elements in a single line separated by spaces.
   1.4 Display the array elements in a single line in reversed order, separated by spaces.
   1.5 Display all evenly divisible elements by 5 in a single line separated by spaces.
 */