import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;

public class MainTest {
    @Test
    void testContainer_loadingCargo() {
        //This test checks if loadingCargo() loads the specified amount of containers.
        Container container = new Container("DK", 2.5f, 25, 8, 50);
        container.loadingCargo(25);
        assertEquals(25, container.getContainerAmount());
    }
    @Test
    void testContainer_loadingCargoFailed() {
        //This test checks if loadingCargo() allows loading a containerAmount that exceeds the ships' capacity.
        Container container = new Container("DK", 2.5f, 25, 8, 50);
        container.loadingCargo(55);
        assertEquals(0, container.getContainerAmount());
    }
    @Test
    void testContainer_utilitylevelOfCapacity(){
        //This test checks if the utilitylevelOfCapacity() is returned correctly following loadingCargo().
        Container container = new Container("DK", 2.5f, 25, 8, 50);
        container.loadingCargo(25);
        assertEquals(0.5, container.utilityLevelOfCapacity());
    }
    @Test
    void testTanker_loadingCargo(){
        //This test checks if loadingCargo() loads the specified fill to the specified tank.
        Tanker tanker = new Tanker("DK",2.5f,25,10,7);
        tanker.loadingCargo(50,0);
        assertEquals(50,tanker.compartments[0].getFill());
    }
    @Test
    void testTanker_loadingCargoFailed(){
        //This test checks if loadingCargo() allows exceeding the capacity of a tank.
        Tanker tanker = new Tanker("DK",2.5f,25,10,7);
        tanker.loadingCargo(110,0);
        assertEquals(0,tanker.compartments[0].getFill());
    }
    @Test
    void testTanker_utilitylevelOfCapacity(){
        //This test checks if utilitylevelOfCapacity() is returned correctly following loadingCargo()
        Tanker tanker = new Tanker("DK",2.5f,25,10,7);
        tanker.loadingCargo(50,0);
        assertEquals(0.14285714285714285,tanker.utilityLevelOfCapacity());
    }
    @Test
    void testRoRo_loadingCargo(){
        //This test checks if loadingCargo() loads the specified amount of cars/trucks
        RoRo roRo = new RoRo("DK",2.5f,25,10,300);
        roRo.loadingCargo(5,5);
        assertEquals(5*8+5*30,roRo.getTotalVehicleLength());
    }
    @Test
    void testRoRo_loadingCargoFailed(){
        //This test checks if loadingCargo() allows exceeding the specified amount of laneMeters
        RoRo roRo = new RoRo("DK",2.5f,25,10,300);
        roRo.loadingCargo(100,100);
        assertEquals(0,roRo.getTotalVehicleLength());
    }
    @Test
    void testRoRo_utilitylevelOfCapacity(){
        //This test checks if utilitylevelOfCapacity is returned correctly following loadingCargo()
        RoRo roRo = new RoRo("DK",2.5f,25,10,300);
        roRo.loadingCargo(1,1);
        assertEquals(0.12666666666666668,roRo.utilityLevelOfCapacity());
    }
    @Test
    void testVesselPosition(){
        //This test checks if the setRoute method correctly sets the current position and destination of a vessel,
        //and getRoute() returns the aforementioned in the correct format.
        Tanker tanker = new Tanker("DK",2.5f,25,10,7);
        tanker.setRoute("Hanstholm","Göteborg");
        assertEquals("Hanstholm -> Göteborg",tanker.getRoute());
    }
    @Test
    void testFindSuitableVessel(){
        //This test checks if findSuitableVessel correctly returns a pointer to an object that is a suitable
        //fit for the specified amount/type of cargo.
        Vessel[] vessels = {new Tanker("DK",2.5f,25,10,7)};
        Vessel.findSuitableVessel(vessels,"Container",10);
        assertEquals("Container", Vessel.findSuitableVessel(vessels,"container",10).getClass().getName());
    }
}