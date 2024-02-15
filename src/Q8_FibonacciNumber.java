import java.util.Arrays;
import java.util.Scanner;

public class Q8_FibonacciNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter which number in Fibonacci sequence you would like to get");
        int num = in.nextInt();
        fibonacci(num);
    }

    public static void fibonacci(int num) {
        int[] fibonacciSequence = new int[num];
        fibonacciSequence[0] = 0;
        if (fibonacciSequence.length > 1) {
            fibonacciSequence[1] = 1;
            if (fibonacciSequence.length > 2) {
                fibonacciSequence[2] = 2;
                if (fibonacciSequence.length > 3) {
                    for (int i = 3; i < num; i++) {
                        fibonacciSequence[i] = fibonacciSequence[i - 1] + fibonacciSequence[i - 2];
                    }
                }
            }
        }
        System.out.println(Arrays.toString(fibonacciSequence));
        int nthFibonacciNumber = fibonacciSequence[num - 1];
        System.out.println("Element number " + num + " in Fibonacci Sequence is: " + nthFibonacciNumber);
    }
}
