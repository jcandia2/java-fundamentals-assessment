public class Assessment {

//    Create a class named Assessment inside of the src folder. Add the following static methods:
//
//    square: should accept and return a single integer number. The method should return the number times itself.
//    sum: should accept 2 numbers, either integers or doubles, and returns the result of adding the two numbers together.
//            average: should accept an array of integers, and return the average of the passed numbers as a double.

    public static int square(int num) {
        return num*num;
    }

    public static void main(String[] args) {
        System.out.println(square(5));
    }
}
