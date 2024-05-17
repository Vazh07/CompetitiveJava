import java.util.Scanner;
//https://open.kattis.com/problems/ofugsnuid
public class Towers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int t = 0;
        int aux = -1;

        for (int num : nums) {
            if (num > aux) {
                t++;
            }
            aux = num;
        }

        System.out.println(t);
    }
}
