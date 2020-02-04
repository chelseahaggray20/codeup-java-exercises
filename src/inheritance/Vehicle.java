package inheritance;

public class Vehicle {
    protected int numberOfTires;

    public Vehicle(int numberOfTires) {
        this.numberOfTires = numberOfTires;
    }

    public void go(){
        System.out.println("Vehicle:Here we go");
    }

    public void report() {
        System.out.println("I have " + this.numberOfTires + " tires.");
    }
}