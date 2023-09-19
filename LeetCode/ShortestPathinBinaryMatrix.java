package LeetCode;
import java.util.LinkedList;
import java.util.Queue;
class Pair {
    int x;
    int y;
    Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
public class ShortestPathinBinaryMatrix {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;
        if (grid[n - 1][n - 1] == 1 || grid[0][0] == 1) {
            return -1;
        }
        boolean[][] visited = new boolean[n][n];
        Queue<Pair> queue = new LinkedList<Pair>();
        int ans = 0;
        int queueSize = 0;
        if (grid[0][0] == 0) {
            queue.add(new Pair(0, 0));
            visited[0][0] = true;
        }
        while (!queue.isEmpty()) {
            queueSize = queue.size();
            ans++;
            for (int i = 0; i < queueSize; i++) {
                Pair first = queue.poll();
                int p = first.x;
                int q = first.y;
                if (p == n - 1 && q == n - 1)
                    return ans;
                for (int j = p - 1; j <= p + 1; j++) {
                    for (int k = q - 1; k <= q + 1; k++) {
                        if (isValid(grid, j, k, n, visited)) {
                            queue.add(new Pair(j, k));
                            visited[j][k] = true;
                        }
                    }
                }
            }
        }
        return -1;
    }

    public boolean isValid(int[][] grid, int i, int j, int n, boolean[][] visited) {
        return (i > 0 && j > 0 && i < n && j < n && grid[i][j] == 0 && !visited[i][j]);
    }
}
