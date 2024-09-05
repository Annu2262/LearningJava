package accenture;

import java.util.Scanner;

public class ShorterWord {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence: ");
        String input = scanner.nextLine();
        String output = shortenWords(input);
        System.out.println("Output: " + output);
        scanner.close();
    }

    public static String shortenWords(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder shortenedSentence = new StringBuilder();

        for (String word : words) {
            if (word.length() > 10) {
                int middleLength = word.length() - 2;
                String shortenedWord = word.charAt(0) + String.valueOf(middleLength) + word.charAt(word.length() - 1);
                shortenedSentence.append(shortenedWord).append(" ");
            } else {
                shortenedSentence.append(word).append(" ");
            }
        }

        return shortenedSentence.toString().trim();
    }
}
