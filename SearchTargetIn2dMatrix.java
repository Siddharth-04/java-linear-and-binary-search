import java.util.Arrays;

public class SearchTargetIn2dMatrix {
    public static int[] findTargetIn2DMatrix(int[][] arr, int target,int i) {
        int left = 0;
        int right = arr[0].length-1;
        int[] ans = new int[2];

        while (left < right) {
            int mid = left + (right-left)/2;
            if(arr[i][mid] == target) {
                ans[0] = i;
                ans[1] = mid;
                return ans;
            }
            else if(arr[i][mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int target = 8;

        for(int i=0 ; i<arr.length ; i++){
            if(arr[i][0]<= target && arr[i][arr[i].length-1]>= target){
                System.out.println(Arrays.toString(findTargetIn2DMatrix(arr, target, i)));
                break;
            }
        }
    }
}
//[2, 1]