package Javatpoint;

public class Array3 {

    public static void main(String[] args) {
        int arr1[]=new int[]{1, 2, 3, 4, 2, 7, 8, 8, 3};
        System.out.println("Duplicate array:-");
         for(int i=0;i<arr1.length;i++){
             for (int j = i+1; j < arr1.length ; j++) {
                 if(arr1[i]==arr1[j])
                     System.out.println(arr1[i]+"");
             }
         }
    }
}
