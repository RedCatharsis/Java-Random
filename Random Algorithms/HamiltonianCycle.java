import java.util.*;

public class HamiltonianCycle {

    public static boolean hamiltonianCycle(int[][] graph, int start) {
        boolean[] visited = new boolean[graph.length];
        visited[start] = true;

        Stack<Integer> st = new Stack<>();
        st.push(start);

        for (int i = 0; i < graph.length; i++) {
            if (!visited[i] && graph[start][i] == 1) {
                visited[i] = true;
                st.push(i);

                if (hamiltonianCycle(graph, i)) {
                    return true;
                } else {
                    st.pop();
                    visited[i] = false;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] graph = new int[5][5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Enter the value of graph[" + i + "][" + j + "]: ");
                graph[i][j] = scanner.nextInt();
            }
        }

        boolean hamiltonianCycleFound = hamiltonianCycle(graph, 0);

        if (hamiltonianCycleFound) {
            System.out.println("Hamiltonian cycle:");
            for (int vertex : st) {
                System.out.print(vertex + " ");
            }
        } else {
            System.out.println("No Hamiltonian cycle found.");
        }
    }
}
