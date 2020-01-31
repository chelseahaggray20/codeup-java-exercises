import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {

        int a = 7;
        int b = 22;

//        System.out.println(divide(b, 0));
//        factorial();
        System.out.println(rollDice());
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        return a / b;
    }

    public static double modulus(double a, double b) {
        return a % b;
    }

    public static int getInteger(int min, int max) {
        int answer;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Enter a number betweeen " + min + " and " + max +": ");
            answer = scan.nextInt();
        } while (answer < min || answer > max);
        return answer;
    }
    public static int getIntegerR(int min, int max) {
        int answer;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number betweeen " + min + " and " + max +": ");
        answer = scan.nextInt();
        if (answer < min || answer > max)
            return getIntegerR(min, max);
        else
            return answer;
    }

    public static void factorial() {
        int base = getInteger(1,10);
        long fact = 1;
        String output = "! = 1";
        System.out.printf("1%s\n", output);
        for (int i = 2; i<= base;i++) {
            fact *= i;
            output += " x " + i;
            System.out.printf("%d%s = %d\n", i,output, fact);
        }
    }

    public static int rollDice() {
        int dice1 = 0;
        int dice2 = 0;
        int numSides = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("How many sides per die (2 dice)? ");
        numSides = getInteger(2,21);
        while (true) {
            dice1 = (int) Math.round(Math.floor(Math.random() * numSides + 1));
            dice2 = (int) Math.round(Math.floor(Math.random() * numSides + 1));
            System.out.printf("%d + %d = %d\n", dice1, dice2, (int)add(dice1,dice2));
            System.out.println("Would you like to roll again?");
            String answer = scan.next();
            if (answer.toLowerCase().contains("n")) return (int) add(dice1,dice2);
        }
    }

}