package jd13_inheritance._state;

public class California extends State {
    public California(String name, String abbreviation, String politicalParty,
                      String governor, String senator, int population){
        super(name, abbreviation,politicalParty, governor, senator, population);
    }
    public void laws(){
        System.out.println("All ridicolous laws in the country starts from CA");
    }

}
