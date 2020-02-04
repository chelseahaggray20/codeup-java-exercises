package inheritance;

public class Motorcycle extends Vehicle{

    public Motorcycle(){
        super(2);
    }

    public void report() {
        System.out.println("I am a motorcycle!");
    }
}