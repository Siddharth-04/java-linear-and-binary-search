import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CountOccurenceofWord {
    public static void main(String[] args) throws FileNotFoundException {
        String filePath = "D:/8th sem/bridgelabz.workspace/java-linear-and-binary-search/readFile.txt";
        String target = "file";
        int count = 0;

        try(FileReader fr = new FileReader(filePath)){
            BufferedReader br = new BufferedReader(fr);
            String line;

            while((line = br.readLine() )!= null){
                String [] words = line.split("\\s+");

                for(String word : words){
                    if(word.equals(target)){
                        count++;
                    }
                }
            }

            System.out.println(count);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
