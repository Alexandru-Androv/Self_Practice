package jd08_string_class;
import java.util.Scanner;
public class FirtsAndLastname {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter yout first and last name:");
        String fullName = input.nextLine();

        String firstName = fullName.substring(0, 1).toUpperCase() + fullName.substring(
                1, fullName.indexOf(" "));
        String lastName = fullName.substring(fullName.indexOf(" ") + 1, fullName.indexOf(" ") + 2).toUpperCase() +
                fullName.substring(fullName.indexOf(" ")+2).toLowerCase();

        System.out.println("firstName = " + firstName);
        System.out.println("lastName = " + lastName);

    }
}
/*

6. Write a program that asks the user to enter first and last names and then prints the full name in regular format
(first character in uppercase).

        Example:
              Input:
                  firstName = "cyDEo";
                  lastName = "SCHOOL";

              Output:
                   Cydeo School

 */

