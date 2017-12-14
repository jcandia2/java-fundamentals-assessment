public class Person implements Greeter {
//    Create a class named Person
//    This class should have two protected string properties: firstName and lastName.
//    Add a constructor method that takes in two strings that will be used to set the firstName and
//    lastName properties.
//    If the firstName or lastName (or both) argument is null, the constructor should throw an
//    IllegalArgumentException with a descriptive error message.
//    Write a getter and setter for both the firstName and lastName properties.
public static void main(String[] args) {
    Person person = new Person("juan","");
}

    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) throws IllegalArgumentException {
       if (firstName == null || lastName == null) {
           throw new IllegalArgumentException("Invalid entry for first name or last name");
       } else {
           this.firstName = firstName;
           this.lastName = lastName;
       }
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

    @Override
    public String sayHello() {
        String message = "Hello from " + this.firstName + " " + this.lastName;
        return message;
    }
}
