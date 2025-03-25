import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileLineByLine {
    public static void main(String[] args) throws IOException {
        String filePath = "D:/8th sem/bridgelabz.workspace/java-linear-and-binary-search/readFile.txt";

        try(FileReader fr = new FileReader(filePath)){
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }
        catch(IOException e){
            System.out.println("Error  : " + e.getMessage());
        }
    }
}
//output of file
//Read this file using file reader.
//File Created at 25 March
//Its a good day !
