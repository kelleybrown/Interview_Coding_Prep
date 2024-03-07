import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class Q18_MaxNumber {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 10, 5, 3, 5, 5, 4, 8};
        System.out.println(findMax(arr));
        System.out.println(findMaxByConversionIntoCollection(arr));
    }
    public static int findMax(int[]arr){
        int max = arr[0];
        for (int i = 0; i<arr.length; i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }
        return max;}

    public static int findMaxByConversionIntoCollection(int[] arr){
        ArrayList<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toCollection(ArrayList::new));
        int max = Collections.max(list);
        return max;}
}
