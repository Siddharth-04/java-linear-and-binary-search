public class FindFirstAndLastOccurence {
    public static int findLastOccurence(int[] arr,int target) {
        int left = 0;
        int right = arr.length - 1;
        int last = -1;

        while(left <= right) {
            int mid = left + (right - left) / 2;

            if(arr[mid] == target){
                last = mid;
                left = mid + 1;
            }
            else if(arr[mid] > target){
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }

        return last;
    }

    public static int findFirstOccurence(int[] arr,int target) {
        int left = 0;
        int right = arr.length - 1;
        int first = -1;

        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(arr[mid] == target){
                first = mid;
                right = mid - 1;
            }

            else if(arr[mid] < target){
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }

        return first;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,5,7,8,9};
        System.out.println(findFirstOccurence(arr,5));
        System.out.println(findLastOccurence(arr,5));
    }
}
