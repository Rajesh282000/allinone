package Array.Practice1;

public class MaxMin {
    public static int max(int[] arr){
        int max =arr[0];
        for (int i=1; i< arr.length; i++ ){
            max = Math.max(max, arr[i]);
        }
        return max;
    }
    public static int min(int[] arr){
        int min =arr[0];
        for (int i=1; i< arr.length; i++ ){
            min = Math.min(min, arr[i]);
        }
        return min;
    }
    public static void main(String[] args) {
        int[] arr ={4,6,8,1,0};
     int max = max(arr);
     int min = min(arr);
        System.out.println(max);
        System.out.println(min);
    }
}
