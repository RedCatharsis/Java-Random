import java.util.Scanner;

public class hyphenSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();

        String hyphenString = "";
        String otherString = "";

        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == '-') {
                hyphenString += inputString.charAt(i);
            }
            else {
                otherString += inputString.charAt(i);
            }
        }

        System.out.println(hyphenString + otherString);
        sc.close();
    }
}