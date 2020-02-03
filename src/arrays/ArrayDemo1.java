package arrays;

public class ArrayDemo1 {
    public static void main(String[] args) {
        dem01();
//        dem02();
    }

    public static void dem01() {
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;

        System.out.println();
        System.out.println(numbers[0]); // ?
        System.out.println(numbers[1]); // ?
        System.out.println(numbers[2]); // ?
        System.out.println(numbers[3]); // ?
    }

    public static void dem02() {
        // using the array initializer syntax
        String[] beatles = {"John", "Paul", "Ringo"};
        System.out.println(beatles.length); //
        System.out.println(beatles[1]); // ?
        System.out.println(beatles[0]); // ?
        System.out.println(beatles[2]); // ?
        beatles[3] = "George";          // ?
    }

}
