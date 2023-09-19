package InterviewBit.Array;

import java.util.ArrayList;
import java.util.Collections;

public class HotelBooking {
    public boolean hotel(ArrayList<Integer> arrive, ArrayList<Integer> depart, int K) {
        Collections.sort(arrive);
        Collections.sort(depart);
        int count = 0,i=0,j=0;
        // After sorintg check if there is any overlap between arrive and depart
        while (i<arrive.size()){
            if (count>K) return false;
            if (arrive.get(i)<depart.get(j)){
                count++;
                i++;
            } else if (arrive.get(i)>depart.get(j)){
                count--;
                j++;
            } else {
                i++;
                j++;
            }
        }
        if (count>K) return false;
        return true;
    }
}