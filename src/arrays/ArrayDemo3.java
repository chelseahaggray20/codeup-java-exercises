package arrays;

public class ArrayDemo3 {


        public static void main(String[] args) {
            int[][] matrix = {
                    {1, 2, 3},
                    {4, 5},
                    {7, 8, 9}
            };

//        System.out.println();
//        dem01(matrix);
//
            System.out.println();
            dem02(matrix);

            System.out.println();
            dem03(matrix);
        }

        public static void dem01(int[][] matrix) {


            // access the second element in the first row
            System.out.println(matrix[0][1]); // 2

            // the first element in the last row
            System.out.println(matrix[2][0]); // 7

            // the second element in the second row
            System.out.println(matrix[1][1]); // 5
        }

        public static void dem02(int[][] matrix) {

            for (int[] row : matrix) {
                System.out.println("+---+---+---+");

                System.out.print("| ");

                for (int n : row) {
                    System.out.print(n + " | ");
                }

                System.out.println();
            }

            System.out.println("+---+---+---+");
        }

        public static void dem03(int[][] matrix) {

            String line;
            String border = "";

            if (matrix.length > 0 && matrix[0].length > 0) {

                // row loop
                for (int i = 0; i < matrix.length; i++) {

                    // column loop
                    String lastBorder = border;
                    border = "";
                    line = "";
                    for (int j = 0; j < matrix[i].length; j++) {
                        border += "---+";
                        line += " " + matrix[i][j] + " |";
                    }

                    // print border for the longest row
                    if (lastBorder.length() > border.length()) {
                        System.out.println("+" + lastBorder);
                    } else {
                        System.out.println("+" + border);
                    }
                    // print the row data
                    System.out.println("|" + line);
                }

                // print bottom border
                System.out.println("+" + border);
            }
        }
    }



