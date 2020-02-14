package review;
*    /*1. Create a class named `Person` inside of `src`.*/
public class Human implements Greeter {
    //    /*The class should define two instance properties of type `String` named
//      `firstName`, and `lastName`. These properties should not be accessible
//      outside of the `Person` class.*/
    private String firstName;
    private String lastName;

//
//    /*Add a constructor method that takes in two strings and sets the `firstName`
//         and `lastName` properties based on the passed arguments.*/
    public String Identify(String firstName, String lastName, boolean isAdmin) {

        this.firstName = firstName;
        this.lastName = lastName;
        return firstName + lastName;
    }

/*  - Write a getter and setter for the `firstName` property as well as a getter
      and setter for `lastName`.*/

    public String getfirstName() {

        return firstName;
    }

    public String getlastName() {
        return lastName;
    }


    public static void main(String[] args) {

        System.out.println(sayHello("chelsea", "haggray"));

    }

    private static String sayHello(String chelsea, String haggray) {
        return "Hello from" + chelsea + haggray;


    }
}

