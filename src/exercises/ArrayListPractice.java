package exercises;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {

    public static void main(String[] arg) {

        ArrayList<Integer> someNumbers = new ArrayList<>(Arrays.asList(1, 1, 2, 5, 3, 4, 7, 6, 8, 9));
        System.out.println(sum(someNumbers));

        ArrayList<String> wordList = new ArrayList<>(Arrays.asList("shoes", "shoe", "hats", "hat", "waffle", "truck"));
        fiveLetterWords(wordList);

        String s = ("I would not, could not, in a box. I would not, " +
                "could not with a fox. I will not eat them in a house. I will " +
                "not eat them with a mouse.");

        ArrayList<String> wordListTwo = new ArrayList<>(Arrays.asList(s.split(" ")));
        fiveLetterWords(wordListTwo);
    }

    public static Integer sum(ArrayList<Integer> someNumbers) {
        Integer sum = 0;

        for (Integer number : someNumbers) {
            if (number % 2 == 0) {
                sum += number;
            }

        }

        return sum;
    }

    public static void fiveLetterWords(ArrayList<String> wordList) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter word length for search: ");
        int searchLength = input.nextInt();

        for (String word : wordList) {
            if (word.length() == searchLength) {
                System.out.println(word);
            }
        }
    }
}
