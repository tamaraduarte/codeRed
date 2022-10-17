package src.weekTwo;

public class AddExerciseTwo {
    public static void main(String[] args) {
        int variableOne = 5;
        int variableTwo = 2;

        System.out.println("Variable 1: " + variableOne); // Variable 1: 5
        System.out.println("Variable 2: " + variableTwo); // Variable 2: 2


        int variableOneBuffer = variableOne;
        int variableTwoBuffer = variableTwo;

        variableOne = variableTwoBuffer;
        variableTwo = variableOneBuffer;

        System.out.println("Variable 1: " + variableOne); // Variable 1: 2
        System.out.println("Variable 2: " + variableTwo); // Variable 2: 5

    }
}
