public class ConcatenateStringUsingStringBuffer {
    public static void main(String[] args) {
        String name = "Siddharth";
        StringBuffer sb = new StringBuffer("Hi ");
        sb.append(name);
        System.out.println(sb.toString());
    }
}
//Hi Siddharth