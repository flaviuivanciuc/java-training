package code._4_student_effort._2_secret_message;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static final String FILEPATH = "_4_exceptions_io/src/main/java/code/_4_student_effort/_2_secret_message/message";

    public static void main(String[] args) {
        try {
            System.out.println(readSecretMessage(readFile(FILEPATH)));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static StringBuilder readSecretMessage(String[] words) {
        StringBuilder secretMessage = new StringBuilder();
        for (String word : words) {
            char[] letters = word.toCharArray();
            for (char letter : letters) {
                if (Character.isUpperCase(letter)) {
                    if (letter == 'X') {
                        secretMessage.append(" ");
                    } else {
                        secretMessage.append(letter);
                    }
                }
            }
        }
        return secretMessage;
    }

    private static String[] readFile(String filePath) throws FileNotFoundException {
        String[] words = new String[0];
        Scanner word = null;
        int wordCount = 0;

        try {
            word = new Scanner(new BufferedReader(new FileReader(filePath)));
            while (word.hasNext()) {
                words = Arrays.copyOf(words, words.length + 1);
                words[wordCount++] = word.next();
            }
        } finally {
            if (word != null)
                word.close();
        }

        String[] appropriateLengthWordsArray = new String[wordCount];
        System.arraycopy(words, 0, appropriateLengthWordsArray,0, wordCount);
        return appropriateLengthWordsArray;
    }
}
