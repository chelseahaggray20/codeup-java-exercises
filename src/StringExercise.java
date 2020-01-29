import java.util.Scanner;

public class StringExercise {

    // main method for String exercises
    public static void main(String[] args) {
        StringExercise se = new StringExercise();
//        se.ex01();
//        se.talkToBob();
    }

    /**
     * For each of the following output examples: create a String variable that contains the
     * desired output and print it out to the console, you can do this with only one String
     * variable and one print statement for each output example.
     * <p>
     * We don't need no thought control
     * <p>
     * Check "this" out!, "s inside of "s!
     * <p>
     * In windows, the main drive is usually C:\
     * <p>
     * I can do backslashes \, double backslashes \\,
     * and the amazing triple backslash \\\!
     */
    public void ex01() {
        String string = new String();
        string = "We don't need no thought control\n";
        System.out.println(string);
        string = "Check \"this\" out!, \"s inside of \"s!\n";
        System.out.println(string);
        string = "In windows, the main drive is usually C:\\\n";
        System.out.println(string);
        string = "I can do backslashes \\, double backslashes \\\\,\n" +
                "and the amazing triple backslash \\\\\\!\n";
        System.out.println(string);
    }
}