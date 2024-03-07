import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Q22_FrequencyInWords {
    public static void main(String[] args) {


        String[] arr = {"apple", "kiwi", "banana", "kiwi", "apple", "apple", "orange"};
        Map<String, String> map = new HashMap<>();
        for (String each : arr) {
            int f = Collections.frequency(Arrays.asList(arr), each);
            String frequency = "";
            switch(f){
                case 1: frequency = "one"; break;
                case 2: frequency = "two"; break;
                case 3: frequency = "three"; break;
                case 4: frequency = "four"; break;
                case 5: frequency = "five"; break;
                case 6: frequency = "six"; break;
                case 7: frequency = "seven"; break;
                case 8: frequency = "eight"; break;
                case 9: frequency = "nine"; break;
                case 10: frequency = "ten"; break;
                default: frequency = "over ten"; break;
            }
            map.put(each, frequency);
        }
        System.out.println(map);
    }
}
