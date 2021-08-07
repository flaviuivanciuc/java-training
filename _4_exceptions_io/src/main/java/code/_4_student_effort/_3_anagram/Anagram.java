package code._4_student_effort._3_anagram;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Anagram {
    private static final String IN = "_4_exceptions_io/_test_files/in/small_list.txt";
    private static final String OUT = "_4_exceptions_io/_test_files/out/outpout.txt";

    static int anagramCount = 0;
    static List<String> anagramWords;

    public static void main(String[] args) {
        anagramWords = new ArrayList<>();

        String targetWord = "listen";
        int targetWordLength = targetWord.length();
        permute(targetWord, 0, targetWordLength - 1);

        List<String> words = new ArrayList<>();
        int countOfWords = 0;
        for (int i = 0; i < anagramWords.size(); i++) {
            try {
                words.add(countOfWords++, searchWord(anagramWords.get(i), readListOfWords(IN)));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        writeInFile(words);
    }

    private static void writeInFile(List<String> words) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(OUT));
            copy(words, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void copy(List<String> words, BufferedWriter writer) throws IOException {
        try {
            for (int i = 0; i < words.size(); i++) {
                writer.write(words.get(i));
            }
        } finally {
            if (writer != null)
                writer.close();
        }
    }

    private static String searchWord(String name, String[] readListOfWords) {
        for (int i = 0; i < readListOfWords.length; i++) {
            if (readListOfWords[i].equals(name)) {
                return readListOfWords[i];
            }
        }
        return "";
    }

    private static String[] readListOfWords(String fileName) throws FileNotFoundException {
        String[] words = new String[0];
        Scanner scanner = null;
        int wordCount = 0;
        try {
            scanner = new Scanner(new BufferedReader(new FileReader(fileName)));
            while (scanner.hasNext()) {
                words = Arrays.copyOf(words, words.length + 1);
                words[wordCount++] = scanner.next();
            }
        } finally {
            if (scanner != null)
                scanner.close();
        }

        String[] appropriateLengthWordsArray = new String[wordCount];
        System.arraycopy(words, 0, appropriateLengthWordsArray, 0, wordCount);
        return appropriateLengthWordsArray;
    }

    private static void permute(String targetWord, int start, int end) {
        if (start == end) {
            anagramWords.add(anagramCount++, targetWord);
            System.out.println(targetWord);
        } else {
            for (int i = start; i <= end; i++) {
                targetWord = swap(targetWord, start, i);
                permute(targetWord, start + 1, end);
                targetWord = swap(targetWord, start, i);
            }
        }
    }

    private static String swap(String initialString, int i, int j) {
        char temp;
        char[] charArray = initialString.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}
