import java.util.Scanner;

public class IncrementalSieve {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the upper bound: ");
        int n = sc.nextInt();

        boolean[] primes = new boolean[n + 1];

        for (int i = 2; i <= n; i++) {
            primes[i] = true;
        }

        for (int i = 2; i * i <= n; i++) {
            if (primes[i]) {
                for (int j = i * i; j <= n; j += i) {
                    primes[j] = false;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if (primes[i]) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
