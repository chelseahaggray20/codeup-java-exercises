package inheritance;

public class Truck extends Vehicle {

    public Truck(){
        super(4);
        this.numberOfTires = 4;
    }

    public void go(){
        System.out.println("Vrooooooooom! Get outta my way!");
    }
}