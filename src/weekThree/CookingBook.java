package src.weekThree;

import java.util.Scanner;

public class CookingBook {
    public static void main(String[] args) {
        String ingredientOne;
        String ingredientTwo;
        String ingredientThree;

        Scanner console = new Scanner(System.in);

        System.out.print("Please type your three ingredients: ");
        ingredientOne = console.next();
        ingredientTwo = console.next();
        ingredientThree = console.next();


        if ( ((ingredientOne.equals("bread")) || (ingredientTwo.equals("bread")) || (ingredientThree.equals("bread")))
            && ((ingredientOne.equals("ham")) || (ingredientTwo.equals("ham")) || (ingredientThree.equals("ham")))
                && ((ingredientOne.equals("butter")) || (ingredientTwo.equals("butter")) || (ingredientThree.equals("butter")))) {
            //sandwich: bread + ham + butter
            System.out.print("You can do a sandwich!");
        } else if (((ingredientOne.equals("salt")) || (ingredientTwo.equals("salt")) || (ingredientThree.equals("salt")))
                && ((ingredientOne.equals("egg")) || (ingredientTwo.equals("egg")) || (ingredientThree.equals("egg")))
                && ((ingredientOne.equals("butter")) || (ingredientTwo.equals("butter")) || (ingredientThree.equals("butter")))) {
            //scrambled eggs: egg + salt + butter
            System.out.print("You can make a scrambled eggs!");
        } else {
            System.out.print("Not sure what you can make!");
        }


    }
}
