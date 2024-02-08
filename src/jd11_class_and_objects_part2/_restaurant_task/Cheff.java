/*package jd11_class_and_objects_part2._restaurant_task;

public class Cheff {
    public String name;
    public int employeeID;
    public double hourlyRate;
    public boolean fullTime;

    public Cheff(String name, int employeeID, double hourlyRate, boolean fullTime) {
        this.name = name;
        this.employeeID = employeeID;
        this.hourlyRate = hourlyRate;
        this.fullTime = fullTime;
    }
    public void makeorders(){
        System.out.println(name + " is making an order");
    }
    public void washDishes(){
        System.out.println(name + "is washing dishes");
    }

    public String toString() {
        return "Cheff{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", hourlyRate=" + hourlyRate +
                ", fullTime=" + fullTime +
                '}';
    }
}
/*
Restaurant Task (EXTRA SPICY)
Create a custom class named Chef with the following specifications:

	Attributes:
			name (String)
			employeeID (int)
			hourlyRate (double)
			fullTime (boolean)

	Add A constructor that can set all the fields.

	Actions:
		makeOrder(): prints chef's name + " is making an order"
		washDishes(): prints chef's name + " is washing the dishes"
		toString(): returns a string representation of a Chef, including full-time or part-time status











Create a class named LocalRestaurant with a main method:
	Create a Restaurant object
	Create an array of servers and chefs with their information set
	Add the initial servers and chefs to the respective ArrayLists in the Restaurant object
	Print the whole restaurant's information
 */
