public class Q28_SecondLargestNumberInArray {
    public static void main(String[] args) {
        int[]arr = {10,2,3,4,5,6,7,5,6,7,2,3,9};
        int max = arr[0];
        for (int i = 0; i<arr.length; i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }
        int max2 = Integer.MIN_VALUE;
        for (int i=0; i<arr.length; i++){
            if (arr[i]>max2 && arr[i]<max){
                max2 = arr[i];
            }
        }
        System.out.println(max2);
    }
}
