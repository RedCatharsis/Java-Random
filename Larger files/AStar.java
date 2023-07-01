import java.util.*;

public class AStar{


    private static final int gridSize = 500;
    private static final int obstacleSize = 100;
    public static final int c = 0;
    

    public static void main(String[] args) {
        int[][] grid = new int[gridSize][gridSize];

        for(int i = 0; i < gridSize; i++){for(int j = 0; j < gridSize; j++){grid[i][j] = 0;}}

        for (int i = 0; i < obstacleSize; i++){
            int x = (int)(Math.random()*gridSize);
            int y = (int)(Math.random()*gridSize);
            grid[x][y] = 1;
        }

        int playerX = 0;
        int playerY = 0;
        int enemyX = gridSize - 1;
        int enemyY = gridSize - 1;

        PriorityQueue<Node> openQueue = new PriorityQueue<Node>();
        Set<Node> closedQueue = new HashSet<>();
        Node startNode = new Node(playerX, playerY, 0);
        openQueue.add(startNode);

        while(!openQueue.isEmpty()){
            Node currentNode = openQueue.poll();

            if(currentNode.x == enemyX && currentNode.y == enemyY){
                System.out.println("Found!");
                break;
            }
            closedQueue.add(currentNode);

            for(int i = -1; i<=1; i++){
                for(int j = -1; j<=i; j++){
                    int newX = currentNode.x + 1;
                    int newY = currentNode.y + 1;

                    if(newX < 0 || newX >= gridSize || newY < 0 || newY >= gridSize || grid[newX][newY] == 1){
                        continue;
                    }
                Node newNode = new Node(newX, newY, currentNode.c + 1);
                openQueue.add(newNode);
                }
            }
        }
    }

    static class Node implements Comparable<Node>{
        int x;
        int y; 
        int c;

        public Node(int x, int y, int c){
            this.x = x;
            this.y = y;
            this.c = c;
        }
    

        @Override
        public int compareTo(AStar.Node o) {
                        return this.c = AStar.c;
        }
    }
}