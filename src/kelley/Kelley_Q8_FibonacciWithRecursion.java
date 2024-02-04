package kelley;

public class Kelley_Q8_FibonacciWithRecursion {

    public static void main(String[] args) {
        System.out.println(fibonacci2(8));
        System.out.println(fibonacci2(5));
        System.out.println(fibonacci2(3));
    }

    public static int fibonacci2(int n){
        if (n < 2){
            return n;
        }
        return fibonacci2(n-2) + fibonacci2(n-1);
    }
}

/*
To use recursion with fibonacci numbers,
   we need to continuously calculate the sum of the previous 2, so we can use recursion to continue this addition pattern
 */
