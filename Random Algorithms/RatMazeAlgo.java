import java.util.*;

public class RatMazeAlgo {

    static int i= 0, j = 0;
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (i=0; i<n; i++){
            for(j=0; j<n; j++){
                System.out.println(path[i][j] + " ");
            }
        }
        System.out.println(n);
    }
}