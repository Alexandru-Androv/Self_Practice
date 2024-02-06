package jd11_class_and_objects_part2;

public class CarpetClients {
    public static void main(String[] args) {


        Carpet carpet1 = new Carpet();
        carpet1.width = 2.2;
        carpet1.length = 1.4;
        carpet1.unitPrice = 23;
        carpet1.isPersian = true;
        double reuslt1 = carpet1.calcCost();
        System.out.println(carpet1);
        System.out.println(reuslt1);


        Carpet carpet2 = new Carpet();
        carpet2.width = 2.2;
        carpet2.length = 1.4;
        carpet2.unitPrice = 10;
        carpet2.isPersian = false;
        double reuslt2 = carpet2.calcCost();
        System.out.println(carpet2);
        System.out.println(reuslt2);

        Carpet carpet3= new Carpet();
        carpet3.width = 2.0;
        carpet3.length = 4;
        carpet3.unitPrice = 10;
        carpet3.isPersian = true;
        double reuslt3 = carpet3.calcCost();
        System.out.println(carpet3);
        System.out.println(reuslt3);

    }
}
