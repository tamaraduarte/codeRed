package src.weekThree;

import java.util.Scanner;


public class Cat {

    public static void main(String[] args) {

        String catName;
        int catEnergy = 100;
        int option = 6;


        Scanner console = new Scanner(System.in);


        System.out.print("Welcome to Petland! Type the name of your cat: ");
        catName = console.next();

        System.out.println( catName + " has " + catEnergy + " of 100 energy.");

        while ( (catEnergy > 0) && (option !=0)) {
            System.out.println(" ");
            System.out.println("What you like to do with " + catName + " ?");
            System.out.println("Type 1 for run (-20 of energy)");
            System.out.println("Type 2 to catch a fly (-5 of energy)");
            System.out.println("Type 3 to catch a mouse (-50 of energy)");
            System.out.println("Type 4 to eat (+30 of energy)");
            System.out.println("Type 5 to sleep (+50 of energy)");
            System.out.println("Type 0 to quit");
            System.out.println(" ");

            option = console.nextInt();
            if ((option == 1) && (catEnergy > 20)) {
                catEnergy = catEnergy - 20;
                System.out.println(catName + " is running. Current energy: " + catEnergy);
            } else if ((option == 1) && (catEnergy < 20)) {
                System.out.println(catName + " is too tired. Current energy: " + catEnergy);
            } else if ((option == 2) && (catEnergy > 5)) {
                catEnergy = catEnergy - 5;
                System.out.println(catName + " is catching a fly. Current energy: " + catEnergy);
            } else if ((option == 2) && (catEnergy < 5) && (catEnergy != 0)) {
                System.out.println(catName + " is too tired. Current energy: " + catEnergy);
            } else if ((option == 3) && (catEnergy > 50)) {
                catEnergy = catEnergy - 50;
                System.out.println(catName + " is catching a mouse. Current energy: " + catEnergy);
            } else if ((option == 3) && (catEnergy <= 50) && (catEnergy != 0)) {
                catEnergy = catEnergy - 50;
                System.out.println(catName + " is too tired. Current energy: " + catEnergy);
            } else if ((option == 4) && (catEnergy <= 70)) {
                catEnergy = catEnergy + 30;
                System.out.println(catName + " is eating. Current energy: " + catEnergy);
            } else if ((option == 4) && (catEnergy > 70)) {
                catEnergy = 100;
                System.out.println(catName + " is full, could not eat all. Current energy: " + catEnergy);
            } else if ((option == 5) && (catEnergy <= 50)) {
                catEnergy = catEnergy + 50;
                System.out.println(catName + " is sleeping. Current energy: " + catEnergy);
            } else if ((option == 5) && (catEnergy > 50)) {
                catEnergy = 100;
                System.out.println(catName + " is not too tired, had only a nap. Current energy: " + catEnergy);
            } else if ((option == 0) || (catEnergy == 0)){
                System.out.println(catName + " is going away. Bye! Current energy: " + catEnergy);
            }else {
                //option = 0;
                System.out.println(catName + " Wrong option. Current energy: " + catEnergy);
            }
        }

    }
}
