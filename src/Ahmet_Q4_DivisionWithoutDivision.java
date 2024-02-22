import java.util.Scanner;

public class Ahmet_Q4_DivisionWithoutDivision {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number that you would like to divide");
        String n1 = in.nextLine();
        System.out.println("Enter number by which you would like to divide");
        String n2 = in.nextLine();
        double num1 = Double.parseDouble(n1);
        double num2 = Double.parseDouble(n2);
        divideWithoutDivisionOperator(num1, num2);
    }


    public static void divideWithoutDivisionOperator (double n1, double n2){
        int result = 0;
        if (n2 == 0){
            throw new RuntimeException("You cannot divide by 0");
        }
        for (double i = n2; i<=n1; i+=n2) {
            result++;
        }
        System.out.println("Integer result of division of "+n1+" by "+n2+" is "+result);
    }

}


/*
    Divide Without Division

    Create a method to divide two numbers without using the division operator.
    Display the division value as well as any remainder
        parameter: int, int
        return: void

    output format: num1 / num2 is resultValue with remainder $remainderValue

    edge cases:
        cannot divide by 0

    Ex:
        input: 6, 2
        output: 6 / 2 is 3 with remainder 0
    Test data:
        6, 2 -> 6 / 2 is 3 with remainder 0
        7, 2 -> 7 / 2 is 3 with remainder 1
        8, 3 -> 8 / 3 is 2 with remainder 2
        7, 0 -> Cannot divide by 0
        3, 5 -> 3 / 5 is 0 with remainder 3

 */