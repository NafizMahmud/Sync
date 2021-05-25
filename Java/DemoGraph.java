import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DemoGraph {
    // int[][] graphData = { { 1, 3 }, { 1, 4 }, { 2, 3 }, { 2, 4 }, { 4, 3 } };
    int[][] graphData = { { 0, 1 }, { 0, 2 }, { 1, 2 }, { 2, 0 }, { 2, 3 }, { 3, 3 } };
    Map<Integer, List<Integer>> adj = new HashMap<>();

    DemoGraph() {
        // Print Graph Data
        // for (int i = 0; i < graphData.length; i++) {
        // for (int j = 0; j < 2; j++) {
        // System.out.print(" [" + i + "][" + j + "] = " + graphData[i][j]);
        // }
        // System.out.println();
        // }
DFS();
      createAdjacencyList();
       // BFS(adj, 0);
    }

    void createAdjacencyList() {
        for (int i = 0; i < graphData.length; i++) {
            if (adj.containsKey(graphData[i][0])) {
                adj.get(graphData[i][0]).add(graphData[i][1]);
            } else {
                adj.put(graphData[i][0], new ArrayList<>(Arrays.asList(graphData[i][1])));
            }
            // if (adj.containsKey(graphData[i][1])) {
            // adj.get(graphData[i][1]).add(graphData[i][0]);
            // } else {
            // adj.put(graphData[i][1],new ArrayList<>(Arrays.asList(graphData[i][0])));
            // }
        }
        // System.out.println(adj.toString());
        for(Map.Entry<Integer, List<Integer>> adjacencies : adj.entrySet()) {System.out.println("Adj " + adjacencies);}
        for( Integer index : adj.keySet()) {System.out.println("key = " + index +" values = " + adj.get(index).toString());}
    }

    void BFS(Map<Integer, List<Integer>> adjacencyList, int startNode) {
        Deque<Integer> nodes = new ArrayDeque<>();
        int arraTest[] = new int[5];
        // nodes.
        Set<Integer> BFS = new HashSet<>();
        BFS.add(startNode);
        nodes.addAll(adjacencyList.get(startNode));
        BFS.add(nodes.getFirst());
        nodes.addAll(adjacencyList.get(nodes.poll()));
        // System.out.println(BFS + " -----  " + nodes);

    }

    void DFS() {
        LinkedList<String> queue = new LinkedList<>();
        queue.add("Geeks");
        queue.add("Geeks");
        queue.add(1, "For");
        queue.add(0, "TestIndex");  // Index Insert
        queue.addLast("Add Last");
        System.out.println(queue.get(queue.size() - 2) + "   "+ queue.indexOf("For"));

        LinkedList<String> stack = (LinkedList<String>) queue.clone();
        stack.addFirst("Works as a  Stack");
        stack.removeLast();
        System.out.println("queue"+ queue);
        System.out.println("stack " + stack);




     // Using the for each loop
     // for (String element : queue) {System.out.println(element + " ");}
     for(int i = 0; i < stack.size(); i++) {System.out.print(stack.get(i) + " Print = ");}
    }

    public static void main(String[] args) {
        DemoGraph v = new DemoGraph();
    }
}
