package jd07_class_and_objects;
 import java.util.Scanner;
public class MyInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = input.nextInt();
        System.out.println("Enter your gender:");
         String gender = input.next();
         input.nextLine();

        System.out.println("Enter your full name:");
         String fullName = input.nextLine();

        System.out.println("Enter your phone number:");
         long phNumber = input.nextLong();

        System.out.println("Enter your zip code:");
         int zipCode = input.nextInt();
         input.nextLine();

        System.out.println("Enter your  school:");
         String school = input.nextLine();

        System.out.println("Enter your city :");
         String city = input.nextLine();

        System.out.println("Enter your state:");
         String state = input.next();
         input.nextLine();

        System.out.println("Enter your building number:");
         int buildingNum = input.nextInt();
         input.nextLine();

        System.out.println("Enter your street:");
         String street = input.nextLine();
         input.close();

        System.out.println(fullName);
        System.out.println(age);
        System.out.println(gender);
        System.out.println(phNumber);
        System.out.println("Address:");
        System.out.println("\t" + buildingNum + " " + street + "\n" +
               "\t" + city +" "+ state + " " + zipCode);


    }
}
/*

11. Create a class called MyInfo and ask the user to:

      Enter your age (int)
      Enter your gender (String - One word ONLY)
      Enter your full name (String - Multiple words)
      Enter your phone number (long)
      Enter your zip code (int)
      Enter your School name (String - Can be Multiple words)
      Enter your city name (String - Can be Multiple words)
      Enter your state name (String - One word ONLY)
      Enter your building number (int)
      Enter your Street name

    Display all the inputs that the user entered in the following order in separate lines:

        Full name
        Age
        Gender
        Phone number
        Address:
             buildingNumber Street
             City, state zipCode
 */
