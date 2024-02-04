package jd08_string_class;
import java.util.Scanner;
public class StartsWithX {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("Enter your word:");
        String word = input.next();
        if(word.startsWith("x")){
            System.out.println("a" + word.substring(1));
        } else System.out.println(word);
        input.close();

    }
}
