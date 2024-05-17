package Fogueo01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RankProblem {
    public static void rank(int n, List<String[]> matches) {
        List<String> teams = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            teams.add("T" + i);
        }

        for (String[] match : matches) {
            int w = teams.indexOf(match[0]);
            int l = teams.indexOf(match[1]);

            // Intercambio de las posiciones
            if (w > l) {
                String temp = teams.get(w);
                teams.set(w, teams.get(l));
                teams.set(l, temp);
            }
        }

        // Crear el string necesario para la salida de datos
        StringBuilder sb = new StringBuilder();
        for (String team : teams) {
            sb.append(team).append(" ");
        }
        System.out.println(sb.toString().trim());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine(); // Leer el separador de nueva linea

        List<String[]> matches = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            String[] match = scanner.nextLine().split(" ");
            matches.add(match);
        }

        rank(n, matches);
    }
}
