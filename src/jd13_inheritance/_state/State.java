package jd13_inheritance._state;

public class State{
    private String name, abbreviation,
                   politicalParty, governor, senator;
    private int population;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
         if (name.isEmpty() || name.isBlank() || name == null){
             System.err.println("Name can't be null, empty or blank");
             System.exit(1);
         }
        this.name = name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
         if (abbreviation.isEmpty() || abbreviation.isBlank() || abbreviation == null){
             System.err.println("Abbreviation can't be null, empty or blank");
             System.exit(1);
         }
        this.abbreviation = abbreviation;
    }

    public String getPoliticalParty() {
        return politicalParty;
    }

    public void setPoliticalParty(String politicalParty) {
         if (politicalParty.isEmpty() || politicalParty.isBlank() || name == null){
             System.err.println("Political party can't be null, empty or blank");
             System.exit(1);
         }
        this.politicalParty = politicalParty;
    }

    public String getgovernor() {
        return governor;
    }

    public void setGovernor(String governor) {
        if (governor.isEmpty() || governor.isBlank() || governor == null){
            System.err.println("Governor can't be null, empty or blank");
                    System.exit(1);
        }
        this.governor = governor;
    }

    public String getSenator() {
        return senator;
    }

    public void setSenator(String senator) {
        if (senator.isEmpty() || senator.isBlank() || name == null){
            System.err.println("Senator can't be null, empty or blank");
                    System.exit(1);
        }
        this.senator = senator;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
    public State(String name, String abbreviation, String politicalParty,
                 String governor, String senator, int population){
        setName(name);
        setAbbreviation(abbreviation);
        setPoliticalParty(politicalParty);
        setGovernor(governor);
        setSenator(senator);
        setPopulation(population);
    }

    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", abbreviation='" + abbreviation + '\'' +
                ", politicalParty='" + politicalParty + '\'' +
                ", governor='" + governor + '\'' +
                ", senator='" + senator + '\'' +
                ", population=" + population +
                '}';
    }
}
/*
State Task Requirements:
1. Create a class named 'State' with the following specifications:
   Attributes:
       - name: String
       - abbreviation: String
       - politicalParty: String
       - Governor: String
       - senator: String
       - population: int

   Encapsulation Requirements:
       - Ensure attributes are private with getters and setters.
       - Conditions for Encapsulation:
           - 'name', 'abbreviation', 'politicalParty', 'Governor', and 'senator' must not be null, empty, or blank.
           - 'population' must be greater than zero.

   Constructor:
       - Add a constructor to initialize all fields.

   Methods:
       - toString(): Prints the information of the State object.

 */
