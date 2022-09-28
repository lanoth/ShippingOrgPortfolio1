public class Compartment {
    private final int CAPACITY;
    private int fill;
    // Capacity and fill are thought to be liters
    public Compartment(int fill, int capacity){
        this.fill = fill;
        this.CAPACITY = capacity;
    }

    public int getCAPACITY() {
        return CAPACITY;
    }

    public int getFill() {
        return fill;
    }

    public void setFill(int fill) {
        this.fill = fill;
    }

    public boolean isFull(){
        return fill > 0;
    }
}
