package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class countingCharacters {
    public static void main(String[] args) {

        HashMap<String, Integer> characterCount = new HashMap<>();

        Scanner input = new Scanner(System.in);

        System.out.println("Enter some text: ");
        String userText = input.nextLine();
        userText = userText.toLowerCase();

        String[] charsInString = userText.split("");

        for (String character : charsInString) {
            if (!character.matches("[a-zA-Z]")) {
                continue;
            }
            if (!characterCount.containsKey(character)) {
                characterCount.put(character, 1);
            } else {
                characterCount.put(character, characterCount.get(character) + 1);
            }
        }

        System.out.println(characterCount);

        for (Map.Entry<String, Integer> character : characterCount.entrySet()) {
            System.out.println(character.getKey() + ": " + character.getValue());
        }
    }
}
