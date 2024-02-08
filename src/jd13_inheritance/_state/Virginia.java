package jd13_inheritance._state;

public class Virginia extends State{
    public Virginia(String name, String abbreviation, String politicaParty,
                    String governor, String senator, int population) {
        super(name, abbreviation, politicaParty, governor, senator, population);
    }
    public void capitol(){
        System.out.println("State capitol is Richmond");
    }
    public void memo(){
        System.out.println("Virginia is for lovers ");
    }

}
