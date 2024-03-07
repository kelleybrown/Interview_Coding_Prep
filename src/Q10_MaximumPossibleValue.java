import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Q10_MaximumPossibleValue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = in.nextInt();
        maxNumber(num);
    }
    public static void maxNumber(int n){  // 697(5) 67(5)0 (5)270 6(5)39
        ArrayList<Integer> nums = new ArrayList<>();
        int num = Math.abs(n);
        while (num > 0) {
            nums.add(num % 10);
            num = num / 10;
        }
        Collections.reverse(nums);
        System.out.println(nums);
        int maxnumber = 0;
        for (int i = 0; i<=nums.size(); i++){
            ArrayList<Integer> newnums = new ArrayList<>();
            newnums.addAll(nums);
            newnums.add(i, 5);
            String result = "";
            for (int j = 0; j<newnums.size(); j++){
                result += newnums.get(j)+"";
            }
            int intresult = Integer.parseInt(result);
            if (intresult>maxnumber){
                maxnumber = intresult;
            }
        }
        if (n<0){
            maxnumber *= (-1);
        }
        System.out.println("If you insert 5 anywhere in this number, the maximum number will be: "+ maxnumber);
    }
}
