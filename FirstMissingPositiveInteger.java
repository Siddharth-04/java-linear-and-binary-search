public class FirstMissingPositiveInteger {
    public static void findFirstMissingPositiveInteger(int [] arr) {
        int [] freq = new int[arr.length+2];

        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }

        boolean found = false;

        for(int i=1;i<freq.length;i++){
            if(freq[i]==0){
                found = true;
                System.out.println(i+" is first missing number");
                break;
            }
        }

        if(!found){
            System.out.println("No missing number");
        }
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,7,8,9};
        findFirstMissingPositiveInteger(arr);
    }
}

//6 is first missing number
