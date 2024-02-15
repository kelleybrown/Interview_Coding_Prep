import java.util.Scanner;

public class Q11_PrimeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number that you would like to check");
        int num = in.nextInt();
        System.out.println(primeNumber(num));
    }

    public static boolean primeNumber(int num) {
        if (num<0){
            throw new ArithmeticException("Negative numbers cannot be prime");
        }
        int count = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if (count > 1) {
            return false;
        }
        return true;
    }
}
