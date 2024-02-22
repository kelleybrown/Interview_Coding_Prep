public class Ahmet_Q7_FactorialNumber {

    public static void main(String[] args){
        System.out.println(factorialNumber(5));

    }

    public static int factorialNumber(int num){

        int factorial=1;
        for(int i=1; i<= num ; i++){
            factorial *= i;
        }
        return factorial;

    }



}

/*
Create a method that will accept an int number and return the factorial of that number.
parameter: int
return : 120






 */
