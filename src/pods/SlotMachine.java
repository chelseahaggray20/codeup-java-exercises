package pods;

import java.util.*;
public class SlotMachine {
    static int slots[][] = new int[3][3];
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

    public static void start() {
        //RECURSIVE METHOD
        //main flow of the program
        System.out.println("**************************");
        System.out.println("Welcome to Slot Machine");
        displayBalance();
        betPlace();
        roll(0);
        print();
        check();
        System.out.println("**************************");
        if (playAgain()) {
            reset();
            start();
        } else {
            System.out.println("Thank you for playing Slots!");
        }
    }

    public static void displayBalance() {
        //outputs current balance
        System.out.println("Current Balance: " + balance);
    }

    public static void betPlace() {
        //RECURSIVE METHOD
        //asks the user for their bet then checks if the bet is a valid or invalid one
        System.out.println("Place your bet to start the game: ");
        bet = s.nextInt();
        if (bet > balance) {
            System.out.println("Insufficient Balance.");
            betPlace();
        } else if (bet < 10) {
            System.out.println("Cannot continue. Bet is less than 10$.");
            betPlace();
        } else {
            System.out.println("Bet placed.");
            balance -= bet;
            displayBalance();
        }
    }

    public static void load() {
        //for excitement purposes
        System.out.print("Rolling.");
        for (int o = 0; o < 1000000000; o++) {
            if (o == 333333333) {
                System.out.print(".");
            } else if (o == 666666666) {
                System.out.print(".");
            } else if (o == 999999999) {
                System.out.print(".");
            }
        }
        System.out.println("");
    }

    public static void roll(int i) {
        //calls slots generator, checks and changes similar slot values within the same column
        generateRow(i);
        for (int j = 0; j < slots.length; j++) {
            while ((slots[0][j] == slots[1][j]) || (slots[0][j] == slots[2][j]) || (slots[1][j] == slots[2][j])) {
                if (slots[0][j] == slots[1][j]) {
                    slots[1][j] = r.nextInt(5);
                } else if (slots[0][j] == slots[2][j]) {
                    slots[2][j] = r.nextInt(5);
                } else {
                    slots[2][j] = r.nextInt(5);
                }
            }
        }
    }

    public static void generateRow(int i) {
        //RECURSIVE METHOD
        //generates rows
        int j = 0;
        if (i < 3) {
            generateSlot(i, j);
            generateRow(i + 1);
        }
    }

    public static void generateSlot(int i, int j) {
        //RECURSIVE METHOD
        //generates/gives a random value for a slot
        if (j < 3) {
            slots[i][j] = r.nextInt(5);
            generateSlot(i, j + 1);
        }
    }

    public static void print() {
        //prints the symbol according to the value of the slot
        for (int i = 0; i < slots.length; i++) {
            for (int j = 0; j < slots.length; j++) {
                if (slots[i][j] == 0) {
                    System.out.print("7\t");
                } else if (slots[i][j] == 1) {
                    System.out.print("1\t");
                } else if (slots[i][j] == 2) {
                    System.out.print("2\t");
                } else if (slots[i][j] == 3) {
                    System.out.print("3\t");
                } else if (slots[i][j] == 4) {
                    System.out.print("4\t");
                }
            }
            System.out.println("");
        }
    }

    public static void check() {
        //checks if the user wins the jackpot, and or normal slot win
        if (jackpotCheck(0)) {
            balance += bet * 10;
            System.out.println("You won the Jackpot! " + bet * 10 + "$ is added to your balance.");
        } else if (dCheck()) {
            balance += bet * 3;
            System.out.println("You won! " + bet * 3 + "$ is added to your balance.");
        } else if (hCheck(0) > 0) {
            balance += bet * 2 * hCtr;
            System.out.println("You won! " + bet * 2 * hCtr + "$ is added to your balance.");
        } else {
            System.out.println("Sorry you lost. Try again later.");
        }
        displayBalance();
    }

    public static boolean dCheck() {
        //checks for diagonals with 3 slots that have the same value
        temp = slots[1][1];
        if ((slots[0][0] == temp) && (slots[2][2] == temp)) {
            return true;
        } else if ((slots[2][0] == temp) && (slots[0][2] == temp)) {
            return true;
        } else {
            return false;
        }
    }

    public static int hCheck(int i) {
        //RECURSIVE METHOD
        //checks and counts rows that have 3 slots with the same value
        int h = 0;
        if (i == 3) {
            return hCtr;
        } else {
            temp = slots[i][i];
            for (int j = 0; j < slots.length; j++) {
                if (slots[i][j] == temp) {
                    h++;
                }
            }
            if (h == 3) {
                hCtr++;
            }
            hCheck(i + 1);
            return hCtr;
        }
    }

    public static boolean jackpotCheck(int i) {
        //RECURSIVE METHOD
        //counts the occurrence of "7" in the middle row then returns if jackpot or not
        temp = 0;
        if (i < 3) {
            if (slots[1][i] == temp) {
                jack++;
            }
            jackpotCheck(i + 1);
        }
        if (jack == 3) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean playAgain() {
        //asks user if he/she wants to play again
        if (balance < 10) {
            System.out.println("Your remaining balance is less than 10$. You cannot play anymore.");
            return false;
        } else {
            System.out.println("Do you want to play again?");
            System.out.println("Enter Y for Yes. Enter anything for No.");
            answer = s.next();
            if (answer.equals("Y") || answer.equals("y")) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static void reset() {
        //resets row and jackpot counters
        hCtr = 0;
        jack = 0;
    }
}
