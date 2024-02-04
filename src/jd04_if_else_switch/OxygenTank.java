
/*2. Create a class named OxygenTank. You are diving in the ocean. Your oxygen tank has a certain
level (number), and you must print a message based on the level:
   Above 90 - Your tank is full
   Above 80 - Still okay
  Above 70 - Don't go too far
  Above 60 - Start to head back
   Above 50 - Be careful, you're at 50%
 Example:
     oxygenLevel = 75
  Output:
      Don't go too far */

package jd04_if_else_switch;

public class OxygenTank {
    public static void main(String[] args) {
        int level =75;

    if ( level > 90 ){
        System.out.println("Your tank is full");
    } else if ( level >= 80 && level < 90 ) {
        System.out.println("Still okay");

    } else if ( level >= 70 && level < 80 ) {
        System.out.println(" Don't go too far");

    } else if ( level >= 60 && level < 70 ) {
        System.out.println("Start to head back");

    } else if ( level >= 50 && level < 60 ) {
        System.out.println("Be careful, you're at 50%");

    } else if ( level >= 1 && level < 50  ){
        System.out.println("Danger, you are runing low on air");

    } else{
        System.out.println("No air");
    }


    }
}
