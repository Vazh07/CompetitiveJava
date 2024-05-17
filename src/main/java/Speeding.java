import java.util.Scanner;
//https://open.kattis.com/problems/speeding
public class Speeding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double spd = 0;
        int lt = 0;
        int ld = 0;

        while (n > 0) {
            n--;
            int t = sc.nextInt();
            int d = sc.nextInt();

            if (t == 0) {
                continue;
            }

            double spdAux = (double) (d - ld) / (t - lt);
            if (spdAux > spd) {
                spd = spdAux;
            }

            lt = t;
            ld = d;
        }

        System.out.println((int) spd);
    }
}
