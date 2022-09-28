public class Container extends Vessel {

    private final int CAPACITY;
    private int containerAmount;

    public Container(String flagNation, float draft, int length, int width, int capacity) {
        super(flagNation, draft, length, width);
        this.CAPACITY = capacity;
    }

    public void loadingCargo(int containerAmount) {
        if (containerAmount > CAPACITY) {
            System.out.println("Loading denied - amount of containers exceeds capacity");
        } else {
            this.containerAmount = containerAmount;
        }
    }

    public int getContainerAmount() {
        return containerAmount;
    }
    @Override
    public Double utilityLevelOfCapacity() {
        if (containerAmount == 0) {
            System.out.println("No cargo currently loaded");
        }
            return  (double) containerAmount/CAPACITY;
    }

}
