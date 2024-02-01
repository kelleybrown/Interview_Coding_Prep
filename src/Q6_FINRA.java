import java.util.Scanner;

public class Q6_FINRA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number until which you would like to count");
        int num = in.nextInt();
        finra(num);
    }
    public static void finra(int num){
        for (int i = 1; i <=num; i++) {
            String r;
            if (i%5==0&&i%3==0){
                r = "FINRA";
            } else if (i%5==0){
                r = "RA";
            } else if (i%3==0){
                r = "FIN";
            } else {r=String.valueOf(i);}
            System.out.print(r+" ");
        }
    }
}
