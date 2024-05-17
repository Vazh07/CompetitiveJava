import java.util.ArrayList;
import java.util.Scanner;
//https://open.kattis.com/problems/tornbygge
public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ArrayList<Integer> nums = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            nums.add(sc.nextInt());
        }

        for (int i = n - 1; i >= 0; i--) {
            System.out.println(nums.get(i));
        }
    }
}
