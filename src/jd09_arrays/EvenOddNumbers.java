package jd09_arrays;

import java.util.Arrays;

public class EvenOddNumbers {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(numbers));
        int countOddNUm=0;
        int countEvenNum=0;
        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] % 2 !=0)
                countOddNUm++;
            else {
                countEvenNum++;
            }

        }
        System.out.println("Array has " + countEvenNum + " even numbers and " +
                countOddNUm + " odd." );

    }
}




/*
Create a class named EvenOddNumbers and write a program that counts the even and odd numbers from an array of integers.

			Example:
				array = {1, 2, 3, 4, 5, 6, 7};

			Output:
				The array has 4 odd numbers and 3 even numbers.

 */
