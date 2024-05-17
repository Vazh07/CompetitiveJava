import java.util.ArrayList;
import java.util.Scanner;
//https://open.kattis.com/problems/tornbygge
public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the integer n
        int n = sc.nextInt();

        // Create a list to store the numbers
        ArrayList<Integer> nums = new ArrayList<>();

        // Read n integers from the input and add them to the list
        for (int i = 0; i < n; i++) {
            nums.add(sc.nextInt());
        }

        // Print the numbers in reverse order
        for (int i = n - 1; i >= 0; i--) {
            System.out.println(nums.get(i));
        }
    }
}
