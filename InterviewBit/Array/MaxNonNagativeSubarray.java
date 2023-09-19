package InterviewBit.Array;
import java.util.LinkedList;

public class MaxNonNagativeSubarray {
    public static void main(String[] args) {
        int[] arr = { -2, 3, 3, 1, 1,-2, 1, 5, 2 };
        LinkedList<Integer> result = new LinkedList<Integer>();
        LinkedList<Integer> resultTmp = new LinkedList<Integer>();
        int sum = 0;
        int sumtmp = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                resultTmp.add(arr[i]);
                sumtmp += arr[i];
            } else if (resultTmp.size() > 0) {
                if (sumtmp > sum || (sumtmp == sum && resultTmp.size() > result.size())) {
                    result = resultTmp;
                    sum = sumtmp;
                }
                resultTmp = new LinkedList<Integer>();
                sumtmp = 0;
            }
        }

        if (sumtmp > sum || (sumtmp == sum && resultTmp.size() > result.size())) {
            System.out.println( "resultTmp: " + resultTmp);
        }
        System.out.println( "result: " + result);
    }
}
