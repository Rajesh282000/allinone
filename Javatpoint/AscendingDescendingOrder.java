package Javatpoint;

public class AscendingDescendingOrder {
    static void AscendingArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[i]>arr[j]){
                    int temp = arr[i];
                         arr[i] = arr[j];
                         arr[j] = temp;
                }
            }
        }
        System.out.println("Elemnts of array sorted in ascending order :-");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
    }


    static void DescendingArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[i]<arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Elemnts of array sorted in descending order :-");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
    }


    public static void main(String[] args) {
     int arr[]=new int[]{66, 21, 22, 14, 56, 76, 35};
        System.out.println("Array Elements :-");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
        AscendingArray(arr);
        System.out.println();
        DescendingArray(arr);
    }
}
