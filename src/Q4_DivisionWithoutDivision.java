import java.util.Scanner;

public class Q4_DivisionWithoutDivision {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a dividend");
        String n1 = in.nextLine();
        System.out.println("Enter a divisor");
        String n2 = in.nextLine();
        double num1 =Double.parseDouble(n1);
        double num2 = Double.parseDouble(n2);
        divideWithoutDivisionOperator(num1, num2);
    }

    public static void divideWithoutDivisionOperator (double n1, double n2){
        int result = 0;
        if (n1 <= 0 || n2 <=0)
        {
            throw new RuntimeException("Please use positive numbers");
        }
        for (double i = n2; i<=n1; i+=n2) {
            result++;
        }
        System.out.println("Integer result of division of "+n1+" by "+n2+" is "+result);
        String left = String.format("%.02f", n1%n2);
        System.out.println("Remainder " + left);
    }

}
