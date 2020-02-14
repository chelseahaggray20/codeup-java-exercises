package review;

import java.util.Arrays;
import java.util.Scanner;

//Create a class named 'Assessment' inside of the src directory

public class operators {
    private static int a;
    private static int b;


    //Write a public static method named 'square' that accepts an integer as input and returns that number times itself

    //    public static int integer(int num) {
//        Scanner in = new Scanner(System.in);
//        int myNumber = in.nextInt();
//        return myNumber * myNumber;
//
//    }
    public static int square(int num) {
        Scanner scanner = new Scanner(System.in);
        int myNumber = scanner.nextInt();
        return (int) Math.pow(myNumber, 2);
    }


    // Create a method called add that accepts two arguments and returns the result as an int and a double (use method overloading)
    public static int add(int a, int b) {
        return a += b;

    }

    public static double add(double a, double b) {
        return a += b;
    }


//Write a public static method named 'average' that takes in an array of integers and returns the average as a double.(make sure the average of [1,2] is 1.5.

    public static double getAverage(int[] array) {
        int sum = 0;
        for (int i : array) sum += i;
        return ((double) sum) / array.length;
    }

    public static double average(int[] array) {
        return Arrays.stream(array).average().orElse(Double.NaN);
    }

    public static void main(String[] args) {
//        System.out.println(square());
        System.out.println(add(11.7, 6));
        System.out.println(average(new int[]{5, 2, 5, 6, 7, (int) 11.2}));//casting int

    }
}
