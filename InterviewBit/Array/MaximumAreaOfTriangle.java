package InterviewBit.Array;

import java.util.ArrayList;

public class MaximumAreaOfTriangle {
    public int solve(ArrayList<String> A) {
        int R = A.size();
        int C = A.get(0).length();
        int topR[] = new int[C];
        int topG[] = new int[C];
        int topB[] = new int[C];
        int bottomR[] = new int[C];
        int bottomG[] = new int[C];
        int bottomB[] = new int[C];
        int rightR = -1;
        int rightG = -1;
        int rightB = -1;
        int leftR = C + 1;
        int leftG = C + 1;
        int leftB = C + 1;
        for (int i = 0; i < C; i++) {
            topR[i] = -1;
            topG[i] = -1;
            topB[i] = -1;
            bottomR[i] = -1;
            bottomG[i] = -1;
            bottomB[i] = -1;
        }
        for (int i = 0; i < R; i++) {
            String S = A.get(i);
            for (int j = 0; j < S.length(); j++) {
                char c = S.charAt(j);
                if (c == 'r') {
                    if (topR[j] == -1)
                        topR[j] = i;
                    bottomR[j] = i;
                    if (rightR < j)
                        rightR = j;
                    if (leftR > j)
                        leftR = j;
                }
                if (c == 'g') {
                    if (topG[j] == -1)
                        topG[j] = i;
                    bottomG[j] = i;
                    if (rightG < j)
                        rightG = j;
                    if (leftG > j)
                        leftG = j;
                }
                if (c == 'b') {
                    if (topB[j] == -1)
                        topB[j] = i;
                    bottomB[j] = i;
                    if (rightB < j)
                        rightB = j;
                    if (leftB > j)
                        leftB = j;
                }
            }
        }

        int x, y, z, z1, z2;
        double area;
        double ans = -2147483648;
        for (int j = 0; j < C; j++) {
            // R,G
            x = topR[j];
            y = bottomG[j];
            z1 = (rightB - j + 1);
            z2 = (j - leftB + 1);
            z = Math.max(z1, z2);
            if (x != -1 && y != -1 && z != -1) {
                area = Math.ceil(z * (y - x + 1) * 1.0 / 2);
                // System.out.println(x + " "+y + " "+z+" "+(z-j+1) + " " +(y-x+1)+ " "+ area +
                // " ");
                if (area > ans)
                    ans = area;
            }
            // R,B
            x = topR[j];
            y = bottomB[j];
            z1 = (rightG - j + 1);
            z2 = (j - leftG + 1);
            z = Math.max(z1, z2);
            if (x != -1 && y != -1 && z != -1) {
                area = Math.ceil(z * (y - x + 1) * 1.0 / 2);
                // System.out.println(x + " "+y + " "+z+" "+(z-j+1) + " " +(y-x+1)+ " "+ area +
                // " ");
                if (area > ans)
                    ans = area;
            }
            // G,R
            x = topG[j];
            y = bottomR[j];
            z1 = (rightB - j + 1);
            z2 = (j - leftB + 1);
            z = Math.max(z1, z2);
            if (x != -1 && y != -1 && z != -1) {
                area = Math.ceil(z * (y - x + 1) * 1.0 / 2);
                // System.out.println(x + " "+y + " "+z+" "+(z-j+1) + " " +(y-x+1)+ " "+ area +
                // " ");
                if (area > ans)
                    ans = area;
            }
            // G,B
            x = topG[j];
            y = bottomB[j];
            z1 = (rightR - j + 1);
            z2 = (j - leftR + 1);
            z = Math.max(z1, z2);
            if (x != -1 && y != -1 && z != -1) {
                area = Math.ceil(z * (y - x + 1) * 1.0 / 2);
                // System.out.println(x + " "+y + " "+z+" "+(z-j+1) + " " +(y-x+1)+ " "+ area +
                // " ");
                if (area > ans)
                    ans = area;
            }
            // B,R
            x = topB[j];
            y = bottomR[j];
            z1 = (rightG - j + 1);
            z2 = (j - leftG + 1);
            z = Math.max(z1, z2);
            if (x != -1 && y != -1 && z != -1) {
                area = Math.ceil(z * (y - x + 1) * 1.0 / 2);
                // System.out.println(x + " "+y + " "+z+" "+(z-j+1) + " " +(y-x+1)+ " "+ area +
                // " ");
                if (area > ans)
                    ans = area;
            }
            // B,G
            x = topB[j];
            y = bottomG[j];
            z1 = (rightR - j + 1);
            z2 = (j - leftR + 1);
            z = Math.max(z1, z2);
            if (x != -1 && y != -1 && z != -1) {
                area = Math.ceil(z * (y - x + 1) * 1.0 / 2);
                // System.out.println(x + " "+y + " "+z+" "+(z-j+1) + " " +(y-x+1)+ " "+ area +
                // " ");
                if (area > ans)
                    ans = area;
            }
        }
        return Math.max((int) ans, 0);
    }
}
