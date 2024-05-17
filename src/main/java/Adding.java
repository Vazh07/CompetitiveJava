import java.util.Scanner;
//https://open.kattis.com/problems/addingtrouble
public class Adding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the input line and split it into parts
        String input = sc.nextLine();
        String[] parts = input.split(" ");

        // Convert parts to integers
        int num1 = Integer.parseInt(parts[0]);
        int num2 = Integer.parseInt(parts[1]);
        int num3 = Integer.parseInt(parts[2]);

        // Check if the sum of num1 and num2 equals num3 and print the result
        if (num1 + num2 == num3) {
            System.out.println("correct!");
        } else {
            System.out.println("wrong!");
        }
    }
}
