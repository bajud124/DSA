package LeetCode;

import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Integer, Character> map = new HashMap<Integer, Character>();
        int start = 0;int max = 0;
        for (int i = 0;i<s.length();i++){
            if (map.containsValue(s.charAt(i))){
                if ((i-start) > max){
                    max = (i-start);
                }
                while (map.containsValue(s.charAt(i))){
                    map.remove(start++);
                }
            }
            map.put(i, s.charAt(i));
        }
        if ((s.length() - start) > max)
        {
            max = (s.length()-start);
        }
        return max;
    }
}
