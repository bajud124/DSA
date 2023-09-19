package InterviewBit.Array;
import java.util.ArrayList;


public class PickFromBothSide {
    public int solve(ArrayList<Integer> A, int B) {
        ArrayList<Integer> prefix = new ArrayList<Integer>(B);
        ArrayList<Integer> sufix = new ArrayList<Integer>(B);
        int psum =0;
        int ssum= 0;
        int end = A.size();
        for (int i=0;i<B;i++) {
            psum += A.get(i);
            ssum += A.get(end-i-1);
            prefix.add(psum);
            sufix.add(ssum);
        }
        int max = prefix.get(B-1);
        for (int i=0;i<B-1;i++) {
            if (max < prefix.get(i) + sufix.get(B-i-2)) {
                max = prefix.get(i) + sufix.get(B-i-2);
            }
        }
        // System.out.println(max);
        if (max < prefix.get(B-1)) {
            max = prefix.get(B-1);
        }
        if (max < sufix.get(B-1)) {
            max = sufix.get(B-1);
        }
        return max;
    }
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<Integer>();
        int[] temp = { -969, -948, 350, 150, -59, 724, 966, 430, 107, -809, -993, 337, 457, -713, 753, -617, -55, -91, -791, 758, -779, -412, -578, -54, 506, 30, -587, 168, -100, -409, -238, 655, 410, -641, 624, -463, 548, -517, 595, -959, 602, -650, -709, -164, 374, 20, -404, -979, 348, 199, 668, -516, -719, -266, -947, 999, -582, 938, -100, 788, -873, -533, 728, -107, -352, -517, 807, -579, -690, -383, -187, 514, -691, 616, -65, 451, -400, 249, -481, 556, -202, -697, -776, 8, 844, -391, -11, -298, 195, -515, 93, -657, -477, 587 };
        for (int i =0, len = temp.length; i < len; i++) {
            A.add(temp[i]);
        }
        int B = 81;
        // System.out.println(temp.length);
        ArrayList<Integer> prefix = new ArrayList<Integer>(B);
        ArrayList<Integer> sufix = new ArrayList<Integer>(B);
        int psum =0;
        int ssum= 0;
        int end = A.size();
        for (int i=0;i<B;i++) {
            psum += A.get(i);
            ssum += A.get(end-i-1);
            prefix.add(psum);
            sufix.add(ssum);
        }
        int max = prefix.get(B-1);
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i=0;i<B-1;i++) {
            result.add(prefix.get(i) + sufix.get(B-i-2));
            if (max < prefix.get(i) + sufix.get(B-i-2)) {
                max = prefix.get(i) + sufix.get(B-i-2);
            }
        }
        // System.out.println(max);
        if (max < prefix.get(B-1)) {
            max = prefix.get(B-1);
        }
        if (max < sufix.get(B-1)) {
            max = sufix.get(B-1);
        }
        // System.out.println(result);
        // System.out.println(end);
        // System.out.println(prefix);
        // System.out.println(sufix);
        System.out.println(max);
        PickFromBothSide p = new PickFromBothSide();
        int final1 = p.solve(A, B);
        System.out.println(final1);
    }
}
