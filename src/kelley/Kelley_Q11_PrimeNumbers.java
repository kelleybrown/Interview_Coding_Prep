package kelley;

public class Kelley_Q11_PrimeNumbers {

    public static void main(String[] args) {
        System.out.println("Expecting false: " + isPrime(0));
        System.out.println("Expecting true: " + isPrime(5));
        System.out.println("Expecting false: " + isPrime(10));
        System.out.println("Expecting true: " + isPrime(13));

    }

    public static boolean isPrime(int num){

        if(num < 2){
            return false;
        }
        for (int i = num-1; i > 1 ; i--) {
            if (num % i == 0){
                return false;
            }
        }
        return true;

    }
}

