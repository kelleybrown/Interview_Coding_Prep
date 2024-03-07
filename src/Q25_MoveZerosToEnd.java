import java.util.Arrays;

public class Q25_MoveZerosToEnd {
    public static void main(String[] args) {
        int[]arr = {1,0,5,0,2,3,4,0,1,2,3};
        for (int i = 0; i<arr.length-1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] == 0) {
                    arr[j] = arr[j + 1];
                    arr[j + 1] = 0;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
