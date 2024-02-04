package kelley;

public class Kelley_Q10_MaxValue {

    public static void main(String[] args) {

        System.out.println(maxValue(268));
        System.out.println(maxValue(670));
        System.out.println(maxValue(0));
        System.out.println(maxValue(-999));
        System.out.println(maxValue(798));
        System.out.println(maxValue(-798));
    }

    public static int maxValue (int n){

        boolean isPositive =  n>=0;
        n = Math.abs(n);
        String strNum = String.valueOf(n);
        boolean added5 = false;


        for (int i = 0; i < strNum.length(); i++) {

            int eachDigit = Integer.parseInt(strNum.substring(i, i+1));

            if((isPositive && eachDigit < 5) || ((!isPositive && eachDigit > 5))){
                strNum = strNum.substring(0, i) + 5 + strNum.substring(i);
                added5 = true;
                break;
            }

        }

        if( isPositive && !added5){
            strNum = strNum + 5;
        }

        return Integer.parseInt(strNum) * (isPositive ? 1 : -1);
    }
}
