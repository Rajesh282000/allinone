package Javatpoint;

public class Array1 {
    public static void main(String[] args) {
        int arr1[]=new int[]{1,2,3,4,5};
        int arr2[] =new int [5];
        //System.out.println(arr1);
        for (int i = 0; i < arr1.length; i++) {
            arr2[i]=arr1[i];
        }
        System.out.println("Print arr1 element:-");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+"\t");

        }
        System.out.println();
        System.out.println("Print arr2 element:-");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+"\t");
        }
    }
    //int arr[]={1,2,3,4};
}
