import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Q26_RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,3,2,3,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(removeDuplicates(arr)));

    }
    public static int[] removeDuplicates(int...arr) {

        Set<Integer> set = Arrays.stream(arr).boxed().collect(Collectors.toCollection(LinkedHashSet::new));
        int[] arr2 = set.stream().mapToInt(Integer::intValue).toArray();

    return arr2;}
}
