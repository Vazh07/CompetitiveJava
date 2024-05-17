package MathSol;

public class Coprimes {
    public static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        return gcd(b % a, a);
    }

    public static boolean areCoprime(int a, int b) {
        return gcd(a, b) == 1;
    }

    public static void main(String[] args) {
        System.out.println(areCoprime(35, 65)); // Output: true
    }
}
