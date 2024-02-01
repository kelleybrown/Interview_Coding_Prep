
import java.util.Arrays;

public class Q2_BinaryRepresentationOfN {
    public static void main(String[] args) {
        countOnes(6);
    }

    public static void countOnes(int n) {
        String binary = Integer.toBinaryString(n);
        System.out.println("Binary representation: "+binary);
        String[] b = binary.split("");
        int count = 0;
        for (String each : b) {
            if (each.equalsIgnoreCase("1")) {
                count++;
            }
        }
        System.out.println("Count of \'1\': "+count);
    }
}
