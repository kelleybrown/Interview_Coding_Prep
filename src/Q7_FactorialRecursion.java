import java.util.Scanner;

public class Q7_FactorialRecursion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the number");
        int num = in.nextInt();
        System.out.println("Factorial number of "+num+" is: "+factorialRecursion(num));

    }
    public static int factorialRecursion(int num){
        if (num==1){
            return 1;
        } else {
            return num*factorialRecursion(num-1);
        }
    }
}

