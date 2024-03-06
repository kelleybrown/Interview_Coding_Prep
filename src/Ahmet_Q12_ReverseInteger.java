public class Ahmet_Q12_ReverseInteger {

    public static void main(String[] args) {
        System.out.println(reverseInt(1234));
    }

    public static int reverseInt(int a){

        int reverseNumber = 0;

     while(a>0){

         int lastGigit = a%10;

         reverseNumber = reverseNumber * 10 + lastGigit;
         a/=10;
     }
        return reverseNumber;
    }

}

/*
         Reverse Integer

        Create a method to reverse the given number
            parameter: int
            return: int

        Reverse using only numbers, no Strings

        Assume the given number is a positive integer

        Ex:
            input: 1234
            output: 4321
     */

