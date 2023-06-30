import java.util.Scanner;

class selectionSort {

    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + i + ": ");
            array[i] = sc.nextInt();
        }

        System.out.println("Unsorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }

        SelectionSort(array);

        System.out.println("\nSorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        sc.close();
    }

    public static void SelectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }
}
