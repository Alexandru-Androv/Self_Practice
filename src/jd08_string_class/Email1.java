package jd08_string_class;
import java.util.Scanner;
public class Email1 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Enter you email");
        String email = input.nextLine();

        if(email.contains("_")){
            System.out.println(email.substring(email.indexOf("_")+1 ,email.indexOf("@")) + "_" +
                    email.substring(0,email.indexOf("_")) + email.substring(email.indexOf("@")));
        } else
            System.out.println(email);
        input.close();


    }

}
/*

4. Create a class called EmailTask1. Assume that the email address is constructed by a person's first name followed
by an underscore and last name. Write a program that can swap the first name with the last name in the email
(separated by an underscore). If the email doesn't contain an underscore, print the given input email.

        Example:
              Input:
                 mike_tyson@gmail.com

              Output:
                  tyson_mike@gmail.com
 */