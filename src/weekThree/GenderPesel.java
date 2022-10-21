package src.weekThree;

import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class GenderPesel {
    public static void main(String[] args) {

        String name;
        String surname;
        String pesel;
        char gender;
        int number;

        Scanner console = new Scanner(System.in);

        System.out.print("Please type your name: ");
        name = console.nextLine();

        System.out.print("Please type your surname: ");
        surname = console.nextLine();

        System.out.print("What is your pesel number? ");
        pesel = console.nextLine();

        //YYYYMMDDKKK[N]P
        gender = pesel.charAt(10);
        number = parseInt(String.valueOf(gender));

        if ( number % 2 == 0 ){
            System.out.println("You are a woman!");
        } else {
            System.out.println("You are a man!");
        }



    }
}