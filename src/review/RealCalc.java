//package review;
//
//import java.util.Scanner;
//
//public class RealCalc extends   Calc {
//    public static double add(double r, double f) {
//        return r + f;
//    }
//
//    public static double subtract(double r, double f) {
//        return r - f;
//    }
//
//    public static double multiply(double r, double f) {
//        return r * f;
//    }
//
//    public static double divide(double r, double f) {
//        double quotient = 0;
//        try {
//            quotient = r / f;
//        } catch (ArithmeticException ae) {
//            System.out.println("ArithmeticException occurred!");
//        }
//        return quotient;
//    }
//
//    protected static Object[] getValues(Scanner scanner) throws NumberFormatException {
//        Double[] values = new Double[2];
//        System.out.print("\nEnter the first number: ");
//        String sNum = scanner.nextLine();
//        values[0] = Double.parseDouble(sNum);
//        System.out.print("Enter the second number: ");
//        sNum = scanner.nextLine();
//        values[1] = Double.parseDouble(sNum);
//        return values;
//    }
//
//    public static void main(String[] args) {
//
//        // setup
//        Scanner scanner = new Scanner(System.in);
//        String input = "";
//        String sNum = "";
//        int choice = 0;
//        Integer[] values;
//        Double[] dValues;
//
//        // feedback loop
//        do {
//            System.out.print("\nSelect option: \n");
//            System.out.println();
//            System.out.println("\t1) exit");
//            System.out.println("\t2) Integer Add");
//            System.out.println("\t3) Integer Subtract");
//            System.out.println("\t4) Integer Multiply");
//            System.out.println("\t5) Integer Divide");
//            System.out.println("\t6) Real Add");
//            System.out.println("\t7) Real Subtract");
//            System.out.println("\t8) Real Multiply");
//            System.out.println("\t9) Real Divide");
//            System.out.println();
//            System.out.print("Enter choice: ");
//            sNum = scanner.nextLine();
//            try {
//                choice = Integer.parseInt(sNum);
//            } catch (NumberFormatException nfe) {
//                System.out.println("\nInvalid number entry\n");
//                continue;
//            }
//
//            // use try to catch bad input
//            try {
//                switch (choice) {
//                    case (1):
//                        break;
//                    case (2):
//                        values = (Integer[]) Calc.getValues(scanner);
//                        System.out.printf("The sum of %d and %d is %d\n\n", values[0], values[1], Calc.add(values[0], values[1]));
//                        break;
//                    case (3):
//                        values = (Integer[]) Calc.getValues(scanner);
//                        System.out.printf("The difference of %d minus %d is %d\n\n", values[0], values[1], Calc.subtract(values[0], values[1]));
//                        break;
//                    case (4):
//                        values = (Integer[]) Calc.getValues(scanner);
//                        System.out.printf("The product of %d times %d is %d\n\n", values[0], values[1], Calc.multiply(values[0], values[1]));
//                        break;
//                    case (5):
//                        values = (Integer[]) Calc.getValues(scanner);
//                        System.out.printf("The quotient of %d divided by %d is %d\n\n", values[0], values[1], Calc.divide(values[0], values[1]));
//                        break;
//                    case (6):
//                        dValues = (Double[]) RealCalc.getValues(scanner);
//                        System.out.printf("The sum of %f and %f is %f\n\n", dValues[0], dValues[1], RealCalc.add(dValues[0], dValues[1]));
//                        break;
//                    case (7):
//                        dValues = (Double[]) RealCalc.getValues(scanner);
//                        System.out.printf("The difference of %f minus %f is %f\n\n", dValues[0], dValues[1], RealCalc.subtract(dValues[0], dValues[1]));
//                        break;
//                    case (8):
//                        dValues = (Double[]) RealCalc.getValues(scanner);
//                        System.out.printf("The product of %f times %f is %f\n\n", dValues[0], dValues[1], RealCalc.multiply(dValues[0], dValues[1]));
//                        break;
//                    case (9):
//                        dValues = (Double[]) RealCalc.getValues(scanner);
//                        System.out.printf("The quotient of %f divided by %f is %f\n\n", dValues[0], dValues[1], RealCalc.divide(dValues[0], dValues[1]));
//                        break;
//                    default:
//                        System.out.printf("Invalid Option");
//                        break;
//                }
//            } catch (NumberFormatException nfe) {
//                System.out.println("\nInvalid number entry\n");
//            }
//        } while (choice != 1);
//    }
//
//
//}