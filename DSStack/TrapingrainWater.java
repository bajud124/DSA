package DSStack;

import java.util.ArrayList;
import java.util.Collections;

class StackPair{
    public int index;
    public int value;

    StackPair(int index, int value){
        this.index = index;
        this.value = value;
    }
}
public class TrapingrainWater {
    public int trap(int[] height) {
        int result = 0;
        ArrayList<Integer> intList = new ArrayList<Integer>(height.length);
        for (int i : height) {
            intList.add(i);
        }
        ArrayList<Integer> right = GraterInRightArray(intList);
        ArrayList<Integer> left = GraterInLeftArray(intList);
        for (int i = 0; i < height.length; i++) {
            int water = Math.min(right.get(i), left.get(i));
            if (water!= -1) {
                result += water - height[i];
            }
        }
        return result;
    }


    public ArrayList<Integer> GraterInLeftArray(ArrayList<Integer> A) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        result.add(A.get(0));
        for (int i = 1; i<A.size(); i++) {
            if (A.get(i) > result.get(i-1)) {
                result.add(A.get(i));
            } else {
                result.add(result.get(i-1));
            }
        }
        return result;
    }
    public ArrayList<Integer> GraterInRightArray(ArrayList<Integer> A) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        result.add(A.get(A.size()-1));
        for (int i = 1; i<A.size(); i++) {
            if (A.get(A.size()-1-i) > result.get(i-1)) {
                result.add(A.get(A.size()-1-i));
            } else {
                result.add(result.get(i-1));
            }
        }
        Collections.reverse(result);
        return result;
    }

}
