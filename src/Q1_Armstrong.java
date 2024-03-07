import java.util.Arrays;
import java.util.Scanner;

public class Q1_Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = in.nextInt();
        boolean isArmstrong = false;
        String [] num = String.valueOf(number).split("");
        System.out.println(Arrays.toString(num));
        int sum = 0;
        for (int i = 0; i<num.length; i++){
            sum+=Math.pow(Integer.parseInt(num[i]), num.length);
        }
        if (sum == number){
            isArmstrong = true;
        }
        System.out.println(isArmstrong);
    }
}
