package LeetCode;
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String s = "";
        int i = 0;
        for (int j=0;j<strs.length;j++){
            String first = "";
                if (i < strs[j].length()){
                    first = Character.toString(strs[0].charAt(i));
                } else {
                    return s;
                }
                if (i < strs[j].length()){
                    if (Character.toString(strs[j].charAt(i)) == first){
                        s += first;
                    } else {
                        return s;
                    }
                } else {
                    return s;
                }
            }
        return s;
    }
}
