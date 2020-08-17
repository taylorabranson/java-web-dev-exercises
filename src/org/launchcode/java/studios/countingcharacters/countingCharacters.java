package org.launchcode.java.studios.countingcharacters;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class countingCharacters {
    public static void main(String[] args) {

        HashMap<String, Integer> characterCount = new HashMap<>();

        Scanner input = new Scanner(System.in);

        String userText;

        // Get Text from file
        try {
            FileReader fileReader = new FileReader("src/org/launchcode/java/studios/countingcharacters/text.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            userText = line;
        } catch (FileNotFoundException ex) {
            userText = "";
            System.out.println("Error: File not found");
        } catch (IOException ex) {
            userText = "";
            System.out.println("Error: IO exception");
        }


        // Get String from user

//        System.out.println("Enter some text: ");
//        String userText = input.nextLine();

        // Convert String to an Array of lower-case characters
        userText = userText.toLowerCase();
        String[] charsInString = userText.split("");

        for (String character : charsInString) {

            // Exclude non-alphabetic characters
            if (!character.matches("[a-zA-Z]")) {
                continue;
            }

            // Add new character to characterCount or update count
            if (!characterCount.containsKey(character)) {
                characterCount.put(character, 1);
            } else {
                characterCount.put(character, characterCount.get(character) + 1);
            }
        }

        // Print characterCount key/value pairs line by line
        for (Map.Entry<String, Integer> character : characterCount.entrySet()) {
            System.out.println(character.getKey() + ": " + character.getValue());
        }
    }
}
