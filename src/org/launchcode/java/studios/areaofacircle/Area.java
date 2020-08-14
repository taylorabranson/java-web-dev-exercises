package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {

    public static void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in);
        double pi = 3.14;
        double radius;
        System.out.println("Enter the radius of the circle.");

        if (input.hasNextDouble()) {
            radius = input.nextDouble();
            if (radius <= 0) {
                System.out.println("Error: Must be non-negative");
                return;
            }
            System.out.println("Area: " + Circle.getArea(radius));
            return;
        } else {
            System.out.println("Error: Must enter a number");
            return;
        }

    }
}
