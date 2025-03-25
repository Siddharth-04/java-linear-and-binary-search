public class ReverseAString {
    public static void swap(StringBuilder str, int i, int j) {
        char temp = str.charAt(i);
        str.setCharAt(i, str.charAt(j));
        str.setCharAt(j, temp);
    }
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello");
        int i=0;
        int j=sb.length()-1;

        while(i<j) {
            swap(sb, i++, j--);
        }

        System.out.println(sb.toString());
    }
}
//olleh