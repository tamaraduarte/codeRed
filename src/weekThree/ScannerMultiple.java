package src.weekThree;

import java.util.Scanner;

public class ScannerMultiple {
    public static void main(String[] args){

        Scanner console = new Scanner(System.in);

        System.out.print("Please type two numbers: ");

        long numberOne = console.nextLong();
        long numberTwo = console.nextLong();
        //System.out.print("Please type two numbers: ");



        long product = numberOne * numberTwo;
        System.out.println("The product is " + product);

    }
}
