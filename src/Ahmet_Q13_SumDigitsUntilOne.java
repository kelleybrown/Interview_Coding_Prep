public class Ahmet_Q13_SumDigitsUntilOne {

    public static void main(String[] args) {
        System.out.println(SumDIgits(45659));
    }

    public static int SumDIgits(int num){

        while(num/10 != 0){

            int sum =0;

            while(num!=0){
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }
}

/*
        Sum All Digits Until One Digit

        Create a method to calculate the sum of all the digits until there is only one digit left.
        The sum becomes the next number
            parameter: int
            return: int

        Ex:
        input: 45659
        output:
                2

        Explanation:
                4+5+6+5+9=29
                2+9=11
                1+1=2

        Test data
            45659 -> 29 -> 11 -> 2
            3244 -> 13 -> 4
            24536 -> 20 -> 2

     */

