import java.util.Arrays;

public class Q24_ConcatArrays {
    public static void main(String[] args) {
        int[]arr1 = {1,2,3,4,5};
        int[]arr2 = {6,7,8,9,0};
        int[]arr3 = new int[arr1.length+arr2.length];
        for (int i = 0, j=arr1.length; j<arr3.length; i++, j++){
            arr3[i]=arr1[i];
            arr3[j]=arr2[i];
        }
        System.out.println(Arrays.toString(arr3));


    }
}
