import java.util.Scanner;

public class EulerTotient {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an upper bound: ");
        int a = sc.nextInt();

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int fi = 0;
        for (int i = 1; i <= a; i++) {
            if (gcd(n, i) == 1) {
                fi++;
            }
        }

        System.out.println("The number of positive integers less than or equal to " + a + " that are relatively prime to " + n + " is " + fi);
        sc.close();
    }

    static int gcd(int n, int m) {
        if (m == 0) {
            return n;
        } else {
            return gcd(m, n % m);
        }
    }
}
