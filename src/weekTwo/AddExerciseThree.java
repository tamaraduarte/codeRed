package src.weekTwo;

import java.util.Random;

public class AddExerciseThree {
    public static void main(String[] args) {

        // Math random
        int numberOne = (int) Math.random();
        System.out.println("Number 1 is " + numberOne);

        // Random class
        Random rand = new Random();
        int numberTwo = rand.nextInt();
        System.out.println("Number 2 is " + numberTwo);

        // Test if numberOne is odd or even
        if (numberOne % 2 == 0) {
            System.out.println("Number " + numberOne + " is even.");
            // If numberOne is odd and lower than 20 print ”Number x is odd”
        } else if (numberOne < 20) {
            System.out.println("Number " + numberOne + "is odd.");
            // numberOne is odd and greater or equal than 20
        } else if (numberOne >= 20) {
            System.out.println("Number " + numberOne + "is odd, and value is 20 or more.");
            // If numberOne is negative
        } else if (numberOne % 2 != 0) {
            System.out.println("Number " + numberOne + "is negative");

        }

        // Test if numberTwo is odd or even
        if (numberTwo % 2 == 0) {
            System.out.println("Number " + numberTwo + " is even.");
        } else {
            System.out.println("Number " + numberTwo + " is odd.");
        }
    }

}
