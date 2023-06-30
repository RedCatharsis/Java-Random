import java.util.Scanner;

class binaryPalindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        String binaryNumber = Integer.toBinaryString(number);

        boolean isPalindrome = true;
        int length = binaryNumber.length();
        for (int i = 0; i < length / 2; i++) {
            if (binaryNumber.charAt(i) != binaryNumber.charAt(length - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("The binary representation of " + number + " is a palindrome.");
        } else {
            System.out.println("The binary representation of " + number + " is not a palindrome.");
        }
        sc.close();
    }
}
