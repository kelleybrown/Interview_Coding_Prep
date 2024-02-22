package kelley;

public class Kelley_Q13_SumDigitsUntilOne {

    public static void main(String[] args) {

        System.out.println("Expecting 2: " + sumDigitsUntilOne(45659));
        System.out.println("Expecting 4: " + sumDigitsUntilOne(3244));
        System.out.println("Expecting 2: " + sumDigitsUntilOne(24536));
    }

    public static int sumDigitsUntilOne(int num){

        while (num/10 != 0){

            int sum = 0;

            while (num != 0){
                sum += num % 10;  // gets the last digit, adds to sum
                num /= 10;        // removes the digit
            }
            num = sum;
        }

        return num;





    }
}
