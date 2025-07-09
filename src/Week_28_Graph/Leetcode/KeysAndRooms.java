package Week_28_Graph.Leetcode;
import java.util.*;

// https://leetcode.com/problems/keys-and-rooms/description/

class KeysAndRooms {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();

        boolean[] visited = new boolean[n];
        Arrays.fill(visited, false);

        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        visited[0] = true;

        while(!q.isEmpty()){
            int room = q.poll();

            for(int key : rooms.get(room)){
                if(!visited[key]){
                    q.add(key);
                    visited[key] = true;
                }
            }
        }

        for(boolean bool : visited){
            if(!bool) return false;
        }

        return true;
    }
}