public class Q21_FrequencyInArray {
    public static void main(String[] args) {

        String[] arr = {"apple", "kiwi", "banana", "kiwi", "apple", "apple", "orange"};
        String result = "";
        for (String each : arr) {
            int count = 0;
            for (String each2 : arr) {
                if (each.equals(each2)) {
                    count++;
                }
            }
            if (!result.contains(each)) result += each + " = " + count+"\n";
        }
        System.out.println(result);

    }
}