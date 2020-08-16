package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] args) {

        HashMap<Integer, Double> gradeBook = new HashMap<>();
        Scanner input = new Scanner(System.in);
        Integer newId;

        System.out.println("Enter Student ID Number (or input '0' to finish):");

        do {
            System.out.println("Student ID: ");
            newId = input.nextInt();

            if (!newId.equals(0)) {
                System.out.println("Grade: ");
                Double newGrade = input.nextDouble();
                gradeBook.put(newId, newGrade);


            }


        } while(!newId.equals(0));

        System.out.println("\nClass Roster: ");

        for (Map.Entry<Integer, Double> student : gradeBook.entrySet()) {
            System.out.println(student.getKey() + ": " + student.getValue());
        }

        input.close();
    }
}
