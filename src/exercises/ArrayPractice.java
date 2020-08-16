package exercises;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {

        int[] values = {1, 1, 2, 3, 5, 8};

        for (int value : values) {
            if (value % 2 != 0) {
                System.out.println(value);
            }
        }

        String sentence = "I would not, could not, in a box. I would not, could " +
                "not with a fox. I will not eat them in a house. I will not eat " +
                "them with a mouse.";

        String[] words = sentence.split(" ");

        System.out.println(Arrays.toString(words));

        String[] paragraph = sentence.split("\\.");
        System.out.println(Arrays.toString(paragraph));
    }
}
