package Week_28_Graph.ClassWork;
import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;

public class _8_AnyPath {
    static ArrayList<String> finalAnswer;
    static boolean[] visited;
    // true means visited
    // false means unvisited
    public static void f(ArrayList<Integer>[] graph, int source, int dest, String path){
        if(source == dest){
            finalAnswer.add(path);
            return;
        }

        visited[source] = true;
        for(int neighbour : graph[source]){
            if(!visited[neighbour]){
                f(graph, neighbour, dest, path +"->" + neighbour);
            }
        }

        visited[source] = false;

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

        System.out.println("Enter the source vertex");
        int source = sc.nextInt();
        System.out.println("Enter the destination vertex: ");
        int dest = sc.nextInt();

        finalAnswer = new ArrayList<>();
        visited = new boolean[graph.length];
        Arrays.fill(visited, false);
        f(graph, source, dest, "" + source);
        for(String str : finalAnswer){
            System.out.println(str);
        }
    }
}
