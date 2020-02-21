package review;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class PhoneBook {

    private HashMap<String, People> loadFile(String fileName) throws FileNotFoundException {

        // setup data
        HashMap<String, People> personMap = new HashMap<>();

        // create file scanner
        Scanner fileScanner = new Scanner(new File("data/" + fileName));

        int lineCount = 0;
        while (fileScanner.hasNext()) {
            lineCount++;
            String dataLine = fileScanner.nextLine();
            String[] columns = dataLine.split(",");
            if (columns.length != 10) {
                System.out.printf("Badly formatted data row in file %s, line %d", fileName, lineCount);
            } else {
                People person = new People(columns[0], columns[1], columns[2], columns[3], columns[4],
                        columns[5], columns[6], columns[7], columns[8], columns[9]);
                personMap.put(person.getFirstName().toUpperCase(), person);
            }
        }

        return personMap;
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        HashMap<String, People> personMap = null;
        try {
            personMap = phoneBook.loadFile("PersonData.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // setup
        Scanner scanner = new Scanner(System.in);
        String input = "";
        String sNum = "";
        int choice = 0;
        Integer[] values;
        Double[] dValues;

        // feedback loop
        do {
            System.out.print("\nSelect option: \n");
            System.out.println();
            System.out.println("\t1) Search for a person");
            System.out.println("\t2) exit");
            System.out.println();
            System.out.print("Enter choice: ");
            sNum = scanner.nextLine();
            try {
                choice = Integer.parseInt(sNum);
            } catch (NumberFormatException nfe) {
                System.out.println("\nInvalid number entry\n");
                continue;
            }

            // use try to catch bad input
            try {
                switch (choice) {
                    case (2):
                        break;
                    case (1):
                        System.out.printf("enter the person's first name: ");
                        String name = scanner.nextLine().toUpperCase();
                        People person = personMap.get(name);
                        if (person == null) {
                            System.out.printf("%s is not found in the phone book.\n\n", name);
                        } else {
                            System.out.printf("\nINFORMATION FOR %s\n", name.toUpperCase());
                            System.out.printf("\tFirst Name:     \t%s\n", person.getFirstName());
                            System.out.printf("\tLast Name:      \t%s\n", person.getLastName());
                            System.out.printf("\tStreet Address: \t%s\n", person.getStreetAddress());
                            if (person.getSecondaryStreetAddress().length() > 0)
                                System.out.printf("\t                \t%s\n", person.getSecondaryStreetAddress());
                            System.out.printf("\tCity:           \t%s\n", person.getCity());
                            System.out.printf("\tState:          \t%s\n", person.getState());
                            System.out.printf("\tZip Code:       \t%s\n", person.getZipCode());
                            System.out.printf("\tCountry:        \t%s\n", person.getCountryCode());
                            System.out.printf("\tMain Phone:     \t%s\n", person.getMainPhone());
                            System.out.printf("\tSecond Phone:   \t%s\n", person.getSecondPhone());
                        }
                        break;
                    default:
                        System.out.printf("Invalid Option");
                        break;
                }
            } catch (NumberFormatException nfe) {
                System.out.println("\nInvalid number entry\n");
            }
        } while (choice != 2);
    }
}