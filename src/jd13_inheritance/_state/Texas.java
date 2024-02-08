package jd13_inheritance._state;

public class Texas extends State{


    public Texas(String name, String abbreviation, String politicalParty,
                 String governor, String senator, int population) {
        super(name, abbreviation, politicalParty, governor, senator, population);
    }
    public void size(){
        System.out.println("Texas is second largest state in USA");
    }

}
