public class Q20_FirstDuplicateNumber {
    public static void main(String[] args) {
        int[] arr = {3,4,2,1,4,5,7,8,6,5};
        System.out.println(firstDuplicate(arr));

    }
    public static int firstDuplicate(int[] arr){
        for (int i = 0; i<arr.length; i++){
            for (int j = i+1; j<arr.length; j++){
                if (arr[i] == arr[j]){
                    return arr[i];
                }
            }
        }
    return 0;}
}
