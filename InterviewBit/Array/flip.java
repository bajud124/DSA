package InterviewBit.Array;

import java.util.ArrayList;

public class flip {
    public ArrayList<Integer> flips(String A) {
        ArrayList<Integer> temp = new ArrayList<Integer>(A.length());
        // build array of 1s and -1s 
        for (int i = 0; i < A.length(); i++) {
            temp.add(A.charAt(i) == '0' ? 1 : -1);
        }
        int cur_sum = 0;
        int max_sum = Integer.MIN_VALUE;
        int start = 0;
        int l =0,r=0;
        // get largest sum and get left and right index of largest sum
        for (int i =0;i <A.length();i++){
            cur_sum += temp.get(i);
            if (cur_sum > max_sum){
                max_sum = cur_sum;
                r = i;
                start = l;
            }
            if (cur_sum < 0) {
                cur_sum = 0;
                l = i+1;
            }
        }
        ArrayList<Integer> res = new ArrayList<Integer>(2);
        if (max_sum <0)
            return res;
        res.add(start+1);
        res.add(r+1);
        return res;
    }
}
