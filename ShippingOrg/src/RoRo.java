
public class RoRo extends Vessel{
    private final int LANE_METERS;
    private int totalVehicleLength;

    public RoRo(String flagNation, float draft, int length, int width, int laneMeters) {
        super(flagNation, draft, length, width);
        this.LANE_METERS = laneMeters;
    }

    // loadingCargo() - implemented a way of calculating the combinedLengths of cars and trucks, which is used to
    // check if the RoRo is able to carry the specified amount of vehicles.
    public void loadingCargo(int cars, int trucks) {
        int carLength = 8;
        int combinedCarLengths = cars * carLength;
        int truckLength = 30;
        int combinedTruckLengths = trucks * truckLength;
        if((this.totalVehicleLength + combinedCarLengths + combinedTruckLengths) > LANE_METERS){
            System.out.println("Loading denied - amount of vehicles exceeds capacity");
        } else {
            this.totalVehicleLength += combinedCarLengths + combinedTruckLengths;
        }
    }

    // Getter for totalVehicleLength.
    public int getTotalVehicleLength() {
        return totalVehicleLength;
    }

    @Override
    public Double utilityLevelOfCapacity() {
        if (totalVehicleLength == 0) {
            System.out.println("No vehicles currently loaded");
        }
            return (double) totalVehicleLength/LANE_METERS;
    }
}
