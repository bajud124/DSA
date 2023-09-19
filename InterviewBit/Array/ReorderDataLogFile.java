package InterviewBit.Array;

import java.util.ArrayList;
import java.util.Collections;

public class ReorderDataLogFile {
    public ArrayList<String> reorderLogs(ArrayList<String> A) {
        Collections.sort(A, this::comparator);
        return A;
    }

    int comparator(String a, String b) {
        if (isDigitLog(a) && isDigitLog(b))
            return 0;
        if (isDigitLog(a))
            return 1;
        if (isDigitLog(b))
            return -1;

        return letterLogComparator(a.split("-", 2), b.split("-", 2));
    }

    boolean isDigitLog(String a) {
        return a.split("-")[1].matches("[0-9]");
    }

    int letterLogComparator(String[] a, String[] b) {
        int comp = a[1].compareTo(b[1]);

        return comp == 0 ? a[0].compareTo(b[0]) : comp;
    }
}
