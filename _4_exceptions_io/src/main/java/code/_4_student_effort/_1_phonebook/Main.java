package code._4_student_effort._1_phonebook;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public final static String FILEPATH = "_4_exceptions_io/src/main/java/code/_4_student_effort/_1_phonebook/phonebook";

    public static void main(String[] args) throws FileNotFoundException {
        Map<String, String> mapFromFile = hashMapFromTextFile();

        for (Map.Entry<String, String> entry : mapFromFile.entrySet()) {
            if (entry.getKey().equals("Abbey"))
                System.out.println(entry.getValue());
            if (entry.getKey().equals("Abdul"))
                System.out.println(entry.getValue());
        }
    }

    public static Map<String, String> hashMapFromTextFile() {
        Map<String, String> map = new HashMap<>();
        BufferedReader reader = null;

        try {
            File file = new File(FILEPATH);
            reader = new BufferedReader(new FileReader(file));
            String line = null;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" ");

                String name = parts[0].trim();
                String number = parts[1].trim();

                if (!name.equals("") && !number.equals("")) {
                    map.put(name, number);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return map;
    }
}
