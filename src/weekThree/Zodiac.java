package src.weekThree;

import java.util.Scanner;

public class Zodiac {
    public static void main(String[] args) {

        String name;
        String surname;
        int month;
        int date;

        Scanner console = new Scanner(System.in);

        System.out.print("Please type your name: ");
        name = console.nextLine();

        System.out.print("Please type your surname: ");
        surname = console.nextLine();

        System.out.print("What is your birthday month (only numbers)? ");
        month = console.nextInt();

        System.out.print("What is your birthday day (only numbers)? ");
        date = console.nextInt();

        /*
        Aries: 20 March - 19 April
        Taurus: 20 April - 22 May
        Gemini: 23 May - 21 June
        Cancer: 22 June - 22 July
        Leo: 23 July - 23 August
        Virgo: 24 August - 22 September
        Libra: 23 September - 22 October
        Scorpio: 23 October - 21 November
        Sagittarius: 22 November - 21 December
        Capricorn: 22 December - 19 January
        Aquarius: 20 January - 18 February
        Pisces: 19 February - 19 March
         */

        if ( (month < 0) || date < 0){
            System.out.print("Negative numbers are invalid - " + "month: " + month + " day: " + date );
        } else if ( (month > 12) || (date > 31)){
            System.out.print("Provided data are invalid - " + "month: " + month + " day: " + date );
        } else if ( (month == 1) && (date < 20) ){
            //Capricorn: 22 December - 19 January
            System.out.print(" Hi " + name + " " + surname + " your sign is: capricorn.");
        } else if ( (month == 1) && (date > 19) ){
            //Aquarius: 20 January - 18 February
            System.out.print(" Hi " + name + " " + surname + " your sign is: aquarius.");
        } else if ( (month == 2) && (date < 19) ){
            //Aquarius: 20 January - 18 February
            System.out.print(" Hi " + name + " " + surname + " your sign is: aquarius.");
        } else if ((month == 2) && (date >= 19) && (date <= 29) ){
            //Pisces: 19 February - 19 March
            System.out.print(" Hi " + name + " " + surname + " your sign is: pisces.");
        } else if ( (month == 3) && (date <= 19) ){
            //Pisces: 19 February - 19 March
            System.out.print(" Hi " + name + " " + surname + " your sign is: pisces.");
        } else if ( (month == 3) && (date > 19) ){
            //Aries: 20 March - 19 April
            System.out.print(" Hi " + name + " " + surname + " your sign is: aries.");
        } else if ( (month == 4) && (date <= 19) ){
            //Aries: 20 March - 19 April
            System.out.print(" Hi " + name + " " + surname + " your sign is: aries.");
        } else if ( (month == 4) && (date > 19) && (date <= 30) ){
            //Taurus: 20 April - 22 May
            System.out.print(" Hi " + name + " " + surname + " your sign is: tauros.");
        } else if ( (month == 5) && (date <= 22) ){
            //Taurus: 20 April - 22 May
            System.out.print(" Hi " + name + " " + surname + " your sign is: tauros.");
        } else if ( (month == 5) && (date > 22) ){
            //Gemini: 23 May - 21 June
            System.out.print(" Hi " + name + " " + surname + " your sign is: gemini.");
        } else if ( (month == 6) && (date <= 21 ) ){
            //Gemini: 23 May - 21 June
            System.out.print(" Hi " + name + " " + surname + " your sign is: gemini.");
        } else if ( (month == 6) && (date > 22) && (date <= 30) ){
            //Cancer: 22 June - 22 July
            System.out.print(" Hi " + name + " " + surname + " your sign is: cancer.");
        } else if ( (month == 7) && (date <= 22) ) {
            //Cancer: 22 June - 22 July
            System.out.print(" Hi " + name + " " + surname + " your sign is: cancer.");
        } else if ( (month == 7) && (date > 22) ) {
            //Leo: 23 July - 23 August
            System.out.print(" Hi " + name + " " + surname + " your sign is: leo.");
        } else if ( (month == 8) && (date <= 23) ) {
            //Leo: 23 July - 23 August
            System.out.print(" Hi " + name + " " + surname + " your sign is: leo.");
        } else if ( (month == 8) && (date > 23)) {
            //Virgo: 24 August - 22 September
            System.out.print(" Hi " + name + " " + surname + " your sign is: virgo.");
        } else if ( (month == 9) && (date <= 22) ) {
            //Virgo: 24 August - 22 September
            System.out.print(" Hi " + name + " " + surname + " your sign is: virgo.");
        } else if ( (month == 9) && (date > 22) && (date <= 30 )){
            //Libra: 23 September - 22 October
            System.out.print(" Hi " + name + " " + surname + " your sign is: libra.");
        } else if ( (month == 10) && (date <= 22) ) {
            //Libra: 23 September - 22 October
            System.out.print(" Hi " + name + " " + surname + " your sign is: libra.");
        } else if ( (month == 10) && (date > 22) ) {
            //Scorpio: 23 October - 21 November
            System.out.print(" Hi " + name + " " + surname + " your sign is: scorpio.");
        } else if ( (month == 11) && (date <=21) ) {
            //Scorpio: 23 October - 21 November
            System.out.print(" Hi " + name + " " + surname + " your sign is: scorpio.");
        } else if ( (month == 11) && (date > 21) && (date <= 30) ) {
            //Sagittarius: 22 November - 21 December
            System.out.print(" Hi " + name + " " + surname + " your sign is: sagittarius.");
        } else if ( (month == 12) && (date <= 21) ) {
            //Sagittarius: 22 November - 21 December
            System.out.print(" Hi " + name + " " + surname + " your sign is: sagittarius.");
        } else if ( (month == 12) && (date > 21) ) {
            //Capricorn: 22 December - 19 January
            System.out.print(" Hi " + name + " " + surname + " your sign is: capricorn.");
        } else {
            System.out.print("Provided data are invalid - " + "month: " + month + " day: " + date );
        }
    }
}
