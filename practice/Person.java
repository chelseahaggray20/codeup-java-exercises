public class Person implements Greeter {

    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        if (firstName == null || lastName == null) {
            throw new IllegalArgumentException("first/last name invalid");
        }
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String sayHello() {
        return "Hello" + this.firstName + " " + this.lastName;
    }

    public static void main(String[] args) {
        Person p = new Person("Allie", "Scott");

        System.out.println(p);


    }
}