package jd14_abstraction_and_polimophism_car;

public class CarClients {
    public static void main(String[] args) {
        Audi car1 = new Audi("q5", "s", 2023, 47_000, "White");
        car1.drive();
        car1.autoPark();
        System.out.println(car1);

        System.out.println();

        CydeoCar car2 = new CydeoCar("Cydeo", "Dreamer", 2024, 23_676, "Black");
        car2.fly();
        car2.selfDrive();
        car2.autoPark();
        System.out.println(car2);

    }
}
/*
11. Create a Class Named 'CarClients':
    - Instantiate an object from each concrete class.
    - Test all functions of each object.
    - Analyze the relationships between the classes.


 */