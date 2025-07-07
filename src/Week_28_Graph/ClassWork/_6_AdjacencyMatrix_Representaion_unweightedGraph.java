package Week_28_Graph.ClassWork;

import java.util.Scanner;

public class _6_AdjacencyMatrix_Representaion_unweightedGraph {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of vertices : ");
        int V = sc.nextInt();

        int[][] adMatrix = new int[V + 1][V + 1];

        System.out.println("Enter the number of edges : ");
        int edges = sc.nextInt();
        for(int i = 0; i < edges; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            adMatrix[u][v] = 1;
            adMatrix[v][u] = 1;
        }

        for(int i = 0; i < V; i++){
            for(int j = 0; j < V; j++){
                System.out.print(adMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
