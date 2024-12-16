package com.BString;

public class Stringplay2 {
    public static void main(String[] args) {
        doubleChar("The");
        System.out.println(repeatSeparator("Word", "X", 3));  // Output: "WordXWordXWord"
        System.out.println(repeatSeparator("This", "And", 2));  // Output: "ThisAndThis"
        System.out.println(repeatSeparator("This", "And", 1));

    }
    static void doubleChar(String str) {
        StringBuilder result = new StringBuilder();

        for (char c : str.toCharArray()) {
            result.append(c).append(c);
        }

        System.out.println(result.toString());
    }
    static String repeatSeparator(String word, String sep, int count) {
        if (count == 0) {
            return "";  // Return an empty string if count is 0
        }

        StringBuilder result = new StringBuilder(word);

        for (int i = 1; i < count; i++) {
            result.append(sep).append(word);
        }
        

        return result.toString();
    }

}
