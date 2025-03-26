import java.io.*;
import java.nio.charset.StandardCharsets;

public class ReadBinaryFile {
    public static void main(String[] args) {
        String filePath = "D:/8th sem/bridgelabz.workspace/java-linear-and-binary-search/readFile.txt";

        try (FileInputStream fileInputStream = new FileInputStream(filePath);
             InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, StandardCharsets.UTF_8);
             BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}
