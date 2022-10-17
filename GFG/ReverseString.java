// https://practice.geeksforgeeks.org/problems/reverse-a-string/1

public class ReverseString {
    // Complete the function
    // str: input string
    public static String reverseWord(String str) {
        int length = str.length();
        // Make string builder to change charcter at specific index
        StringBuilder result = new StringBuilder(str);
        for (int i = 0; i < length / 2; i++) {
            // Swap charcter
            result.setCharAt(i, str.charAt(length - i - 1));
            result.setCharAt(length - i - 1, str.charAt(i));
        }
        return result.toString();
    }
}