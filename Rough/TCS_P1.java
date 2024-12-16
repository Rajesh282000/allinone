package Rough;


import java.util.*;


public class TCS_P1 {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int size = r.nextInt();

        int nums[] = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = r.nextInt();
        }
        if(findSP(nums) == -1){
            System.out.println("none");
        }else
            System.out.println(findSP(nums));

    }
    static int findSP(int[] nums){
        Arrays.sort(nums);
        ArrayList<Integer> list = new ArrayList<>();
        int q =nums[0];
        for(int i = 1; i< nums.length; i++){
            list.add(nums[i]);

        }

        for(int i=nums[nums.length-1] ; i <= 1000;i++){
            if(isPrime(i)){
                int count =0;
//                ArrayList<Integer> rem = new ArrayList<>();
//                int k =0;
                for(int j : list){
                    if(i%j!=q)
                        break;
                    else
                        count++;
                }
                if(count == list.size())return i;
            }
        }

        return -1;
    }

    static boolean isPrime(int n){

        if(n<2)
            return false;

        for (int i=2; i<=Math.sqrt(n);i++){
            if(n%i==0)
                return false;

        }
        return true;
    }


}
