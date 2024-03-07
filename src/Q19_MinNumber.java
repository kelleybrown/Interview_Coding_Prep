import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class Q19_MinNumber {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 10, 5, 3, 5, 5, 4, 8};
        System.out.println(findMax(arr));
        System.out.println(findMaxByConversionIntoCollection(arr));
    }
    public static int findMax(int[]arr){
        int min = arr[0];
        for (int i = 0; i<arr.length; i++){
            if (arr[i]<min){
                min = arr[i];
            }
        }
        return min;}

    public static int findMaxByConversionIntoCollection(int[] arr){
        ArrayList<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toCollection(ArrayList::new));
        int min = Collections.min(list);
        return min;}
}
