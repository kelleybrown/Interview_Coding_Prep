import java.util.Scanner;

public class Q5_DivisibleBy3_5_15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number until which you would like to count");
        int num = in.nextInt();
        divisibleBy3_5_15(num);
    }
    public static void divisibleBy3_5_15(int num){
        String divisibleBy3 = "Divisible by 3: ";
        String divisibleBy5 = "Divisible by 5: ";
        String divisibleBy15 = "Divisible by 15: ";
        for (int i = 1; i<=num; i++){
            if (i%15==0){
                divisibleBy15+=i+" ";
            } else if (i%5 == 0){
                divisibleBy5+=i+" ";
            } else if (i%3 == 0){
                divisibleBy3+=i+" ";
            }
        }
        System.out.println(divisibleBy15.trim());
        System.out.println(divisibleBy5.trim());
        System.out.println(divisibleBy3.trim());
    }
}
