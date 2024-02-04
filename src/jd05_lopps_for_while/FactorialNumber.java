package jd05_lopps_for_while;

public class FactorialNumber {
    public static void main(String[] args) {

        int factNum=1;
         for (int i =1; i<6 ; i++) {
            factNum *= i;
            System.out.print(factNum +" ");

        }

    }

}
/*
5. Create a class named FactorialNumber. Write a program that can return the factorial number of any given number.

				Example:
					  num = 5

				Output:
					  120

			(because: 5! = 5 * 4 * 3 * 2* 1 = 120 ) */