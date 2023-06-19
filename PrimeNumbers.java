import java.util.Scanner;

public class PrimeNumbers {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter an upper bound: ");
    int upper_bound = scanner.nextInt();

    int primeCount = 0;
    int nonPrimeCount = 0;
    for (int i = 2; i <= upper_bound; i++) {
      boolean isPrime = true;
      for (int j = 2; j * j <= i; j++) {
        if (i % j == 0) {
          isPrime = false;
          break;
        }
      }
      if (isPrime) {
        primeCount++;
        System.out.println("Prime number: " + i);
      } else {
        nonPrimeCount++;
      }
    }
    scanner.close();

    System.out.println("The number of primes between 0 and " + upper_bound + " is " + primeCount);
    System.out.println("The number of non-primes between 0 and " + upper_bound + " is " + nonPrimeCount);
  }

}