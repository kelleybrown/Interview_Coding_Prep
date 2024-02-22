package kelley;

public class Kelley_Q12_ReverseInteger {

    public static void main(String[] args) {
        System.out.println(reverseInt(54321));
        System.out.println(reverseInt(876));
        System.out.println(reverseInt(1234));
    }

    public static int reverseInt(int n){

        int reverse = 0;

        while (n > 0){
            int lastDigit = n % 10;
            reverse = reverse * 10 + lastDigit;
            n /= 10;
        }
        return reverse;
    }
}
