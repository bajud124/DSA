package InterviewBit.Array;

import java.util.ArrayList;

public class Partition {
    public int solve(int A, ArrayList<Integer> B) {
        int sum =0;
        int count = 0;
        int result =0;
        int cummulativeSum =0;
        
        for(Integer i: B){
            sum += i;
        }
        
        if(sum%3 !=0){
            return 0;
        }
        
        for(int i=0;i<A;i++){
            cummulativeSum += B.get(i);
            
            if(cummulativeSum == ((2*sum)/3) && i >= 1 && i<= A-2){
                result += count;
            }
            
            if(cummulativeSum == sum/3){
                count +=1;
                // continue;
            }
            
        }
        return result;
    }
}
