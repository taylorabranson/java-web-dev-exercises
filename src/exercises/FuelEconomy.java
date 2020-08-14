package exercises;

import java.util.Scanner;

public class FuelEconomy {

    public static void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in);
        System.out.println("Miles Driven");
        double miles = input.nextDouble();
        System.out.println("Gallons of gas");
        double gallons = input.nextDouble();
        System.out.println("Miles Per Gallon: " + (miles / gallons));
        input.close();
    }
}
