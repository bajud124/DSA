package LeetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class GreatestCommonDvisorTraversal {
    public boolean canTraverseAllPairs2(int[] nums) {
        int n = nums.length;
        if (n == 1)
            return true;
        Map<Integer, List<Integer>> primeKeyGraph = new HashMap<>();
        Map<Integer, List<Integer>> numsKeyGraph = new HashMap<>();
        for(int i = 0; i < n; i++) {
            int num = nums[i];
            int temp = nums[i];
            for(int j=2;j*j<=nums[i];j++) {
                if(temp%j == 0) {
                    primeKeyGraph.computeIfAbsent(j, key -> new ArrayList<>()).add(num);
                    numsKeyGraph.computeIfAbsent(num, key -> new ArrayList<>()).add(j);
                }
                while(temp%j==0) {
                    temp/=j;
                }
            }
            if (temp > 1) {
                primeKeyGraph.computeIfAbsent(temp, key -> new ArrayList<>()).add(num);
                numsKeyGraph.computeIfAbsent(num, key -> new ArrayList<>()).add(temp);
            }
        }

        if (numsKeyGraph.size() ==0 )
            return false;
        HashSet<Integer> numsVisited = new HashSet<>();
        HashSet<Integer> primeVisited = new HashSet<>();
        Queue<Integer> q = new LinkedList<>();
        int first = nums[0];
        q.add(first);
       // numsVisited.add(first);
        while(!q.isEmpty()) {
            int qValue = q.poll();
            if(numsVisited.contains(qValue)) {
                continue; // already visited
            }
            numsVisited.add(qValue);
            for(int primeNumber: numsKeyGraph.getOrDefault(qValue, Collections.emptyList())) {
                if(primeVisited.contains(primeNumber)) {
                    continue; // already visited
                }
                primeVisited.add(primeNumber);
                for(int number : primeKeyGraph.getOrDefault(primeNumber, Collections.emptyList())) {
                    q.offer(number);
                }
            }
        }
        for (int num:nums) {
            if(!numsVisited.contains(num)) {
                return false;
            }
        }
        return true;

    }

    // solve using O(n2) time complexity
    public boolean canTraverseAllPairs(int[] nums) {
        int len = nums.length;
        Set<Integer> s = new HashSet<>();
        Map<Integer, List<Integer>> g = new HashMap<>();
        for(int i =0;i<len;i++) {
            int a = nums[i];
            for(int j=i+1;j<len;j++) {
                int b = nums[j];
                if(gcd(a, b)>1){
                    g.computeIfAbsent(a, key -> new ArrayList<>()).add(b);
                    g.computeIfAbsent(b, key -> new ArrayList<>()).add(a);
                }
            }
        }
        Queue<Integer> q = new LinkedList<Integer>();
        int firstValue = nums[0];
        for(int num: g.getOrDefault(firstValue, Collections.emptyList())) {
            q.offer(num);
        }
        s.add(firstValue);
        while(!q.isEmpty()) {
            int v = q.poll();
            s.add(v);
            for(int num: g.getOrDefault(v, Collections.emptyList())) {
                if(!s.contains(num))
                    q.offer(num);  
            }   
        }
        for(int num:nums) {
            if(!s.contains(num))
                return false;
        }
        return true;
    }

    public int gcd(int a, int b)
    {
        if(b==0)
            return a;
        return gcd(b, a%b);
    }
}
