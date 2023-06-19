import java.util.Scanner;

public class SimpleSieve {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter an upper bound: ");
    int upper_bound = sc.nextInt();

    boolean[] isPrime = new boolean[upper_bound + 1];
    for (int i = 2; i <= upper_bound; i++) {
      isPrime[i] = true;
    }

    for (int i = 2; i * i <= upper_bound; i++) {
      if (isPrime[i]) {
        for (int j = i * i; j <= upper_bound; j = j+i) {
          isPrime[j] = false;
        }
      }
    }

    String primes = "";
    for (int i = 2; i <= upper_bound; i++) {
      if (isPrime[i]) {
        primes += i + ", ";
      }
    }
    sc.close();

    System.out.println("The prime numbers between 0 and " + upper_bound + " are: " + primes);
  }

}
