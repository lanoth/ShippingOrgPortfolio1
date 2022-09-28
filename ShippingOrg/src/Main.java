public class Main {

    public static void main(String[] args) {

        System.out.println("\n-----Information regarding container ship: ");
        // Creating container object, loading the ship, displaying level of capacity.
        Container container = new Container("DK", 2.5f, 25, 8, 50);
        container.loadingCargo(33);
        System.out.println(container.utilityLevelOfCapacity());

        System.out.println("\n-----Information regarding tanker ship: ");
        // Creating container object, loading the ship, displaying level of capacity.
        Tanker tanker = new Tanker("US", 12.7f, 76, 14, 3);
        tanker.loadingCargo(25,0);
        tanker.loadingCargo(25,2);
        System.out.println(tanker.utilityLevelOfCapacity());

        System.out.println("\n-----Information regarding RoRo ship: ");
        // Creating container object, loading the ship, displaying level of capacity.
        RoRo roRo = new RoRo("SWE", 1.2f, 40, 12, 300);
        roRo.loadingCargo(3, 3);
        System.out.println(roRo.utilityLevelOfCapacity());
    }
}
