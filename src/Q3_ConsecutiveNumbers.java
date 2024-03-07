import java.util.Scanner;

public class Q3_ConsecutiveNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number until which you would like to count");
        int num = in.nextInt();
        codilityTestCoders(num);
    }
    public static void codilityTestCoders(int num){
        if (num<=0){
            throw new RuntimeException("Number has to be positive");
        }
        for (int i = 1; i <=num; i++) {
            String r = "";
            if (i%2==0){
                r += "Codility";
            }
            if (i%3==0){
                r += "Test";
            }
            if (i%5==0){
                r += "Coders";
            }
            if (!(i%2==0) && !(i%3 ==0) && !(i%5==0)){
                r = String.valueOf(i);
            }
            System.out.println(r);
        }
    }
}
