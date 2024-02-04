package jd08_string_class;
import java.util.Scanner;
public class TipCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Split or no split: Yes or No");
        String split = input.next();

        System.out.println("Enter the num of people:");
        int numOfPeople = input.nextInt();

        System.out.println("Enter ceck amount:");
         double ceck = input.nextDouble();

        System.out.println("Service Quality: Poor/ Fair/ Good/ Great/ Excellent");
        String quality = input.next();
        double tip;
         switch (quality){
            case "Poor" -> tip = ceck * 5 / 100;
            case "Fair" -> tip = ceck * 10 / 100;
            case "Good" -> tip = ceck * 15 / 100;
            case "Great" -> tip = ceck * 20 / 100;
            case "Excelent" -> tip = ceck * 25 / 100;
            default -> tip = 0;
        }

        double totalPay = ceck + tip;
        double totalPerPerson = totalPay / numOfPeople;
        double tipPerPerson = tip / numOfPeople;

        System.out.println("Number of people: " + numOfPeople);
        System.out.println("Total to Pay: " + totalPay);
        System.out.println("Total tip: " + tip);
        System.out.println("Total per person: " + totalPerPerson);
        System.out.println("Tip per person: " + tipPerPerson);


    }
}
/*

7. Create a class called TipCalculator and write a program for a tip calculator. There will be different service
quality benchmarks that will determine the tip given. There will also be the ability to calculate based on the
number of people in the party and whether there is a split of the bill.

        Poor = 5%, Fair = 10%, Good = 15%, Great = 20%, Excellent = 25%

      The program should ask the user to enter:
          - Split or No split (Yes or No),
          - Enter the number of people (number)
          - Enter the check amount (number)
          - Service Quality (String)

      And display the output in the following format:

            Example:
                  Split or No Split (Yes or No)?
                  Input: Yes
                  Enter the number of people:
                  Input: 4
                  Enter the check amount:
                  Input: 476
                  How was the service quality? (Excellent/Great/Good/Fair/Poor)
                  Input: Excellent

            Output:
                 Number of people entered: 4
                 Total to pay: 595.0
                 Total tip: 119.0
                 Total per person: 148.75
                 Tip per person: 29.75
 */