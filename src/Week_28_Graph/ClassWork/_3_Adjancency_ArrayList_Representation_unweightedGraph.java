package Week_28_Graph.ClassWork;

import java.util.ArrayList;
import java.util.Scanner;

public class _3_Adjancency_ArrayList_Representation_unweightedGraph {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of Vertices: ");
        int V = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        ArrayList<Integer>[] arr = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            arr[i] = new ArrayList<>();
        }

        System.out.println("Enter the number of edges: ");
        int e = sc.nextInt();

        System.out.println("Enter the relationship between nodes : ");
        for(int i = 0; i < e ; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            arr[u].add(v);
            arr[v].add(u);
        }

        for(ArrayList<Integer> array : arr){
            System.out.println(array);
        }
    }
}
