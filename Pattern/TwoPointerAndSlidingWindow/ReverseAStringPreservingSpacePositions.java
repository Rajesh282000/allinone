package Pattern.TwoPointerAndSlidingWindow;

public class ReverseAStringPreservingSpacePositions {
    public static String reverseWords(String s) {
        char[] input = s.toCharArray();
        int start = 0;
        int end = s.length()-1;

        while(start < end){
            if (input[start] == ' '){
                start++;
                continue;
            }
            if (input[end] == ' '){
                end--;
                continue;
            }
            char temp = input[start];
            input[start] = input[end];
            input[end] = temp;
            start++;
            end--;
        }

        return new String(input);
    }
    public static void main(String[] args) {
//        Input: "internship at geeks for geeks"
//        Output: skeegrofsk ee gtapi hsn retni
        String s = "internship at geeks for geeks"; // Input string
        String reversed = reverseWords(s); // Call the method to reverse the string
        System.out.println(reversed);

    }
}
