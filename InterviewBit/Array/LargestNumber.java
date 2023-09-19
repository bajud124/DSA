package InterviewBit.Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LargestNumber {
    public String largestNumber(final List<Integer> A) {
        ArrayList<String> temp2 = new ArrayList<String>();
        for (int i = 0; i < A.size(); i++) {
            temp2.add(String.valueOf(A.get(i)));
        }
        Collections.sort(temp2, new MyComparator());
        String result = String.join("", temp2);
        return result.charAt(0) == '0' ? "0" : result;
        
    }
}
class MyComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        String a_b = a + b;
        String b_a = b + a;
        return b_a.compareTo(a_b);
    }
}