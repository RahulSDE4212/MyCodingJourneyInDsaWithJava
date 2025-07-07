package Week_28_Graph.ClassWork;

import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

public class _9_ShortestPathBFS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of Vertices: ");
        int V = sc.nextInt();

        ArrayList<Integer>[] graph = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        System.out.println("Enter the number of edges: ");
        int e = sc.nextInt();

        System.out.println("Enter the relationship between nodes : ");
        for(int i = 0; i < e ; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph[u].add(v);
            graph[v].add(u);
        }

        int[] shortestPath = new int[V];
        Arrays.fill(shortestPath, Integer.MAX_VALUE);
        boolean[] visited = new boolean[V];
        Arrays.fill(visited, false);
        Queue<Integer> q = new LinkedList<>();

        System.out.println("Enter the source node");
        int src = sc.nextInt();

        q.add(src);
        visited[src] = true;
        shortestPath[src] = 0;

        while(!q.isEmpty()){
            int node = q.poll();
            for(int neighbour : graph[node]){
                if(!visited[neighbour]) {
                    visited[neighbour] = true;
                    shortestPath[neighbour] = Math.min(shortestPath[neighbour], shortestPath[node] + 1);
                    q.add(neighbour);
                }
            }
        }

        for(int i = 0; i < V; i++){
            System.out.print(shortestPath[i] + " ");
        }

    }
}
