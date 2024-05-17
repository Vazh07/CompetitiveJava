import java.util.ArrayList;
import java.util.Scanner;
//https://open.kattis.com/problems/zoom
public class Zoom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] num_lst = new int[n];
        for (int i = 0; i < n; i++) {
            num_lst[i] = sc.nextInt();
        }

        ArrayList<Integer> result = new ArrayList<>();

        for (int i = k - 1; i < n; i += k) {
            result.add(num_lst[i]);
        }

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
