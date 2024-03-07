import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Q21_FrequencyUsingMap {
    public static void main(String[] args) {


        String[] arr = {"apple", "kiwi", "banana", "kiwi", "apple", "apple", "orange"};
        Map<String, Integer> map = new HashMap<>();
        for (String each : arr) {
            int f = Collections.frequency(Arrays.asList(arr), each);
            map.put(each, f);
        }
        System.out.println(map);
    }
}