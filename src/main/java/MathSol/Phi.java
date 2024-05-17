package MathSol;
import java.util.HashMap;
import java.util.Map;

public class Phi {
    public static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        return gcd(b % a, a);
    }

    public static boolean areCoprime(int a, int b) {
        return gcd(a, b) == 1;
    }

    public static int phi34(int m) {
        int coprimes = 0;
        for (int i = 1; i < m; i++) {
            if (areCoprime(i, m)) {
                coprimes++;
            }
        }
        return coprimes;
    }

    public static Map<Integer, Integer> phi37(int m) {
        Map<Integer, Integer> coprimes = new HashMap<>();
        for (int i = 1; i < m; i++) {
            if (areCoprime(i, m)) {
                coprimes.put(i, coprimes.getOrDefault(i, 0) + 1);
            }
        }
        return coprimes;
    }

    public static void main(String[] args) {
        System.out.println(phi34(10)); // 4
        System.out.println(phi37(10)); // {1=1, 3=1, 7=1, 9=1}
    }
}