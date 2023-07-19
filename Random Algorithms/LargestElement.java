import java.util.*;

public class LargestElement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Unsorted array: " + Arrays.toString(array));

        // Find the largest element in the array
        int largestElement = array[0];
        for (int i = 1; i < n; i++) {
            if (array[i] > largestElement) {
                largestElement = array[i];
            }
        }

        System.out.println("Largest element in the array: " + largestElement);
        scanner.close();
    }
}

