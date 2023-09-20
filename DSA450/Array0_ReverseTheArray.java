// https://practice.geeksforgeeks.org/problems/reverse-a-string/1
package DSA450;

public class Array0_ReverseTheArray {
    public String reverseWord(String str) {
        char[] ch = str.toCharArray();
        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            this.swap(ch, i, length - i - 1);
        }
        return new String(ch);
    }

    public void swap(char[] ch, int sourceIndex, int destIndex) {
        char temp = ch[sourceIndex];
        ch[sourceIndex] = ch[destIndex];
        ch[destIndex] = temp;
    }
}
