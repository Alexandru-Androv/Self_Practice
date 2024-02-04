package jd_10_array_list;

import java.util.ArrayList;
import java.util.Arrays;

public class SameFirstAndLast {
    public static void main(String[] args) {
        ArrayList<String>list = new ArrayList<>(Arrays.asList("Anna", "Canada", "Bob",
                "David", "Lan", "Abida", "Ebrahim", "Farida"));
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).toLowerCase().charAt(0) !=
                    list.get(i).toLowerCase().charAt(list.get(i).length()-1)){
                System.out.println(list.get(i));
            }

        }


    }
}
/*
Create a class called SameFirstAndLast and write a program with the following specifications:
    11.1 Given an ArrayList of strings, remove elements if the first and last characters of the string are the same.

			Example:
				list = {"Anna", "Canada", "Bob", "David", "Lan", "Abida", "Ebrahim", "Farida"}

			output:
				["Lan", "Ebrahim", "Farida"]

 */
