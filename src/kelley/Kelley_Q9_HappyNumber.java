package kelley;

public class Kelley_Q9_HappyNumber {

    public static void main(String[] args) {
        System.out.println(isHappy(32));
        System.out.println(isHappy(42));
    }

    public static String isHappy(int n){

        while ( n != 1 && n != 4){

            int sum = 0;

            while( n > 0 ){
                int eachDigit = n % 10;  //this will give you each digit starting backwards
                sum += eachDigit * eachDigit;  //this will square each digit and add to sum
                n /= 10;  //this will eliminate the last digit before next iteration
            }
            n = sum;   //as long as sum doesn't equal 1 or 4, it will keep running
        }

        return  n == 1 ? "Happy" : "Unhappy";
    }
}
