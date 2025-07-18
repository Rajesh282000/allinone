package Rough;

public class SmallestSecondInArray {
    public static void main(String[] args) {
        int[] arr = {9, 6, 1, 4, 3, 9, 1};
        int min = arr[0];
        int secMin = arr[1];
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] < min) {
                secMin = min;
                min = arr[i];
            } else if (arr[i] < secMin && arr[i] != min) {
                secMin = arr[i];
            }

        }
        System.out.println("Second smallest number is: " + secMin);
    }
}
