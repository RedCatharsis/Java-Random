import java.util.*;

public class Strobogrammatic {

    private static final String[] DIGITS = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

    public static boolean isStrobogrammatic(int number) {
        String numberStr = Integer.toString(number);
        int length = numberStr.length();
        for (int i = 0; i < length / 2; i++) {
            char c1 = numberStr.charAt(i);
            char c2 = numberStr.charAt(length - 1 - i);
            if (c1 != c2 || DIGITS[c1 - '0'] == null) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        if (isStrobogrammatic(number)) {
            System.out.println(number + " is a strobogrammatic number");
        } else {
            System.out.println(number + " is not a strobogrammatic number");
        }
        scanner.close();
    }
}