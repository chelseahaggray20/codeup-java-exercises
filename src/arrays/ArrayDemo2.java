package arrays;

public class ArrayDemo2 {


        public static void main(String[] args) {
            String[] languages = {"html", "css", "javascript", "java"};

            // Conventional for loop
            System.out.println();
            for (int i = 0; i < languages.length; i += 1) {
                System.out.println(languages[i]);
            }

            // Enhanced for loop
            System.out.println();
            for (String language : languages) {
                System.out.println(language);
            }

            // second enhanced loop
            // Here, each element of the numbers array will be assigned to the variable n, whose type is int,
            // every loop iteration.
            System.out.println();
            int[] numbers = {1, 2, 3, 4, 5};
            for (int n : numbers) {
                System.out.println(n);
            }
        }
    }

