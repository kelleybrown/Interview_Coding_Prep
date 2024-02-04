package kelley;

public class Kelley_Q8_Fibonacci {

    public static void main(String[] args) {
        System.out.println(fibonacci(8));
        System.out.println(fibonacci(7 ));
        System.out.println(fibonacci(6));
    }

    public static int fibonacci(int n){
        int a = 0;
        int b = 1;

        for (int i = 2; i <= n; i++) {  //can start from 2 bc we already have index 1+2 declared above
            int next = a + b;  // this will always calculate the next number
            a = b;  //assign b to a (2nd number becomes 1st number)
            b = next; //
        }

        return b;

    }
}

/*
To calculate fibonacci numbers:
 -- need to add the previous 2 numbers, and continuously update them as we go
 -- declare a=0, b=1 (this is how every fibonacci sequence will begin)
 -- create a for loop to go up to n/argument number
 -- add a+b (which will be assigned as the new value of b each iteration)
    assign b to a

    ** the pattern is to calculate the last 2 numbers, then reassign**

 */
