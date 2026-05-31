package DSA_MAY_2026.Array;

public class MoveZeros {
    //input = {1, 0, 13, 0, 5, 9, 0, 152, 45 };
    //output = { 1, 13, 5, 9, 152, 45, 0, 0, 0};

    static int[] input = {1, 0, 13, 0, 5, 0, 0, 152, 45, -1};

    static  int length = input.length;

    static int[] arr2 = new int[length];



    static int l=0;

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] =temp;
    }

    public static void main(String[] args) {

        int i =0,  j = 1;
        while(j < length){
            if(input[i] ==0 && input[j] == 0) {

                j++;
                continue;
            } else if(input[i] ==0 && input[j] != 0 ) {
                swap(input, i, j);
            }
            i++;
            j++;


        }


        for (int k : input){
            System.out.print(k + " ");
        }

//        for (int i : input) {
//            if (i != 0)
//                arr2[l++] = i;
//
//
//        }
//        int res[] = new int[length];
//
//        int count = 0;
//
//        for (int p : arr2) {
//            res[count++] = p;
//        }
//
//        for (int i : res){
//            System.out.print(i+ " ");
//        }


    }
}

