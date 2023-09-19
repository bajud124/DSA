package InterviewBit.Array;

import java.util.ArrayList;

public class ArraySum {
    public ArrayList<Integer> addArrays(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        int carry = 0;
        int i = A.size() - 1;
        int j = B.size() - 1;
        // Add last postition value and get carry and forword it to prvious position 
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0)
                sum += A.get(i);
            if (j >= 0)
                sum += B.get(j);
            result.add(0,sum % 10);
            carry = sum / 10;
            i--;
            j--;
        }
        // After all operation complete and we have carry then add at first position 
        if (carry > 0) {
            result.add(0,carry);
        }
        return result;
    }
}
