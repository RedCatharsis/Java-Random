import java.util.Scanner;

public class SimpleSieve {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter an upper bound: ");
    int upper_bound = sc.nextInt();

    boolean[] Sieve = new boolean[upper_bound + 1];
    for (int i = 2; i <= upper_bound; i++) {
      Sieve[i] = true;
    }

    for (int i = 2; i * i <= upper_bound; i++) {
      if (Sieve[i]) {
        for (int j = i * i; j <= upper_bound; j = j+i) {
          Sieve[j] = false;
        }
      }
    }

    String primes = "";
    for (int i = 2; i <= upper_bound; i++) {
      if (Sieve[i]) {
        primes += i + ", ";
      }
    }
    sc.close();

    System.out.println("The prime numbers between 0 and " + upper_bound + " are: " + primes);
  }

}