package Week_28_Graph.ClassWork;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class _5_AdjacencyMap_Representation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of Vertices: ");
        int V = sc.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();

        HashMap[] arr = new HashMap[V];
        for (int i = 0; i < V; i++) {
            arr[i] = new HashMap();
        }

        System.out.println("Enter the number of edges: ");
        int e = sc.nextInt();

        System.out.println("Enter the relationship between nodes : ");
        for(int i = 0; i < e ; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            int weight = sc.nextInt();
            arr[u].put(v, weight);
            arr[v].put(u, weight);
        }

        for(HashMap array : arr){
            System.out.println(array);
        }
    }
}
