public class ControlWhileLoop {

    public static void main(String[] args) {

        // lets see some primes
        int num = 1;
        while (num < 1001) {
            if (isPrime(num)) System.out.println(num + " is a prime number.");
            num++;
        }
    }

    // Is prime function
    // how does this work?
    public static boolean isPrime(int num) {
        if (num == 1 || num == 2) return true;
        if (num%2 == 0) return false;
        int current = 3;
        while (current < num/(current - 1)) {
            if (num%current == 0) return false;
            current += 2;
        }
        return true;
    }
}