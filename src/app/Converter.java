package app;

public class Converter {

    //miles to kilometers converter

    final static double MILE_TO_KILOMETER = 1.60934; // how many kilometers in one mile

    public static double convertMilesToKilometers (double miles) {

        return miles * MILE_TO_KILOMETER;

    } // converts miles to kilometers

    public static void printKilometers(double miles, double kilometers) {

        System.out.println("There are " + kilometers + " kilometers in " + miles + " miles");
    } // prints how many kilometers in miles

    // kilometers to miles converter

    final static double KILOMETER_TO_MILE = 0.621371; // how many miles in one kilometer

    public static double convertKilometersToMiles (double kilometers) {

        return kilometers * KILOMETER_TO_MILE;
    } // converts kilometers to miles

    public static void printMiles(double kilometers, double miles) {

        System.out.println("There are " + miles + " miles in " + kilometers + " kilometers");
    } // prints how many miles in kilometers


    public static void main(String[] args) {

        double miles = 2;
        double kmsInMiles = convertMilesToKilometers(miles);
        printKilometers(miles,kmsInMiles);

        double kms = 3;
        double milesInKms = convertKilometersToMiles(kms);
        printMiles(kms,milesInKms);
    }

}
