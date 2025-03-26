import java.io.*;

public class ConsoleToFile {
    public static void main(String[] args) {
        String filePath = "D:/8th sem/bridgelabz.workspace/java-linear-and-binary-search/readFile.txt";

        try (InputStreamReader inputStreamReader = new InputStreamReader(System.in);
             BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
             FileWriter fileWriter = new FileWriter(filePath, true);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {

            System.out.println("Enter text (type 'exit' to stop):");
            String line;
            while (!(line = bufferedReader.readLine()).equalsIgnoreCase("exit")) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
            System.out.println("Input saved to file.");
        } catch (IOException e) {
            System.err.println("Error handling file: " + e.getMessage());
        }
    }
}
//Enter text (type 'exit' to stop):
//exit
//Input saved to file.