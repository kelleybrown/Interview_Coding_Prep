import java.util.Arrays;

public class Q27_ReverseArray {
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5,6};
        int[]arr2 = new int[arr.length];
        for (int i = arr.length-1, j=0; i>=0; i--, j++ ){
            arr2[j] = arr[i];
        }
        System.out.println(Arrays.toString(arr2));
    }
}
