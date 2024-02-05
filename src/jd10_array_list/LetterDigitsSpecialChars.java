package jd10_array_list;

public class LetterDigitsSpecialChars {
    public static void main(String[] args) {
        String  str = "\"Wooden Spoon123!\"";
        char[] arr1 = str.toCharArray();
        String letters = "";
        String numbers = "";
        String spChar = "";
        for (char eachChar : str.toCharArray()) {
            if(Character.isLetter(eachChar)){
                letters +=eachChar;
            }
            if (Character.isDigit(eachChar)){
                numbers += eachChar;
            }
            if(!Character.isLetterOrDigit(eachChar)){
                spChar += eachChar;
            }

        }
        System.out.println("letters= \"" + letters + "\";");
        System.out.println("numbers are = \"" + numbers + "\";");
        System.out.println("speciac characters are = " + spChar +";");

    }
}
/*
 Create a class called LettersDigitsSpecialChars and write a program with the following specifications:
   1.1 Given a string, retrieve and display the letters, digits, and special characters separately.
   Example:

	        Example:
	            str = "Wooden Spoon123!"

	        output:
	            letters= "WoodenSpoon";
	            Digits = "123";
	            specialChars = " !";
 */
