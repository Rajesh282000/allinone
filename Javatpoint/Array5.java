package Javatpoint;

public class Array5 {
    static void LargestElement(int arr[]){
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max)
                max=arr[i];
        }
        System.out.println(max);

    }
    static void SmallestElement(int arr[]){
        int min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min)
                min=arr[i];
        }
        System.out.println(min);


    }
    public static void main(String[] args) {
        int[]arr=new int[]{25,11,7,75,56};
        SmallestElement(arr);
        LargestElement(arr);
    }
}
