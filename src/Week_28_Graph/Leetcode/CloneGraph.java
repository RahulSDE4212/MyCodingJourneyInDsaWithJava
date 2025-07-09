package Week_28_Graph.Leetcode;
import java.util.*;
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class CloneGraph {
    static class Node {
        public int val;
        public List<Node> neighbors;
        public Node() {
            val = 0;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }
    public Node f(Node node, ArrayList<Node> addressRegister){
        int val = node.val;
        if(addressRegister.get(val) != null) return addressRegister.get(val);

        Node newNode = new Node(val);
        addressRegister.set(val, newNode);  // missing!

        for(Node neighbour : node.neighbors){
            newNode.neighbors.add(addressRegister.get(neighbour.val) != null ? addressRegister.get(neighbour.val) : f(neighbour, addressRegister));
        }

        return newNode;
    }
    public Node cloneGraph(Node node) {
        if(node == null) return null;
        
        ArrayList<Node> addressRegister = new ArrayList<>(101);

        for(int i = 0; i < 101; i++){
            addressRegister.add(null);
        }

        return f(node, addressRegister);
    }
}