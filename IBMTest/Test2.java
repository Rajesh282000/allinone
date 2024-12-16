package IBMTest;

public class Test2 {
    public static void main(String[] args){
        int arr[] = {1,3,6,2};

        twoAdd(arr,8);
    }
    static  void  twoAdd(int[] arr, int target){

        for (int i=0; i< arr.length;i++){
            for (int j=i+1;j< arr.length;j++){
                if(arr[i]+arr[j]== target)
                    System.out.println(arr[i] + "," + arr[j]);
            }
        }
    }
}
