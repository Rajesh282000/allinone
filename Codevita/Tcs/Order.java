package Codevita.Tcs;

public class Order {
    public static void main(String[] args) {
        int[] arr = {1,3,5,2,4,6};
        int f = 4;
        System.out.println(findTurn(arr, f-1));;
    }
    static int findTurn (int[] arr, int f){
        int count = 0;
        while (arr[f] != Integer.MIN_VALUE){
            int index = maxInd(arr);
            for (int j = 0; j<= index; j++) {
                if(j!=index) arr[j] +=1;
                else arr[j] = Integer.MIN_VALUE;
            }
            count++;
        }
        return count;

    }
    static int maxInd  (int[] arr) {
        int idx = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i< arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                idx = i;
            }

        }
        return idx;
    }
}
