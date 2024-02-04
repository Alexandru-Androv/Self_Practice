package jd06_methods;

public class DayAndMonth {
    public static void main(String[] args) {
        String day= day(2);
        System.out.println(day);
        String month= monthName(6);
        System.out.println(month);
       String n= daysInMonth(8);
        System.out.println(n);
    }
    public static String day(int day){
          String dayNumber;
           switch (day){
               case 1-> dayNumber = "Monday";
               case 2-> dayNumber = "Tuesday";
               case 3-> dayNumber = "Wednesday";
               case 4-> dayNumber = "Thursday";
               case 5-> dayNumber = "Friday";
               case 6-> dayNumber = "Saturday";
               case 7-> dayNumber = "Sunday";
               default -> dayNumber = "Invalid Number";
           }return dayNumber;

    }
    public static String monthName(int month){
        String monthNumber;
         switch (month){
             case 1-> monthNumber = "January";
             case 2-> monthNumber = "February";
             case 3-> monthNumber = "March";
             case 4-> monthNumber = "April";
             case 5-> monthNumber = "May";
             case 6-> monthNumber = "June";
             case 7-> monthNumber = "July";
             case 8-> monthNumber = "August";
             case 9-> monthNumber = "September";
             case 10-> monthNumber = "Octomber";
             case 11-> monthNumber = "November";
             case 12-> monthNumber = "December";
             default -> monthNumber = "Invalid Number";
         } return monthNumber;
    }
    public static String daysInMonth(int n){
        String month;
        switch (n){
            case 1-> month = "January has 31 days";
            case 2-> month = "February has 28 days ";
            case 3-> month = "March has 31 days";
            case 4-> month = "April has 30 days";
            case 5-> month = "May has 31 days";
            case 6-> month = "June has 30 days";
            case 7-> month = "July has 31 days";
            case 8-> month = "August has 30 days";
            case 9-> month = "September has 30 days";
            case 10-> month = "Octomber has 31 days";
            case 11-> month = "November has 30 days";
            case 12-> month = "December has 31 days";
            default -> month = "Invalid number";
        } return month;
    }

}
/* . Create a class named DayAndMonth:

	3.1 Create a method named day that displays the day's name based on the given number.
	If the number is invalid, print "Invalid Number".

			Example:
				day(5);

			Output:
				Friday

	3.2 Create a method named monthName that displays the month's name based on the given number.
	If the number is invalid, print "Invalid Number."


			Example:
				monthName(6);

			Output:
				June

	3.3 Create a method named daysInMonth that displays the number of days in the month based on the given number.
	If the number is invalid, print "Invalid Number."

				Example:
					daysInMonth(6);

				Output:
					June has 30 days

 */