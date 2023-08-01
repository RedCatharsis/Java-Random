import java.util.*;

public class Maracher {

    public static String longestPalindrome(String str) {
        int n = str.length();
        int[] P = new int[n];
        int R = 0, C = 0;
        for (int i = 1; i < n; i++) {
            if (str.charAt(i) == str.charAt(C)) {
                P[i] = R + 1;
                R = P[i];
            } else {
                int j = Math.max(0, P[C - i]);
                while (i - j >= 0 && i + j < n && str.charAt(i - j) == str.charAt(i + j)) {
                    P[i] = j + 1;
                    j++;
                }
                C = i + P[i] - 1;
            }
        }

        int maxLen = 0, maxIndex = 0;
        for (int i = 0; i < n; i++) {
            if (maxLen < P[i]) {
                maxLen = P[i];
                maxIndex = i;
            }
        }

        return str.substring(maxIndex - maxLen + 1, maxIndex + maxLen);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = scanner.nextLine();

        System.out.println("The longest palindromic substring is: " + longestPalindrome(str));
    }
}
