package Pattern.ArrayAndHashing;

public class HasDuplicate {
    public static boolean hasDuplicate(int[] nums) {
        int count =1;
        int duplicate= nums[0];

        for(int i =1 ; i< nums.length ; i++){
            if(nums[i]==duplicate){
                return true;
            }else{
                count--;
                if(count == 0){
                    duplicate =nums[i];
                    count =1;
                }
            }
        }
        return false;

    }

    public static void main(String[] args) {
        int nums[] = {1,2,3,1};
        System.out.println(hasDuplicate(nums));
    }
}
