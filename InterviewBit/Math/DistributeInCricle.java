package InterviewBit.Math;

public class DistributeInCricle {
    public int solve(int A, int B, int C) {
        int a = (A + C - 1) % B;
        if (a == 0) {
            return B;
        } else {
            return a;
        }
    }
}
