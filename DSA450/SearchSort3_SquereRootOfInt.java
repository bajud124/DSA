package DSA450;

public class SearchSort3_SquereRootOfInt {
    int countSquares(int N) {
        int sq = 0;
        int index = 0;
        while(sq<N){
            sq = (++index)*(index);
        }
        return index-1;
    }
}
