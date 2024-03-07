import java.util.Scanner;

public class Q7_FactorialNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the number");
        int num = in.nextInt();
        factorialNumber(num);

    }
    public static void factorialNumber(int num){
        int factorial = 1;
        for (int i = 1; i<=num; i++){
            factorial*=i;
        }
        System.out.println("Factorial number of "+num+" is: "+factorial);
    }
}
