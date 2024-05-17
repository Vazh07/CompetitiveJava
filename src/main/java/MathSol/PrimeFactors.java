package MathSol;
import java.util.HashMap;
import java.util.Map;

public class PrimeFactors {
    public static Map<Integer, Integer> primeFactors(int n) {
        Map<Integer, Integer> factors = new HashMap<>();
        while (n % 2 == 0) {
            factors.put(2, factors.getOrDefault(2, 0) + 1);
            n /= 2;
        }
        int factor = 3;
        while (factor * factor <= n) {
            while (n % factor == 0) {
                factors.put(factor, factors.getOrDefault(factor, 0) + 1);
                n /= factor;
            }
            factor += 2;
        }
        if (n > 1) {
            factors.put(n, 1);
        }
        return factors;
    }

    public static void main(String[] args) {
        System.out.println(primeFactors(315)); //{3=2, 5=1, 7=1}
    }
}
