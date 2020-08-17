package exercises;

import java.util.Scanner;

public class Alice {

    public static void main(String[] args) {
        String sentence = "Alice was beginning to get very tired of sitting by " +
                "her sister on the bank, and of having nothing to do: once or " +
                "twice she had peeped into the book her sister was reading, but " +
                "it had no pictures or conversations in it, 'and what is the use" +
                " of a book,' thought Alice 'without pictures or conversation?'";
        sentence = sentence.toLowerCase();

        Scanner input;
        input = new Scanner(System.in);

        // User input string for search
        System.out.println("Search for a string of characters");
        String search = input.nextLine();
        search = search.toLowerCase();

        // print search results
        System.out.println(sentence.contains(search));
        System.out.println(sentence.indexOf(search));
        System.out.println(search.length());

        // Remove text from sentence
        sentence = sentence.replace(search, "");
        System.out.println(sentence);

        input.close();
    }
}
