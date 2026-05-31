package Stack;

import java.util.Stack;

public class NextGreaterElement {

    public static void nextGreaterElement(int[] arr){
        Stack<Integer> s = new Stack<>();
        int[] res = new int[arr.length];
        int j=0;
        for (int i = arr.length-1; i >=0; i--){
           while (!s.empty() && s.peek() <= arr[i]){
               s.pop();
           }
           res[j++]=s.empty() ? -1 : s.peek();
           s.push(arr[i]);

        }

        for(int i = arr.length-1; i >= 0; i--){
            System.out.print(res[i]+" ");
        }
    }

    public static void nextSmallerElement(int[] arr){
        Stack<Integer> s = new Stack<>();
        int[] res = new int[arr.length];
        int j=0;
        for (int i = 0; i <= arr.length-1; i++){
            while (!s.empty() && s.peek() >= arr[i]){
                s.pop();
            }
            res[j++]=s.empty() ? -1 : s.peek();
            s.push(arr[i]);

        }

        for(int i = 0; i <= arr.length-1; i++){
            System.out.print(res[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {4, 12, 5, 3, 1, 2, 5, 3, 1, 2, 4, 6};
        nextGreaterElement(arr);
        System.out.printf("\n");
        int[] arr2 = {5, 7, 9, 6, 7, 4, 5, 1, 3, 7};
        nextSmallerElement(arr2);
    }

}
