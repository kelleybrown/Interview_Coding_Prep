import java.util.ArrayList;
import java.util.Scanner;

public class Q13_SumOfDigitsTil1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number that you would like to check");
        int num = in.nextInt();
        System.out.println(sumDigits(num));
    }

    public static int sumDigits(int num) {

        while (num > 9) {
            ArrayList<Integer> nums = new ArrayList<>();
            while (num > 0) {
                nums.add(num % 10);
                num = num / 10;
            }
            int sum = 0;
            for (int i = 0; i < nums.size(); i++) {
                sum += nums.get(i);
            }
            num = sum;
        }
        return num;
    }
}




