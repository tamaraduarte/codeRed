package src.weekThree;

import java.util.Objects;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int operandOne;
        int operandTwo;
        int result;
        String operator;

        Scanner console = new Scanner(System.in);

        System.out.print("Please type your expression: ");
        operandOne = console.nextInt();
        operator = console.next();
        operandTwo = console.nextInt();

        result = switch (operator) {
            case "+" -> operandOne + operandTwo;
            case "-" -> operandOne - operandTwo;
            case "*" -> operandOne * operandTwo;
            case "/" -> operandOne / operandTwo;
            case "%" -> operandOne % operandTwo;
            default -> throw new RuntimeException("invalid operator: " + operator);
        };
        System.out.print("Result is: " + result);
    }
}
