import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReader {
    public static ArrayList<String> getLyrics(String fileName) {
        ArrayList<String> lyrics = new ArrayList<String>();

        try {
            File file = new File(fileName);
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                lyrics.add(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error reading file.");
            e.printStackTrace();
        }

        return lyrics;
    }
}
