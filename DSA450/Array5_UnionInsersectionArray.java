package DSA450;

import java.util.HashSet;
import java.util.Set;

public class Array5_UnionInsersectionArray {
    public static int doUnion(int a[], int n, int b[], int m) 
    {
        Set<Integer> set = new HashSet<Integer>();
        for (int value : a) {
            if (!set.contains(value)) {
                set.add(value);
            }
        }
        for (int value : b) {
            if (!set.contains(value)) {
                set.add(value);
            }
        }
        
        return set.size();
    }
}
