import java.util.Arrays;
import java.util.Scanner;

public class Ahmet_Q1_Armstrong {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in); // creating a scanner object
        System.out.println("Please enter the number to check if it is Armstrong number or not");
        int num =  sc.nextInt(); // storing  input from user
        isArmstrong(num); // call the Armstrong method

    }
     public static void  isArmstrong(int num){ // method body to determine Armstrong number

         String [] StrArmstrongNumOrNot = String.valueOf(num).split(""); // crating string array from value of number
         System.out.println(Arrays.toString(StrArmstrongNumOrNot));
         int sum =0;

             for (int i = 0; i <StrArmstrongNumOrNot.length ; i++) {
                 sum += Math.pow(Integer.parseInt(StrArmstrongNumOrNot[i]), StrArmstrongNumOrNot.length);
             }
                     if (sum == num){
                         System.out.println( num + " is an Armstrong number!");
                     }else{
                         System.out.println( num + " is NOT an Armstrong number!");
                     }
    }
}
/*
        Armstrong

        Create a method to check if a number is an Armstrong number
            parameter: int
            return: boolean

        An Armstrong number is a number that's digits can be raised to the power of the total number of digits and summed to equal the original number

            -> these numbers are also called narcissistic numbers

        Ex:
            input: 153
            output: true

            the digits are 1, 5, and 3
            the calculation would be:
            1^3 + 5^3 + 3^3
                -> why is the exponent 3? because there is 3 digits in the number

            1^3 = 1 * 1 * 1 = 1
            5^3 = 5 * 5 * 5 = 125
            3^3 = 3 * 3 * 3 = 27

            1 + 125 + 27 = 153 --> the sum is equal to the original number so it is an Armstrong number

        Test data:
            153 -> true
            371 -> true
            9474 -> true
            9475 -> false
            123 -> false
     */
