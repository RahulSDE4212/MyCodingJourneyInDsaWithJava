package Week_28_Graph.ClassWork;
import java.util.*;
public class _4_Adjacency_ArrayList_Representaion_weightedGraph {
    static class Pair {
        int vertex;
        int edges;
        Pair(int vertex, int edges){
            this.vertex = vertex;
            this.edges = edges;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of Vertices: ");
        int V = sc.nextInt();

        ArrayList<Pair>[] arr = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            arr[i] = new ArrayList<>();
        }

        System.out.println("Enter the number of edges: ");
        int e = sc.nextInt();

        System.out.println("Enter the relationship between nodes and the weight of the edge : ");
        for(int i = 0; i < e ; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            int weight = sc.nextInt();
            arr[u].add(new Pair(v, weight));
            arr[v].add(new Pair(u, weight));
        }

        for(ArrayList<Pair> array : arr){
            for(int i = 0; i < array.size(); i++){
                System.out.print("[" +  array.get(i).vertex + " " + array.get(i).edges + " ]") ;
            }
            System.out.println();
        }
    }
}
