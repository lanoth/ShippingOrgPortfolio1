public class Tanker extends Vessel{

    Compartment[] compartments;

    // Tanker constructor - tankers must have between 1 and 10 compartmens, and therefore i've implemented two checks.
    // If compartments are set to more than 10 compartmentAmount = 10
    // If compartments are set to 0 or less compartmentAmount = 10
    // Thereafter the specified amount of compartments is used to run through a loop x amount of times
    // creating new compartment objects.
    public Tanker(String flagNation, float draft, int length, int width, int compartmentAmount) {
        super(flagNation, draft, length, width);
        if(compartmentAmount>10){
            System.out.println("A tankers max capacity is 10 compartments. Amount of compartments set to 10!");
            compartmentAmount=10;
        } else if (compartmentAmount==0) {
            System.out.println("A tankers minimum capacity is 1 compartment. Amount of compartments set to 1!");
            compartmentAmount=1;
        }
        compartments = new Compartment[compartmentAmount];
        for (int i = 0; i < compartmentAmount; i++){
            compartments[i] = new Compartment(0, 100);
        }
    }

    // utilityLevelOfCapacity found using a for each loop, running through the array of compartments created above.
    // The loop checks if the compartment isFull() which is a boolean that returns true if the compartments fill
    // is more than 0.
    @Override
    public Double utilityLevelOfCapacity() {
        int counter = 0;
        for (Compartment compartment : compartments) {
            if (compartment.isFull()) counter++;
        }
        return (double) counter/compartments.length;
    }

    // loadingCargo() - implemented checks to make sure compartments aren't "overfilled" and that compartments already
    // containing a fluid aren't filled yet again (potentially with a new fluid).
    public void loadingCargo(int fill, int tankToFill){
        if(compartments[tankToFill].getFill()+fill >compartments[tankToFill].getCAPACITY()){
            System.out.println("Fill denied - fill amount exceeds capacity");
        }else if(compartments[tankToFill].getFill()>0){
            System.out.println("Fill denied - compartment already filled");
        }else{
            compartments[tankToFill].setFill(fill);
        }
    }
}
