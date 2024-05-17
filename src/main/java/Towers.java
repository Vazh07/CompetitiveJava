import java.util.Scanner;
//https://open.kattis.com/problems/ofugsnuid
public class Towers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the integer n
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        // Read the list of integers
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Initialize the count and auxiliary variable
        int t = 0;
        int aux = -1;

        // Iterate through the list and count how many times a number is greater than the previous one
        for (int num : nums) {
            if (num > aux) {
                t++;
            }
            aux = num;
        }

        // Print the result
        System.out.println(t);
    }
}
