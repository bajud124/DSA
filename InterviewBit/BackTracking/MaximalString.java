package InterviewBit.BackTracking;

public class MaximalString {
    int max ;
    public String solve(String A, int B) {
        findMax(A, B);
        return String.valueOf(max);
    }

    public void findMax(String str, int B){
        if (B ==0){
            return;
        }
        for (int i=0; i<str.length()-1; i++){
            for (int j= i+1; j<str.length(); j++){
                if(str.charAt(i) < str.charAt(j)){
                    str=swap(str,i,j);
                    int temp = Integer.parseInt(String.valueOf(str));
                    max=Math.max(max,temp);
                    findMax(str, B-1);
                    str=swap(str,i,j);
                }
            }
        }
    }

    public String swap(String str, int i, int j) {
        char i_th = str.charAt(i);
        char j_th = str.charAt(j);
        String left = str.substring(0, i);
        String middle = str.substring(i+1, j);
        String right = str.substring(j+1);
        return left + j_th + middle + i_th + right;
    }
}
