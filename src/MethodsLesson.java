public class MethodsLesson {
    public static void main(String[] args) {
        System.out.println("We are in main(String[] args)");


//        countTo(10);
        squareIt(12);

    }


//    public static countTo(int n) {
//        System.out.println("We are in countTo(int)");
//        for (int i = 1; i <= n; i++) {
//            System.out.println(i);
//        }
////        return int n;
//    }

    public static double squareIt(int num) {
        System.out.println("In squareIt");
//        Math.pow(num, 2);
        long numSquared = num * num;

        return numSquared;

    }


    public static long multiplyFourNumbers(int a, int b, int c, int q) {
        return a * b * c * q;
    }

    public static String convert(int num) {
        return "" + num;
    }
}