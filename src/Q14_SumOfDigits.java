import java.util.ArrayList;
import java.util.Scanner;

public class Q14_SumOfDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number that you would like to check");
        int num = in.nextInt();
        System.out.println(sumOfDigits(num));
    }
    public static int sumOfDigits(int num){
        ArrayList<Integer> nums = new ArrayList<>();
        while (num > 0) {
            nums.add(num % 10);
            num = num / 10;
        }
        System.out.println(nums);
        int sum = 0;
        for (int i = 0; i < nums.size(); i++) {
            sum += nums.get(i);
        }
        return sum;
    }
}
