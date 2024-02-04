package kelley;

public class Kelley_Q1_Armstrong {

    public static void main(String[] args) {
        System.out.println(isArmstrong(153));
        System.out.println(isArmstrong(371));
        System.out.println(isArmstrong(9474));
        System.out.println(isArmstrong(9475));
        System.out.println(isArmstrong(123));
    }

    public static boolean isArmstrong(int num){

        String strNum = "" + num;  // convert the number to a string to access each index
        int sum = 0; // declare a sum variable

        for (int i = 0; i < strNum.length(); i++) {  //create for loop to iterate through string of numbers

            int eachDigit = Integer.parseInt(strNum.substring(i, i+1));  // declare variable to represent each digit
                                                                         // use substring method to get each digit

            sum += Math.pow(eachDigit, strNum.length());   // use math.pow method to compute the exponent, then add to sum

        }
        return sum == num;  // returns boolean
    }
}

// An armstrong number means it's digits can be raised to the power of the total number of digits and summed to equal the original number
