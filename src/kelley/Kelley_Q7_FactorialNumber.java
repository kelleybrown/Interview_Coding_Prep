package kelley;

public class Kelley_Q7_FactorialNumber {

    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(factorial(6));
        System.out.println(factorial(8));
    }

    public static int factorial (int n){

        int result = 1;

        while(n > 1){
            result *= n--;  // n will be multiplied to the result, THEN (post-dec) decrease by 1 each iteration

        }
        return result;
    }

}

/*
 To find the factorial of a number, you can:
   -- create a while loop that will continue as long as the num>1
   -- declare a result variable (initialize it to 1)
   -- take the argument & multiply it by the result (assign to result each iteration)
   -- this will continue going through each number down to 1
 */

