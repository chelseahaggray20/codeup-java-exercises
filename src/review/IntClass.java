package review;

public class IntClass {
    private int value = 0;

    public IntClass(int val) {
        value = val;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String toString() {
        return new String("[value=" + value);
    }

    public int calcSum(IntClass myInt) {
        return value + myInt.value;
    }

    public static int calcSum(IntClass valOne, IntClass valTwo) {
        return valOne.value + valTwo.value;
    }

    public static IntClass sumArray(int[] x) {
        int sum = 0;
        for (int i: x) {
            sum += i;
        }
        return new IntClass(sum);
    }

    public static void main(String[] args) {

        // test argument constructor
        int val = 7;
        IntClass i = new IntClass(val);
        if (i.getValue() != val) {
            System.out.println("Constructor test failed");
        } else {
            System.out.println("Constructor test passed");
        }

        // test getValue
        val = 8;
        i = new IntClass(val);
        if (i.getValue() != val) {
            System.out.println("getValue test failed");
        } else {
            System.out.println("getValue test passed");
        }

        // test setValue
        val = 9;
        i = new IntClass(0);
        i.setValue(val);
        if (i.getValue() != val) {
            System.out.println("setValue test failed");
        } else {
            System.out.println("setValue test passed");
        }

        // test toString
        val = 10;
        i = new IntClass(val);
        String message = "[value=10]";
        if (i.toString().equals(message)) {
            System.out.println("toString test failed");
        } else {
            System.out.println("toString test passed");
        }

        // test calcSum
        i = new IntClass(4);
        if (i.calcSum(new IntClass(5)) != 9) {
            System.out.println("calcSum test failed");
        } else {
            System.out.println("calcSum test passed");
        }

        // test two parameter calcSum
        i = new IntClass(4);
        IntClass j = new IntClass(5);
        if (IntClass.calcSum(i, j) != 9) {
            System.out.println("Two parameter calcSum test failed");
        } else {
            System.out.println("Two parameter calcSum test passed");
        }

        // test array parameter calcSum
        final int[] k = {2, 4, 6, 8};
        if (IntClass.sumArray(k).getValue() != 20) {
            System.out.println("Array parameter calcSum test failed");
        } else {
            System.out.println("Array parameter calcSum test passed");
        }

    }
}