package LeetCode;

public class LeetCode169 {
    public static int majorityElement(int[] arr) {
        int count =1;
        int majority =arr[0];

        for(int i = 1; i< arr.length; i++){

            if(majority ==arr[i]){
               count++;

            }else{
                count--;
                if(count ==0){
                    majority = arr[i];
                    count =1;
                }

            }
        }
        return majority;
    }


    public static void main(String[] args) {
        int[] arr = {3,3,4};
        System.out.println(majorityElement(arr));
    }
}
