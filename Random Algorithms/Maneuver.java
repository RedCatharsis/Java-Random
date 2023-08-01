public class Maneuver{

    public static int[] tracePath(int[][] matrix, int i, int j, int m, int n) {

        int[] path = new int[Math.min(m - i, n - j)];
        int current_element = matrix[i][j];
        
        path[0] = current_element;
        for (int z = 1; z < path.length; z++) {
          current_element = matrix[i + 1][j + 1];
          path[z] = current_element;
          i++;
          j++;
        }
        return path;
      }

    static int pi(int r, int c){
        if(r = rows - 1 || c == cols -1){
            return 1;
        }
        return path(r+1, c) + path(r, c+1);
    }
    
    public static void main(String[] args) {
        System.out.println();
    }
}