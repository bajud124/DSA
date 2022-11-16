package HackerRank;

import java.util.List;

public class AppleAndOrange {
    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        int apple_cnt = 0;
        int orange_cnt = 0;
        for (int apple : apples) {
            // if apple fall on home then increase apple count
            if ((s - a) <= apple && apple <= (t - a)) {
                apple_cnt++;
            }
        }
        System.out.println(apple_cnt);
        for (int orange : oranges) {
            // if apple fall on home then increase orange count
            if ((t - b) >= orange && (s - b) <= orange) {
                orange_cnt++;
            }
        }
        System.out.println(orange_cnt);
    }
}