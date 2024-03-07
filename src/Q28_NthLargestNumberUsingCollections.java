import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class Q28_NthLargestNumberUsingCollections {
    public static void main(String[] args) {


        int[] arr = {1, 2, 3, 4, 5, 6, 7, 5, 6, 7, 2, 3, 9};
        int n = 5;
        ArrayList<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toCollection(ArrayList::new));
        for (int i = 1; i < n; i++) {
            list.removeIf(p -> p.equals(Collections.max(list)));
        }
        System.out.println(Collections.max(list));
    }
}