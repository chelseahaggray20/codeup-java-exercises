package movies;

import java.util.Arrays;
import java.util.Scanner;

public class MoviesApplication {

    final static String[] catagories = {"none", "all", "animated", "drama", "horror", "scifi", "musical", "comedy"};

    public static void main(String[] args) {

        // setup movie lister
        Scanner scanner = new Scanner(System.in);
        Movie[] movieList = MoviesArray.findAll();

        // loop to choose how thw list the movies
        int choice = 1;
        do {
            System.out.println();
            System.out.println("What would you like to do?");
            System.out.println("");
            System.out.println("\t0 - exit");
            System.out.println("\t1 - view all movies");
            System.out.println("\t2 - view movies in the animated category");
            System.out.println("\t3 - view movies in the drama category");
            System.out.println("\t4 - view movies in the horror category");
            System.out.println("\t5 - view movies in the scifi category");
            System.out.println("\t6 - view movies in the musical category");
            System.out.println("\t7 - view movies in the comedy category");
            System.out.println("\t8 - Add a movie");
            System.out.println("");
            System.out.print("Enter your choice: ");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException nfe) {
//                continue;
                break;
            }

            // loop to display movies
            if (choice != 0 && choice != 8) {
                for (Movie movie : movieList) {
                    switch (choice) {
                        case 1:
                            System.out.printf("%s -- %S\n", movie.getName(), movie.getCategory());
                            break;
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            if (movie.getCategory().equalsIgnoreCase(catagories[choice])) {
                                System.out.printf("%s -- %S\n", movie.getName(), movie.getCategory());
                            }
                            break;
                        default:
                            break;
                    }
                }
            }

            if (choice == 8) {
                movieList = addMovie(movieList, scanner);
            }

        } while (choice != 0);
        System.out.println("Goodbye");
    }

    private static Movie[] addMovie(Movie[] movieList, Scanner scanner) {

        System.out.print("Enter the movie's name: ");
        String name = scanner.nextLine();
        System.out.print("Enter the movie's category: ");
        String category = scanner.nextLine();

        Movie newMovie = new Movie(name, category);
        Movie[] newList = null;
        int length = 0;
        if (movieList != null) {
            length = movieList.length;
            newList = Arrays.copyOf(movieList, length +1);
        } else {
            newList = new Movie[1];
        }
        newList[length] = newMovie;

        return newList;
    }
}