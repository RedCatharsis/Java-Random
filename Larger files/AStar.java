import java.util.*;

public class AStar {

    private static final int GRID_SIZE = 500;
    private static final int OBSTACLE_COUNT = 10;

    public static void main(String[] args) {
        // Create a grid of blocks
        int[][] grid = new int[GRID_SIZE][GRID_SIZE];
        for (int i = 0; i < GRID_SIZE; i++) {
            for (int j = 0; j < GRID_SIZE; j++) {
                grid[i][j] = 0;
            }
        }

        // Place obstacles on the grid
        for (int i = 0; i < OBSTACLE_COUNT; i++) {
            int x = (int) (Math.random() * GRID_SIZE);
            int y = (int) (Math.random() * GRID_SIZE);
            grid[x][y] = 1;
        }

        // Create the player and enemy
        int playerX = 0;
        int playerY = 0;
        int enemyX = GRID_SIZE - 1;
        int enemyY = GRID_SIZE - 1;

        // Initialize the A* algorithm
        PriorityQueue<Node> openList = new PriorityQueue<>();
        Set<Node> closedList = new HashSet<>();
        Node startNode = new Node(playerX, playerY, 0);
        openList.add(startNode);

        // Start the A* search
        while (!openList.isEmpty()) {
            Node currentNode = openList.poll();

            // Check if the current node is the enemy
            if (currentNode.x == enemyX && currentNode.y == enemyY) {
                System.out.println("Found the enemy!");
                break;
            }

            // Add the current node to the closed list
            closedList.add(currentNode);

            // Expand the current node
            for (int i = -1; i <= 1; i++) {
                for (int j = -1; j <= 1; j++) {
                    int newX = currentNode.x + i;
                    int newY = currentNode.y + j;

                    // Check if the new node is valid
                    if (newX < 0 || newX >= GRID_SIZE || newY < 0 || newY >= GRID_SIZE || grid[newX][newY] == 1) {
                        continue;
                    }

                    // Create a new node for the new position
                    Node newNode = new Node(newX, newY, currentNode.cost + 1);

                    // Add the new node to the open list
                    openList.add(newNode);
                }
            }
        }
    }

    static class Node implements Comparable<Node> {

        int x;
        int y;
        int cost;

        public Node(int x, int y, int cost) {
            this.x = x;
            this.y = y;
            this.cost = cost;
        }

        @Override
        public int compareTo(Node otherNode) {
            return this.cost - otherNode.cost;
        }
    }
}
