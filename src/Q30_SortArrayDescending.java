import java.util.Arrays;

public class Q30_SortArrayDescending {
    public static void main(String[] args) {
        int[] arr = {10, -2, 5, 6, 34, 30, 3, 6, 7, 1, 8, 199};

        for (int k = 0; k < arr.length; k++) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] < arr[i + 1]) {
                    arr[i] += arr[i + 1];
                    arr[i + 1] = arr[i] - arr[i + 1];
                    arr[i] = arr[i] - arr[i + 1];
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}