import java.util.ArrayList;
import java.util.Scanner;
//https://open.kattis.com/problems/zoom
public class Zoom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // leer n - k
        int n = sc.nextInt();
        int k = sc.nextInt();

        // leer la lista de numeros
        int[] num_lst = new int[n];
        for (int i = 0; i < n; i++) {
            num_lst[i] = sc.nextInt();
        }

        // crear la lista para el resultado
        ArrayList<Integer> result = new ArrayList<>();

        // ir tomando cada k-1 (por el indice) elemento
        for (int i = k - 1; i < n; i += k) {
            result.add(num_lst[i]);
        }

        // mostrar el resultado
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
