// https://practice.geeksforgeeks.org/problems/palindrome-string0817/1
package DSA450;

public class String1_IsPalindrome {
    int isPalindrome(String S) {
        int len = S.length();
        for (int i=0; i< len/2; i++) {
            if (S.charAt(i) != S.charAt(len-i-1)) 
                return 0;
        }
        return 1;
    }
}
