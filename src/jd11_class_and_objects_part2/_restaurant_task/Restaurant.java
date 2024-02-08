/*package jd11_class_and_objects_part2._restaurant_task;
import jd11_class_and_objects_part2._restaurant_task.Cheff;
import jd11_class_and_objects_part2._restaurant_task.Server;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Restaurant {
    public String owner, location;
    public int numberOfStars;
    public ArrayList<String>servers = new ArrayList<>(Arrays.asList());
    public ArrayList<String>chefs = new ArrayList<>(Arrays.asList());


    public Restaurant(String owner, String location, int numberOfStars) {
        this.owner = owner;
        this.location = location;
        this.numberOfStars = numberOfStars;
    }
    public void hireServer(Server server){
        servers.add(String.valueOf(server));
    }
    public void hireServer(Server[] servers){
        this.servers.addAll(new ArrayList(List.of(servers)));
    }
    public void hireChef(Cheff chef){
        chefs.add(chef);
    }
    public void hireChef(Cheff[] chefs){
        this.chefs.addAll(Arrays.asList(chefs));
    }
    public void terminateChef(int employeeID){
        chefs.remove(employeeID);
    }
    public void terminateServer(int employeeID){
        servers.remove(employeeID);
    }

    public String toString() {
        return "Restaurant{" +
                "owner='" + owner + '\'' +
                ", location='" + location + '\'' +
                ", numberOfStars=" + numberOfStars +
                ", servers=" + servers +
                ", chefs=" + chefs +
                '}';
    }
}
/*
Create a custom class named Restaurant with the following specifications:

	Attributes:
			Owner (String)
			Location (String)
			numberOfStars (int)
			Servers (ArrayList of Server objects)
			Chefs (ArrayList of Chef objects)

	Add a constructor that sets the owner, location, and number of stars.

	Actions:
		hireServer(Server server): adds a server object to the Servers ArrayList
		hireServer(Server[] servers): adds an array of Server objects to the Servers ArrayList
		hireChef(Chef chef): adds a chef object to the Chefs ArrayList
		hireChef(Chef[] chefs): adds an array of Chef objects to the Chefs ArrayList
		terminateChef(int employeeID): removes the chef with the matching ID from the Chefs ArrayList
		terminateServer(int employeeID): removes the server with the matching ID from the Servers ArrayList
		toString(): returns a string representation of the Restaurant object, including the number of Servers and Chefs alongside other information

 */