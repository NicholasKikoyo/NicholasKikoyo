import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;


public class ReadFileCharByChar {

    public static void main(String[] args) {
        createDictionary("files/input-file.txt", "files/dictionary.txt");
    }

    public static void createDictionary(String inputFile, String dictionaryFile) {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(dictionaryFile))) {

            reader.lines()
                .flatMap(line -> Arrays.stream(line.split("//s+")))
                .distinct()
                .sorted()
                .forEach(str -> {
                    try {
                        writer.write(str);
                        writer.newLine();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                });        } catch (IOException e) {
            e.printStackTrace();
        }
    }}


