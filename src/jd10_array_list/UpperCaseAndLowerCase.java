package jd10_array_list;

public class UpperCaseAndLowerCase {
    public static void main(String[] args) {
        String str = "JAVA java";
        char[] ch = str.toCharArray();
        int count = 0;
        int count2 = 0;
        for (int i = 0; i < ch.length; i++) {
            if(Character.isLowerCase(ch[i])){
             count++;
            }
            if (Character.isUpperCase(ch[i])){
                count2++;

            }

        }
        if(count == count2){
            System.out.println(true);
        }else {
            System.out.println(false);
        }

    }

}
/*

2. Create a class called UpperCaseAndLowerCase and write a program with the following specifications:
   2.1 Given a string, return true if the total number of uppercase characters is equal to the total number of lowercase characters.

	        Eamplex:
	            str = "JAVA java";

	        output:
	            true

 */