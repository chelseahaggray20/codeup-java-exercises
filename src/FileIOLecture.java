import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileIOLecture {

    public static void main(String[] args) {
//        newFile();
//        readFile();
        readWriteFile();
    }

    static void newFile(){
        String directory = "data";
        String filename = "info.txt";

        Path dataDirectory = Paths.get(directory);
        System.out.println(dataDirectory.toAbsolutePath());
        Path dataFile = Paths.get(directory, filename);

        try {
            if (Files.notExists(dataDirectory)) {
                Files.createDirectories(dataDirectory);
                System.out.println("Created directory");
            }
            if (!Files.exists(dataFile)) {
                Files.createFile(dataFile);
                System.out.println("Created file");
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    static void readFile(){
        try {
            Path poemFile = Paths.get("europa", "poem.txt");
            List<String> poemLines = Files.readAllLines(poemFile);
            for (String line : poemLines) {
                System.out.println(line);
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    static void readWriteFile(){
        List<String> fruit = new ArrayList<>();
        try {
            Path groceries = Paths.get("data", "groceries.txt");
            fruit = Files.readAllLines(groceries);
            for (String line : fruit) {
                System.out.println(line);
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        fruit.add("kiwi");fruit.add("starfruit");
        try {
            Path groceries = Paths.get("data","groceries.txt");
            Files.write(groceries, fruit);
            //Files.write(groceries, fruit, StandardOpenOption.APPEND);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}