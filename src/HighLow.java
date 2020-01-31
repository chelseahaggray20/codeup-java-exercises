import java.util.Scanner;
import java.util.Random;


    public class HighLow {
        public static void main(String[] args) {
            Scanner readName = new Scanner(System.in);
            System.out.println("Enter your name: ");
            String userName = readName.nextLine();


            Scanner kbd = new Scanner (System.in);
            String decision;
            boolean yn;
            while (true) {
                System.out.println(userName + "Are you ready to start? + yes or no ");
                decision = kbd.nextLine();

                switch (decision) {
                    case "yes":
                        yn = true;
                        System.out.println("You may enter the game!");
                        break;

                    case "no":
                        yn = false;
                        System.out.println("You're not ready for this anyway!");
                        break;

                    default:
                        System.out.println("What would you like to do?");
                }
            }


    }
}
