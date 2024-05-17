package Fogueo01;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GuessWho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int Q = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        List<String> chars = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            chars.add(scanner.nextLine());
        }

        List<String[]> qry = new ArrayList<>();
        for (int i = 0; i < Q; i++) {
            qry.add(scanner.nextLine().split(" "));
        }

        List<Integer> m = new ArrayList<>();
        for (int indx = 0; indx < N; indx++) {
            int matches = 0;
            String c = chars.get(indx);
            for (String[] q : qry) {
                if (c.charAt(Integer.parseInt(q[0]) - 1) == q[1].charAt(0)) {
                    matches++;
                }
            }
            if (matches == Q) {
                m.add(indx + 1);
            }
        }

        if (m.size() > 1) {
            System.out.println("ambiguous");
            System.out.println(m.size());
        } else {
            System.out.println("unique");
            System.out.println(m.isEmpty() ? -1 : m.get(0));
        }

        scanner.close();
    }
}