package jd13_inheritance._state;

public class StateClients {
    public static void main(String[] args) {

        Virginia client1 = new Virginia("Virginia", "VA", "Republican",
                "Glen Youngkin", "Mark Warner", 235647);
        client1.memo();
        client1.capitol();
        System.out.println(client1);

        System.out.println();

        Florida client2 = new Florida("Florida", "FL", "Republican",
                "Desantis", "unknown", 223211);
        client2.weather();
        System.out.println(client2);
    }

}
/*
Create a class named 'StateClients':
   - Create multiple objects representing different states.
   - Test the methods and variables of each object.
 */
