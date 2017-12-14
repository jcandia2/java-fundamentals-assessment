import java.util.ArrayList;
import java.util.Locale;

public class Assessment {

//    Create a class named Assessment inside of the src folder. Add the following static methods:
//
//    square: should accept and return a single integer number. The method should return the number times itself.
//    sum: should accept 2 numbers, either integers or doubles, and returns the result of adding the
//    two numbers together.
//    average: should accept an array of integers, and return the average of the passed numbers as a double.

    public static int square(int num) {
        return num * num;
    }

    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    public static double sum(double num1, double num2) {
        return num1 + num2;
    }

    public static double average(int[] arrayOfInts) {
        int sum = 0;
        for (int number: arrayOfInts) {
            sum += number;
        }
        return sum/arrayOfInts.length;
    }

    public static String capitalize(String text) {
        String c = (text != null) ? text.trim() : "";
        String[] words = c.split(" ");
        String result = "";
        for (String w : words) {
            result += (w.length() > 1 ? w.substring(0, 1).toUpperCase(Locale.US) + w.substring(1, w.length()).toLowerCase(Locale.US) : w) + " ";
        }
        return result.trim();
    }

    public static ArrayList<User> capitalizeRecords(ArrayList<User> arrayListOfUsers) {
        ArrayList<User> capitalizedListOfUsers = new ArrayList<>();


        for (User user: arrayListOfUsers) {
            User newUser = new User(capitalize(user.getFirstName()),capitalize(user.getLastName()),user.isAdmin());
            capitalizedListOfUsers.add(newUser);
        }

        return capitalizedListOfUsers;

    }
//    On your Assessment class create a static method named capitalizeRecords
//    The method should both accept and return an ArrayList of User objects.
//    The returned list should have the same User objects in it, but each user's firstName and
//    lastName properties should be properly capitalized.
//    (i.e. the first letter of each property should be upper case)

    public static void main(String[] args) {
        System.out.println(square(5));
        System.out.println(sum(5,6));
        System.out.println(sum(5.5, 6.5));
        int[] newArray = {10,20,30,40,50,60,70};
        System.out.println(average(newArray));

        User newUser1 = new User("user1","user1LastName", true);
        User newUser2 = new User("user2","", true);
        User newUser3 = new User("user3","user3LastName", true);

        ArrayList<User> testList = new ArrayList<>();
        testList.add(newUser1);
        testList.add(newUser2);
        testList.add(newUser3);

        for (User user: testList) {
            System.out.print(user.getFirstName() + " " + user.getLastName() + " is admin: " + user.isAdmin());
            System.out.println();
        }

        for (User user: capitalizeRecords(testList)) {
            System.out.print(user.getFirstName() + " " + user.getLastName() + " is admin: " + user.isAdmin());
            System.out.println();
        }
    }
}
