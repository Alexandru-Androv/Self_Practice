package jd13_inheritance._state;

public class Florida extends State{
    public Florida(String name, String abbreviation, String politicalParty,
                   String governor, String senator, int population) {
        super(name, abbreviation, politicalParty, governor, senator, population);
    }
    public void weather(){
        System.out.println("There is no winter in Florida");
    }
}
