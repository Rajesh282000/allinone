package Javatpoint;

public class ArrayOddEven {
    public static void main(String[] args) {
        int arr1[]=new int[]{1, 2, 3, 4, 5};

        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i]%2==0)
                System.out.println("Even no:-"+arr1[i]);
            else
                System.out.println("Odd no :-"+arr1[i]);

        }

    }
}
