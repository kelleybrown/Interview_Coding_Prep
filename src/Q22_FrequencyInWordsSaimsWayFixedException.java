import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Q22_FrequencyInWordsSaimsWayFixedException {
    public static void main(String[] args) {


    String[] arr = {"apple", "kiwi", "banana", "kiwi", "apple", "apple", "orange","apple","apple","apple","apple","apple","apple","apple","apple","apple","apple"};
    Map<String, String> map = new HashMap<>();
        for (String each : arr) {
        int f = Collections.frequency(Arrays.asList(arr), each);
        String[]counts = {"one","two","three","four","five","six","seven","eight","nine","ten","more than ten"};
        try{map.put(each, counts[f-1]);}
        catch (ArrayIndexOutOfBoundsException e){
            map.put(each, counts[counts.length-1]);
        }
    }
        System.out.println(map);
}
}
