// https://practice.geeksforgeeks.org/problems/find-minimum-and-maximum-element-in-an-array4428/1
package DSA450;

class Pair {
    long first, second;

    public Pair(long first, long second) {
        this.first = first;
        this.second = second;
    }
}

public class FindMaxMinFromArrray {
    public Pair getMinMax(long a[], long n) {
        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;
        for (long value : a) {
            if (value < min) {
                min = value;
            }
            if (value > max) {
                max = value;
            }
        }
        return new Pair(min, max);
    }
}
