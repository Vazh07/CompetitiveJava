import java.util.Scanner;
//https://open.kattis.com/problems/autori
public class Autori {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String names = sc.nextLine();

        String naming = "";

        for (int i = 0; i < names.length(); i++) {
            if (i == 0) {
                naming += names.charAt(0);
                continue;
            }
            if (names.charAt(i) == '-') {
                naming += names.charAt(i + 1);
            }
        }

        System.out.println(naming);
    }
}
