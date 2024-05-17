import java.util.Scanner;
//https://open.kattis.com/problems/speeding
public class Speeding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the integer n
        int n = sc.nextInt();

        // Initialize variables
        double spd = 0;
        int lt = 0;
        int ld = 0;

        // Process each pair of (t, d)
        while (n > 0) {
            n--;
            int t = sc.nextInt();
            int d = sc.nextInt();

            // Skip if t is 0
            if (t == 0) {
                continue;
            }

            // Calculate the speed
            double spdAux = (double) (d - ld) / (t - lt);
            if (spdAux > spd) {
                spd = spdAux;
            }

            // Update lt and ld
            lt = t;
            ld = d;
        }

        // Print the maximum speed as an integer
        System.out.println((int) spd);
    }
}
