package InterviewBit.BinarySearch;

public class ImplementPowerFunction {
    public int pow(int x, int n, int d) {
        int ans = 1;
        for (int i =0;i<n;i++){
            ans = (ans*x)%d;
        }
        return ans < 0 ? ((ans%d)+d)%d : ans%d;
	}
}
