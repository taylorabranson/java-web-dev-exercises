package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {

    public static void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in);
        double radius;
        System.out.println("Enter the radius of the circle.");

        if (input.hasNextDouble()) {
            radius = input.nextDouble();

            // While loop to wait for non-neg number.
            while (radius <= 0) {
                System.out.println("Error: Must be non-negative");
                System.out.println("Enter a number: ");
                radius = input.nextDouble();
            }
            System.out.println("Area: " + Circle.getArea(radius));
        } else {
            System.out.println("Error: Must enter a number");
        }

    }
}
