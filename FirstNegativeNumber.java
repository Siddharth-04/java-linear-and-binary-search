import java.util.Scanner;

public class FirstNegativeNumber {
    public static int findElement(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                return i;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(findElement(arr));
    }
}
//Enter the size of the array
//5
//Enter the elements of the array
//5 4 3 2 -1
//4
