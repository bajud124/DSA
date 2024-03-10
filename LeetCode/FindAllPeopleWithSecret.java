package LeetCode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class FindAllPeopleWithSecret {
    public List<Integer> findAllPeople(int n, int[][] meetings, int firstPerson) {
        // create visited array of boolean
        boolean[] vis = new boolean[n];
        // add visited value of 0 and firstPerson, as 0 share secret with firstPerson at 0 time
        vis[0] = true;
        vis[firstPerson] = true;
        // sort array by meeting time so we can check all person with same time of meeting, 
        // because if same person are in multiple meeting then also that person can share secret this 
        // is not a regular life scenario
        Arrays.sort(meetings, Comparator.comparingInt(a -> a[2]));

        int m = meetings.length;
        // traverse in all meeting
        for (int i = 0; i < m;) {
            int j = i;
            // increment j value until all meeting are same time
            for (; j + 1 < m && meetings[j + 1][2] == meetings[i][2]; ++j)
                ;
            
            // create map for a graph
            Map<Integer, List<Integer>> g = new HashMap<>();
            // create set for viisted all person who are in meeting at given time
            Set<Integer> s = new HashSet<>();
            // add all person in map and set with 
            for (int k = i; k <= j; ++k) {
                int x = meetings[k][0], y = meetings[k][1];
                g.computeIfAbsent(x, key -> new ArrayList<>()).add(y);
                g.computeIfAbsent(y, key -> new ArrayList<>()).add(x);
                s.add(x);
                s.add(y);
            }
            Queue<Integer> q = new LinkedList<Integer>();
            // add all person who know secret
            for (int u : s) {
                if (vis[u]) {
                    q.offer(u);
                }
            }

            // add all person to queue whose meeting with person who know secret
            while (!q.isEmpty()) {
                int u = q.poll();
                for (int v : g.getOrDefault(u, Collections.emptyList())) {
                    if (!vis[v]) {
                        vis[v] = true;
                        q.offer(v);
                    }
                }
            }
            i = j + 1;
        }

        // add all person to result who know secret
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            if (vis[i]) {
                ans.add(i);
            }
        }
        return ans;
    }
}
