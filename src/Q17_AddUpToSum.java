public class Q17_AddUpToSum {
    public static void main(String[] args) {
        int[] arr = {1,8,7,2,5,6,3,10,24};
        int sum = 10;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]+arr[j]==sum){
                    System.out.println(arr[i]+" & "+arr[j]);
                }
            }
        }



    }
}
