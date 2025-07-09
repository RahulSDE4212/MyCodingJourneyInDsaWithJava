package Week_28_Graph.Leetcode;
import java.util.*;

// https://leetcode.com/problems/find-center-of-star-graph/

class CenterOfStarGraph {
    public int findCenter(int[][] edges) {
        int edge = edges.length;

        int V = edge + 1;
        ArrayList[] graph = new ArrayList[V + 1]; 
        for(int i = 0; i <= V; i++){
            graph[i] = new ArrayList<>();
        } 

        for(int[] array : edges){
            int u = array[0];
            int v = array[1];
            graph[u].add(v);
            graph[v].add(u);
        }

        for(int i = 0; i <= V; i++){
            ArrayList<Integer> arr = graph[i];
            if(arr.size() == V - 1) return i;
        }
        return -1;
    }
}