package InterviewBit.Math;

public class GridUniquePath {
    public int uniquePaths(int A, int B) {
        int result =1;
        for (int i =B;i<=A;i--){
            result = result*i;
        }
        return result;
    }
}
