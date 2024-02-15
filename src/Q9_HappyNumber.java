import java.util.ArrayList;
import java.util.Scanner;

public class Q9_HappyNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the number");
        int num = in.nextInt();
        happyNumber(num);
    }

    public static void happyNumber(int num) {
        while (num > 0) {
            ArrayList<Integer> nums = new ArrayList<>();
            while (num > 0) {
                nums.add(num % 10);
                num = num / 10;
            }
            System.out.println(nums);
            int sum = 0;
            for (Integer each : nums) {
                sum += each * each;
            }
            System.out.println(sum);
            num = sum;
            if (num == 1) {
                System.out.println("It's a happy number");
                break;
            } else if (num == 4) {
                System.out.println("It's an unhappy number");
                break;
            }
        }
    }
}