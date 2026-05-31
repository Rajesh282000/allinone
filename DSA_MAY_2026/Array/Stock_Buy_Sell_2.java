package DSA_MAY_2026.Array;

public class Stock_Buy_Sell_2 {
    public static void main(String[] args) {
        int[] prices = {1,2,3,4,5};

        int totalSum =0;
        boolean touchedTheLengthOfPrice = false;
         int count=0;

        for (int i = 0; i < prices.length-1; i++) {
            int sum=0;
            for (int j = i+1; j <= prices.length-1; j++) {
                count =j;
                if (prices[i] < prices[j]){
                    int diffOfMax= prices[j]-prices[i];
                    if (diffOfMax > sum) {
                        sum =  diffOfMax;
                    }else {
                        break;
                    }


                }else{

                    break;
                }

                if(j == prices.length-1)
                    touchedTheLengthOfPrice = true;

            }
             i=count-1;
            totalSum+=sum;
            if(touchedTheLengthOfPrice)
                break;
        }
        System.out.println(totalSum);
    }
}
