package Pattern.TwoPointer;

public class ReverseAStringPreservingSpacePositions {
    public static String reverseWords(String s) {
//        String[] words = s.split(" "); // Split the string into words
        StringBuilder reversed = new StringBuilder(); // Create a StringBuilder to build the reversed string
        int count =0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            char checkOriginalCharacter = s.charAt(count++);
            if(c == ' ' && checkOriginalCharacter == ' ' ) {
                reversed.append(c);
                continue;
            }

            if( c == ' '){
                continue;
            }

            if (checkOriginalCharacter != ' ') {
                reversed.append(c); // Append non-space characters to the reversed string
            }
            if (checkOriginalCharacter == ' ' ) {
                reversed.append(' ');
                reversed.append(c); // Append spaces to the reversed string
            }
        }
        return reversed.toString();
    }
    public static void main(String[] args) {
        String s = "the sky is blue"; // Input string
        String reversed = reverseWords(s); // Call the method to reverse the string
        System.out.println(reversed);

    }
}
