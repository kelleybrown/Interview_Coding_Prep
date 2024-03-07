import java.util.Scanner;

public class Q8_FibonacciRecursion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter which number in Fibonacci sequence you would like to get");
        int num = in.nextInt();
        System.out.println("Element number " + num + " in Fibonacci Sequence is: " + fibonacciRecursion(num));

    }

    public static int fibonacciRecursion(int num) { //4 return 3
        if (num == 1) {
            return 0;
        } else if (num == 2) {
            return 1;
        } else if (num == 3) {
            return 2;
        } else {
            return fibonacciRecursion(num - 1) + fibonacciRecursion(num - 2);
        }
    }
}
