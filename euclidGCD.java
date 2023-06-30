import java.util.Scanner;

class euclidGCD {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = sc.nextInt();

        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        int gcd = 0;
        while (b != 0) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        gcd = a;

        System.out.println("The GCD of " + a + " and " + b + " is " + gcd);
        sc.close();
    }
}
