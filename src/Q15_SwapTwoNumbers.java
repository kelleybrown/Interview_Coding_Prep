public class Q15_SwapTwoNumbers {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        swapNumbers(x, y);
    }
    public static void swapNumbers(int x, int y){
        x = x+y;
        y = x-y;
        x = x-y;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
