import  java.util.ArrayList;


public class Assessment {


    public static int square(int num) {
        return num * num;
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static double sum(double a, double b) {
        return a + b;
    }

    public static double average(int[] array) {
        int sum = 0;
        for (int i : array) sum += i;
        return ((double) sum) / array.length;
    }

    public static ArrayList<User> capitalizeRecords(ArrayList<User> users) {

        ArrayList<User> usersCopy = new ArrayList<>();

        for (User user : users) {
            usersCopy.add(new User(user.getFirstName(), user.getLastName(), user.isAdmin()));
        }

        for(User user : usersCopy) {

            String firstName = user.getFirstName();
            String lastName = user.getLastName();
            String pattern = "[a-z].*";

            if (firstName.matches(pattern)) {
                firstName = capitalizeName(firstName);
                user.setFirstName(firstName);
            }

            if (lastName.matches(pattern)) {
                lastName = capitalizeName(lastName);
                user.setLastName(lastName);
            }

        }

        return usersCopy;

    }

    public static String capitalizeName(String nameToCapitalize) {
        return nameToCapitalize.toUpperCase().charAt(0) + nameToCapitalize.substring(1).toLowerCase();
    }


    public static void main(String[] args) {
//        testing methods here
        int[] x = {2, 2, 2, 2};
        System.out.println(square(8));
        System.out.println(sum(3.5, 4));
        System.out.println(sum(2, 4));
        System.out.println(average(new int[]{1,2}));

    }

}
