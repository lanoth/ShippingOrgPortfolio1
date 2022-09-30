public class Container extends Vessel {

    private final int CAPACITY;
    private int containerAmount;

    public Container(String flagNation, float draft, int length, int width, int capacity) {
        super(flagNation, draft, length, width);
        this.CAPACITY = capacity;
    }

    // Tanker.loadingCargo() takes a specified containerAmount, checks if the specified amounts exceeds the capacity,
    // and sets an objects' containerAmount to this.
    public void loadingCargo(int containerAmount) {
        if (this.containerAmount + containerAmount > CAPACITY) {
            System.out.println("Loading denied - amount of containers exceeds capacity");
        } else {
            this.containerAmount += containerAmount;
        }
    }
    // Getter for current containerAmount
    public int getContainerAmount() {
        return containerAmount;
    }

    // utlityLevelOfCapacity returning the current containerAmount divided by the vessels' CAPACITY returned as a double.
    @Override
    public Double utilityLevelOfCapacity() {
        if (containerAmount == 0) {
            System.out.println("No cargo currently loaded");
        }
            return  (double) containerAmount/CAPACITY;
    }

}
