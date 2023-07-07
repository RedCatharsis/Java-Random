import java.util.Scanner;

public class Karatsuba {
    
    public static long karatsubaMultiplication(long x, long y) {
        if (x < 10 || y < 10) {
            return x * y;
        }
        
        long n = Math.max(String.valueOf(x).length(), String.valueOf(y).length());
        
        long m = n / 2;
        
        long a = x / (long) Math.pow(10, m);
        long b = x % (long) Math.pow(10, m);
        long c = y / (long) Math.pow(10, m);
        long d = y % (long) Math.pow(10, m);
        
        long ac = karatsubaMultiplication(a, c);
        long bd = karatsubaMultiplication(b, d);
        long adPlusbc = karatsubaMultiplication(a + b, c + d) - ac - bd;
        
        long result = ac * (long) Math.pow(10, 2 * m) + adPlusbc * (long) Math.pow(10, m) + bd;
        
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        long num1 = scanner.nextLong();

        System.out.print("Enter the second number: ");
        long num2 = scanner.nextLong();

        long result = karatsubaMultiplication(num1, num2);
        System.out.println("Multiplication Result: " + result);

        scanner.close();
    }
}