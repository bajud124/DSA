package Java;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _Graph {

  private LinkedList<Integer> adj[];

  public _Graph(int v) {
    adj = new LinkedList[v];
    for (int i = 0; i < v; i++) {
      adj[i] = new LinkedList<Integer>();
    }
  }

  // add edges for undirected graph
  public void addEdgeUnDirected(int source, int destination) {
    adj[source].add(destination);
    adj[destination].add(source);
  }

  // add edges for directed graph
  public void addEdgeDirected(int source, int destination) {
    adj[source].add(destination);
  }

  public int bfs(int source, int destionation) {
    boolean visited[] = new boolean[adj.length];
    Queue<Integer> queue = new LinkedList<Integer>();
    int parent[] = new int[adj.length];
    queue.add(source);
    parent[source] = -1;
    visited[source] = true;
    while (!queue.isEmpty()) {
      int current = queue.poll();
      if (current == destionation) {
        break;
      }
      for (int i = 0; i < adj[current].size(); i++) {
        int next = adj[current].get(i);
        if (!visited[next]) {
          queue.add(next);
          parent[next] = current;
          visited[next] = true;
        }
      }
    }
    int current = destionation;
    int distance = 0;
    while (current != -1) {
      System.out.print(current + " ");
      current = parent[current];
      distance++;
    }
    return distance;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Vertices and edges");
    int v = sc.nextInt();
    int e = sc.nextInt();
    _Graph g = new _Graph(v);
    System.out.println("Enter " + e + " edges");
    for (int i = 0; i < e; i++) {
      int source = sc.nextInt();
      int destination = sc.nextInt();
      g.addEdgeUnDirected(source, destination);
    }
  }
}
