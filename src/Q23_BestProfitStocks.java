public class Q23_BestProfitStocks {
    public static void main(String[] args) {
        //int[] s1 = {4, 1, 7, 8, 9, 1, 7, 8, 20, 4, 5, 7};
        int[] s1 = {1, 2, 1, 4, 2, 2, 1};
        //int[] s1 = {10, 7, 5, 2};
        int bestProfit = 0;
        for (int i = 0; i<s1.length-1; i++){
            if (s1[i]<s1[i+1]){
                bestProfit+=s1[i+1]-s1[i];
            }
        }
        System.out.println(bestProfit);
        if (bestProfit == 0){
            System.out.println("no profit could be made because the price always went down");
        }
        int min = s1[0];
        int max = s1[0];
        int minIndex = 0;
        int maxIndex = 0;
        for (int i=0; i<s1.length; i++){
            if (s1[i]<=min){
                min = s1[i];
                minIndex = i+1;
            }
            if(s1[i]>=max){
                max = s1[i];
                maxIndex = i+1;
            }
            try{
            if (s1[i+1]<s1[i] && i!=0 && (i+1)!=(s1.length-1)&& maxIndex>minIndex){
                System.out.println("buying on day "+ minIndex +" and selling on day "+maxIndex+" would give a profit of: "+max+" - "+min+" = "+(max-min));
                min = s1[0];
                max = s1[0];
                minIndex = 0;
                maxIndex = 0;}}
            catch(ArrayIndexOutOfBoundsException e){
                if (i!=0 && (i+1)!=(s1.length-1)&& maxIndex>minIndex)
                    System.out.println("buying on day "+ minIndex +" and selling on day "+maxIndex+" would give a profit of: "+max+" - "+min+" = "+(max-min));
                }
        }
    }
}
