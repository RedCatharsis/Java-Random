import java.util.Scanner;

public class maxMatrixHourglass {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int[][] matrix = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 2; j++) {

                int sum = matrix[i][j] + matrix[i][j + 1] + matrix[i][j + 2]
                    + matrix[i + 1][j + 1]
                    + matrix[i + 2][j] + matrix[i + 2][j + 1] + matrix[i + 2][j + 2];

                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }

        System.out.println("The maximum hourglass sum is " + maxSum);
        scanner.close();
    }
}
