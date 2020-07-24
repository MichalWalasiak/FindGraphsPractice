package Algorythms;

import java.util.*;

public class GraphCountService {
    private Map<Integer, List<Integer>> vertices = new HashMap<>();

    public void addVertices(int firstInput, int secondInput) {
        if (vertices.containsKey(firstInput)) {
            vertices.get(firstInput).add(secondInput);
        } else {
            vertices.put(firstInput, new ArrayList<>(Collections.singletonList(secondInput)));
        }
        if (vertices.containsKey(secondInput)) {
            vertices.get(secondInput).add(firstInput);
        } else {
            vertices.put(secondInput, new ArrayList<>(Collections.singletonList(firstInput)));
        }
    }

    public void TreeTraversal(int vertex, Set<Integer> visited) {
        Stack<Integer> stack = new Stack<>();
        stack.push(vertex);

        while (!stack.empty()) {
            vertex = stack.pop();

            if (!visited.contains(vertex)) {
                visited.add(vertex);

                for (int j : vertices.get(vertex)) {
                    if (!visited.contains(j)) {
                        stack.push(j);
                    }
                }
            }
        }
    }

    public int getGraphCounter() {
        int graphCounter = 0;
        Set<Integer> visited = new HashSet<>();

        for (int i : vertices.keySet()) {
            if (!visited.contains(i)) {
                graphCounter++;
                TreeTraversal(i, visited);
            }
        }
        return graphCounter;
    }
}
