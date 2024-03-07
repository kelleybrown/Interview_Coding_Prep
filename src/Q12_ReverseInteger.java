import java.util.Scanner;

public class Q12_ReverseInteger {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number that you would like to check");
        int num = in.nextInt();
        reverse(num);
    }
    public static void reverse(int n){
        int num = Math.abs(n);
        int reverse = 0;

        while (num>=1){
            int firstR = num%10;
            reverse = reverse*10+firstR;
            num = num/10;}

        if (n<0){
            reverse*=(-1);
        }
        System.out.println("Reverse number: "+reverse);
    }
}
