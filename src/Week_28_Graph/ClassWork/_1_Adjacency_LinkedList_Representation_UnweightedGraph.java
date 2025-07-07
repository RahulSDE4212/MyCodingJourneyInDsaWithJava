package Week_28_Graph.ClassWork;
import java.util.*;
public class _1_Adjacency_LinkedList_Representation_UnweightedGraph {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of Vertices: ");
        int V = sc.nextInt();
        LinkedList<Integer> list = new LinkedList<>();

        LinkedList<Integer>[] arr = new LinkedList[V];
        for (int i = 0; i < V; i++) {
            arr[i] = new LinkedList<>();
        }

        System.out.println("Enter the number of edges: ");
        int e = sc.nextInt();

        System.out.println("Enter the relationship between nodes : ");
        for(int i = 0; i < e ; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            arr[u].add(v);
            //arr[v].add(u);
        }

        for(LinkedList<Integer> array : arr){
            System.out.println(array);
        }
    }
}
