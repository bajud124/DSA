package InterviewBit.Array;

import java.util.ArrayList;

public class SetMatrixZeros {
    public void setZeroes(ArrayList<ArrayList<Integer>> a) {
        if (a == null){
            return;
        }
        int m = a.size();
        int n = a.get(0).size();
        if (n == 0){
            return;
        }
        for(int i=0;i<m;i++){
            boolean zero = false;
            for(int j =0;j<n;j++){ 
                if (a.get(i).get(j) == 0){
                    zero = true;
                    break;
                }
            }
            if (zero){}
            replaceRow(a,m,n,i,2);
        }
        for(int i=0;i<n;i++){
            boolean zero = false;
            for(int j =0;j<m;j++){
                if (a.get(j).get(i) == 0){
                    zero = true;
                    break;
                }
            }
            replaceCol(a,m,n,i,2);
        }
        for (int i=0;i<m;i++){
            for(int j =0;j<n;j++){
                if (a.get(i).get(j) == 2){
                    a.get(i).set(j,0);
                }
            }
        }
	}

    public void replaceRow(ArrayList<ArrayList<Integer>> a, int m, int n, int index, int value){
        for (int i=0;i<n;i++){
            if (a.get(index).get(i) == 1){
                a.get(index).set(i, value);
            }
        }
    }
    public void replaceCol(ArrayList<ArrayList<Integer>> a, int m, int n, int index, int value){
        for (int i=0;i<m;i++){
            if (a.get(i).get(index) == 1){
                a.get(i).set(index, value);
            }
        }
    }
}
