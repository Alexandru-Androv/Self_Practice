package jd10_array_list;
import java.util.ArrayList;
import java.util.Arrays;

public class CombineTwoArrays {
    public static void main(String[] args) {
        String[] arr1 = {"A", "B", "C",};
        String[] arr2 = {"D", "E", "D"};
        ArrayList<String>list = new ArrayList<>(Arrays.asList(arr1));
        list.addAll(Arrays.asList(arr2));

        /*
        ArrayList<String>list = new ArrayList<>();
        for (String each : arr1) {
            list.add(each);

        }
        for (String each : arr2) {
            list.add(each);

        }
        */
        System.out.print("list ==> {");
        for (int i = 0; i < list.size(); i++) {
            System.out.print("\"" + list.get(i) + "\"");
            if(i< list.size()-1){
                System.out.print(", ");
            }
        }
        System.out.print("}");
    }

}
/*Create a class called CombineTwoArrays and write a program with the following specifications:
        4.1 Given two String arrays, combine them into one ArrayList.
Example:
arr1 = {"A", "B", "C"};
arr2 = {"D", "E", "F", "G"};

Output:
list ==> {"A", "B", "C", "D", "E", "F", "G"}

 */
