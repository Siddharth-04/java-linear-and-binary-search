import java.util.Scanner;

public class FindSpecificWord {
    public static String findWord(String[] arr,String word) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            String w = arr[i];
            if(w.equals(word)){
                return w;
            }
        }

        return "Not Found";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence");
        String sentence = sc.nextLine();

        String[] words = sentence.split(" ");
        System.out.println(findWord(words,"world"));
    }
}
//The world is beautiful
//world

