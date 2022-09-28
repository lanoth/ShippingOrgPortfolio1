
public class RoRo extends Vessel{
    private final int LANE_METERS;
    private int totalVehicleLength;

    public RoRo(String flagNation, float draft, int length, int width, int laneMeters) {
        super(flagNation, draft, length, width);
        this.LANE_METERS = laneMeters;
    }

    public void loadingCargo(int cars, int trucks) {
        int carLength = 8;
        int combinedCarLengths = cars * carLength;
        int truckLength = 30;
        int combinedTruckLengths = trucks * truckLength;
        if((combinedCarLengths + combinedTruckLengths) > LANE_METERS){
            System.out.println("Loading denied - amount of vehicles exceeds capacity");
        } else {
            this.totalVehicleLength = combinedCarLengths + combinedTruckLengths;
        }
    }

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
