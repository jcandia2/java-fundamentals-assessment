public class User extends Person {
//    Create a class named User that inherits from Person
//
//    The User class should have a protected property named admin that is a boolean.
//    Create a constructor for the User class that accepts the same parameters as the Person
//    constructor plus a third parameter, a boolean for whether or not the user is an administrator.
//    Use this to set the admin property.
//    Write a method on the User class named isAdmin() that functions as a getter for the admin property.

    boolean admin;

    public User(String firstName, String lastName, boolean admin) throws IllegalArgumentException {
        super(firstName, lastName);
        this.admin = admin;
    }

    public User(String firstName, String lastName) throws IllegalArgumentException {
        super(firstName, lastName);
    }

    public boolean isAdmin() {
        return admin;
    }


    public static void main(String[] args) {
        User newUser = new User("juan",null,true);
        System.out.println(newUser.getFirstName());
        System.out.println(newUser.getLastName());
        System.out.println(newUser.isAdmin());
    }
}
