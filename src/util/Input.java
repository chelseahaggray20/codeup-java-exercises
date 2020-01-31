package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input(){
        this.scanner = new Scanner(System.in);
    }

    public String getString(){
        String answer;
        System.out.println("Enter a string: ");
        answer = this.scanner.next();
        return answer;
    }

    public String getString(String prompt) {
        String answer;
        System.out.println(prompt);
        answer = this.scanner.next();
        return answer;
    }

    public boolean yesNo(){
        String answer;
        System.out.println("What is your answer? (yes/no): ");
        answer = this.scanner.next();
        return answer.toLowerCase().startsWith("y");
    }

    public boolean yesNo(String prompt){
        String answer;
        System.out.println(prompt);
        answer = this.scanner.next();
        return answer.toLowerCase().startsWith("y");
    }

    public int getInt(int min, int max) {
        int answer;
        do {
            System.out.println("Enter an integer betweeen " + min + " and " + max +": ");
            answer = this.scanner.nextInt();
        } while (answer < min || answer > max);
        return answer;
    }

    public int getInt(String prompt, int min, int max) {
        int answer;
        do {
            System.out.println(prompt);
            answer = this.scanner.nextInt();
        } while (answer < min || answer > max);
        return answer;
    }

    public int getInt() {
        int answer;
        System.out.println("Enter an integer: ");
        answer = this.scanner.nextInt();
        return answer;
    }

    public int getInt(String prompt) {
        int answer;
        System.out.println(prompt);
        answer = this.scanner.nextInt();
        return answer;
    }

    public double getDouble(double min, double max) {
        double answer;
        do {
            System.out.println("Enter a double betweeen " + min + " and " + max +": ");
            answer = this.scanner.nextDouble();
        } while (answer < min || answer > max);
        return answer;
    }

    public double getDouble(String prompt, double min, double max) {
        double answer;
        do {
            System.out.println(prompt);
            answer = this.scanner.nextDouble();
        } while (answer < min || answer > max);
        return answer;
    }

    public double getDouble() {
        return getDouble("Enter a double: ");
    }

    public double getDouble(String prompt) {
        double answer;
        System.out.println(prompt);
        answer = this.scanner.nextDouble();
        return answer;
    }

}