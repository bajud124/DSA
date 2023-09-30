package DSA450;

import java.util.ArrayList;

public class Matrix0_ReadMatrixSpiral {
    public ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        ArrayList<Integer> res = new ArrayList<Integer>();
        int total = r*c;
        int count = 0;
        int rs = 0;
        int cs = 0;
        int rl = r-1;
        int cl = c-1;
        while (count < total) {
            // first row 
            for (int i =cs;  count<total &&i<=cl;i++) {
                res.add(matrix[rs][i]);
                count++;
            }
            rs++;
            
            // last column 
            for (int i = rs;  count<total &&i<= rl;i++ ) {
                res.add(matrix[i][cl]);
                count++;
            }
            cl--;
            
            // lasr row 
            for(int i = cl;  count<total &&i>=cs; i--) {
                res.add(matrix[rl][i]);
                count++;
            }
            rl--;
            
            // first column 
            for (int i = rl;  count<total &&i>= rs; i--) {
                res.add(matrix[i][cs]);
                count++;
            }
            cs++;
        }
        return res;
    }
}
