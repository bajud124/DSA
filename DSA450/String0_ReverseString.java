package DSA450;

public class String0_ReverseString {
    public void reverseString(char[] s) {
        int len = s.length;
        for(int i=0; i<len/2;i++) {
            swap(s, i, (len-i-1));
        }
    }

    // swap characters
    public void swap(char[] s, int source, int destination) {
        char temp = s[source];
        s[source] = s[destination];
        s[destination] = temp;
    }
}
