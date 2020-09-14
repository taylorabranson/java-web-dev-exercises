package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        Case menu = new Case();

        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        ArrayList<Topping> toppings = menu.getToppings();

        Comparator comparatorFlavor = new FlavorComparator();
        Comparator comparatorCone = new ConeComparator();
        Comparator comparatorTopping = new ToppingComparator();

        // Use a Comparator class to sort the 'flavors' array alphabetically by the 'name' field.
        flavors.sort(comparatorFlavor);

        // Use a Comparator class to sort the 'cones' array in increasing order by the 'cost' field.
        cones.sort(comparatorCone);

        // Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.

        for (int i = 0; i < flavors.size(); i++) {
            System.out.println(flavors.get(i).getName());
        }

        for (int i = 0; i < cones.size(); i++) {
            System.out.println(cones.get(i).getName() + ": $" + cones.get(i).getCost());
        }

        toppings.sort(comparatorTopping);

        for (int i = 0; i < toppings.size(); i++) {
            System.out.println(toppings.get(i).getName());
        }
    }
}
