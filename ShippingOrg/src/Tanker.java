public class Tanker extends Vessel{

    Compartment[] compartments;
    //int compartmentAmount;

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


    @Override
    public Double utilityLevelOfCapacity() {
        int counter = 0;
        for (Compartment compartment : compartments) {
            if (compartment.isFull()) counter++;
        }
        return (double) counter/compartments.length;
    }

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
