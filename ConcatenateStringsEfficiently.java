public class ConcatenateStringsEfficiently {
    public static void main(String[] args) {
        String [] arr = {"Hi","what","is","your","name","?"};
        StringBuffer sb = new StringBuffer();

        for(int i=0 ; i<arr.length ; i++){
            sb.append(arr[i]);
            sb.append(" ");
        }

        System.out.println(sb.toString());
    }
}
