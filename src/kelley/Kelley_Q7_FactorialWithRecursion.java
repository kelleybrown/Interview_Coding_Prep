package kelley;

public class Kelley_Q7_FactorialWithRecursion {

    public static int factorial2(int n){

        if(n == 1){
            return 1;
        }
        return n * factorial2(n-1);
    }
}

/*
To use recursion to find the factorial:
 -- needs to have a stopping point (if number==1, then just return 1)
 -- from there, we can just establish our return by calling the method itself
      return: we take our number, multiply it by the factorial of n-1
 -- this way, the method will continue to call itself, going through all numbers multiplying until it gets to 1

 */