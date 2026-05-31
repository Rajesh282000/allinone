package DSA_MAY_2026.Array;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1,2, 3, 4,5};
        int length = arr.length;
        int[] res = new int[length];
        int k =5;

        for (int i = 0; i < length; i++) {
            int j = i+1, count =0;
            while(count < k){
                if(j == length )
                    j=0;
                count++;
                j++;
            }
            res[j-1] = arr[i];

        }


        for (int l : res){
            System.out.print(l + " ");
        }
    }
}
