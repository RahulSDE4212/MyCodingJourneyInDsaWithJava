package Week_28_Graph.ClassWork;

import java.util.Scanner;

public class _7_IncidenceMatrix_Representation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of vertices : ");
        int V = sc.nextInt();

        System.out.println("Enter the number of edges : ");
        int edges = sc.nextInt();

        int[][] adMatrix = new int[V + 1][edges + 1];
        for(int i = 0; i < edges; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            int edgeNo = sc.nextInt();
            adMatrix[u][edgeNo]  += 1;
            adMatrix[v][edgeNo]  += 1;
        }

        for(int i = 0; i < V; i++){
            for(int j = 0; j < edges; j++){
                System.out.print(adMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
