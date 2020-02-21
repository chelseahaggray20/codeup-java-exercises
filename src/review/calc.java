package review;
import java.util.Scanner;

public class calc {

    public static long add(long i, long j) {
        return i + j;
    }

    public static long subtract(long i, long j) {
        return i - j;
    }

    public static long multiply(long i, long j) {
        return i * j;
    }

    public static long divide(long i, long j) {
        long quotient = 0;
        try {
            quotient = i / j;
        } catch (ArithmeticException ae) {
            System.out.println("ArithmeticException occurred!");
        }
        return quotient;
    }

    protected static Object[] getValues(Scanner scanner) throws NumberFormatException {
        Integer[] values = new Integer[2];
        System.out.print("\nEnter the first number: ");
        String sNum = scanner.nextLine();
        values[0] = Integer.parseInt(sNum);
        System.out.print("Enter the second number: ");
        sNum = scanner.nextLine();
        values[1] = Integer.parseInt(sNum);
        return values;
    }

    public static void main(String[] args) {

        // setup
        Scanner scanner = new Scanner(System.in);
        String input = "";
        String sNum = "";
        Integer[] values;

        // feedback loop
        do {
            System.out.print("\nEnter an option: \'+\', \'-\', \'*\', \'/\', or \'exit\': ");
            input = scanner.nextLine();

            // watch for bad data entry
            try {
                switch (input.toLowerCase()) {
                    case ("exit"):
                        break;
                    case ("+"):
                        values = (Integer[]) calc.getValues(scanner);
                        System.out.printf("The sum of %d and %d is %d\n\n", values[0], values[1], calc.add(values[0], values[1]));
                        break;
                    case ("-"):
                        values = (Integer[]) calc.getValues(scanner);
                        System.out.printf("The difference of %d minus %d is %d\n\n", values[0], values[1], calc.subtract(values[0], values[1]));
                        break;
                    case ("*"):
                        values = (Integer[]) calc.getValues(scanner);
                        System.out.printf("The product of %d times %d is %d\n\n", values[0], values[1], calc.multiply(values[0], values[1]));
                        break;
                    case ("/"):
                        values = (Integer[]) calc.getValues(scanner);
                        System.out.printf("The quotient of %d divided by %d is %d\n\n", values[0], values[1], calc.divide(values[0], values[1]));
                        break;
                    default:
                        System.out.printf("Invalid Option");
                        break;
                }
            } catch (NumberFormatException nfe) {
                System.out.println("\nInvalid number entry\n");
            }
        } while (!input.equalsIgnoreCase("exit"));
    }
}