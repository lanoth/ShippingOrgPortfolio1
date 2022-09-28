import java.util.ArrayList;

public abstract class Vessel {
    private final String FLAG_NATION;
    private final float DRAFT;
    private final int LENGTH, WIDTH;

    public Vessel(String flagNation, float draft, int length, int width) {
        this.FLAG_NATION = flagNation;
        this.DRAFT = draft;
        this.LENGTH = length;
        this.WIDTH = width;
    }
    public abstract Double utilityLevelOfCapacity();

    public void setRoute(String currentPosition, String destination) {    }
    public String getRoute() {
        //return currentPosition + "->" + destination;
        return null;
    }
    public static Vessel findSuitableVessel(Vessel[] vessels, String cargoType, int cargoAmount){
        return null;
    }

}