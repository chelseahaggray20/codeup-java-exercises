import java.util.*;
public class SlotMachine {
    static int slots[][]= new int[3][3];
    static Random r = new Random();
    static Scanner s = new Scanner(System.in);
    static int bet = 0;
    static int balance = 2000;
    static int hCtr = 0;//variable counter for rows that has 3 slots with same values
    static int temp = 0;//holds value for comparison
    static String answer = " ";//holds user input for play again
    static int jack = 0;//variable counter for jackpot

    public static void main(String[] args) {
        start();
    }