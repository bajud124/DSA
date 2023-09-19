package LeetCode;

public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        StringBuffer sbr = new StringBuffer(s);
        String reverse = sbr.reverse().toString();
        int start = 0,end = 0, max = 0;
        int tempStart =0,tempEnd = 0;
        for (int i =0; i< s.length(); i++){
            if (s.charAt(i)!=reverse.charAt(i)){
                int tempMax = end-start;
                if (tempMax> max){
                    start = tempStart;
                    end = tempEnd;
                }
                tempStart = i;
                tempEnd = i;
            }
        }
        return s.substring(start,end);
    }
}
