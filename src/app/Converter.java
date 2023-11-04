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

}
