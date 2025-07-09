package Week_28_Graph.ClassWork;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class _10_ConnectedComponent {
    public static void bfs(int i, boolean[] visited, ArrayList<Integer>[] graph){
        visited[i] = true;
        for(int neighbour : graph[i]){
            if(!visited[neighbour]) bfs(neighbour, visited, graph);
        }
    }
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

        for(ArrayList<Integer> array : graph){
            System.out.println(array);
        }


        boolean[] visited = new boolean[V];
        Arrays.fill(visited, false);
        int count = 0;
        for(int i = 0; i < visited.length; i++){
            if(visited[i]) continue;
            count++;
            bfs(i, visited, graph);
        }

        System.out.println("The number of connected components are : " +  count);
    }
}
