import java.util.*;

public class LexicographicSort {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of strings: ");
        int n = scanner.nextInt();

        String[] strings = new String[n];

        System.out.println("Enter the strings: ");
        for (int i = 0; i < n; i++) {
            strings[i] = scanner.next();
        }

        System.out.println("Unsorted strings: " + Arrays.toString(strings));

        // Sort the strings in lexicographical order
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (strings[i].compareTo(strings[j]) > 0) {
                    String temp = strings[i];
                    strings[i] = strings[j];
                    strings[j] = temp;
                }
            }
        }

        System.out.println("Sorted strings: " + Arrays.toString(strings));

        scanner.close();
    }
}
