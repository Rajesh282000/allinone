package DSA_MAY_2026.Array;

public class Stock_buy_sell {
    public static void main(String[] args) {
        int[] prices = {1,2,4,2,5,7,2,4,9,0,9};

        int sum =0;

//        for (int i = 0; i < prices.length-1; i++) {
//            for (int j = i+1; j <= prices.length-1; j++) {
//
//                if (prices[i] < prices[j]){
//                    int diffOfMax= prices[j]-prices[i];
//                    sum = Math.max(sum, diffOfMax);
//                }
//            }
//        }
        int i=0, j=1;
        while(j< prices.length){
            if(prices[i]>= prices[j]){
               i=j;
                j++;

                continue;
            }else{
                sum = Math.max(prices[j]- prices[i], sum);
                j++;
            }

        }

        System.out.println(sum);
    }
}
