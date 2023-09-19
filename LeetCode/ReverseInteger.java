package LeetCode;

public class ReverseInteger {
    public int reverse(int x) {
        int temp = x;
        int res = 0;
        if (x<0){
            temp = x*(-1);
        }
        while(temp>0){
            res = res*10;
            res = res + (temp%10);
            temp = temp/10;
        }
        if (x < 0){
            return res*(-1);
        }
         return res;
    }
}
