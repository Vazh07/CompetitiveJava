import java.util.Scanner;
//https://open.kattis.com/problems/autori
public class Autori {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the string of names
        String names = sc.nextLine();

        // Initialize the resulting naming string
        String naming = "";

        // Process the string
        for (int i = 0; i < names.length(); i++) {
            if (i == 0) {
                naming += names.charAt(0);
                continue;
            }
            if (names.charAt(i) == '-') {
                naming += names.charAt(i + 1);
            }
        }

        // Print the resulting naming string
        System.out.println(naming);
    }
}
