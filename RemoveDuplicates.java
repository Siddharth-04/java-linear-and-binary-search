import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("racecar");
        HashSet<Character> set=new HashSet<Character>();

        for(int i=0 ; i<sb.length() ; i++){
            if(!set.contains(sb.charAt(i))){
                System.out.print(sb.charAt(i));
                set.add(sb.charAt(i));
            }
            else {
                continue;
            }
        }
    }
}
//race