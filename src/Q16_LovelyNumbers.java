import java.util.ArrayList;

public class Q16_LovelyNumbers {
    public static void main(String[] args) {
        int a = 3000;
        int b = 4000;
        ArrayList<Integer> lovelyNums = new ArrayList<>();
        ArrayList<Integer> notLovely = new ArrayList<>();
        for (int i = a; i<=b; i++){
            lovelyNums.add(i);
            String num = String.valueOf(i);
            for (int j = 0; j<num.length(); j++){
                int count = 0;
                for (int k = 0; k<num.length(); k++){
                    if (num.charAt(j) == num.charAt(k)){
                        count++;
                    }
                }
                if (count>=3) {
                    int finalI = i;
                    lovelyNums.removeIf(p-> p.equals(finalI));
                }
            }
        }
        System.out.println(lovelyNums);
        System.out.println(lovelyNums.size());
    }
}
