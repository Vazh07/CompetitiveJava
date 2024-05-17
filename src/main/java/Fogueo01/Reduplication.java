package Fogueo01;
import java.util.Scanner;

public class Reduplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String palabra = scanner.next();

        int repeticiones = scanner.nextInt();

        System.out.println( reduplicarPalabra(palabra, repeticiones));

        scanner.close();
    }

    public static String reduplicarPalabra(String palabra, int repeticiones) {
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < repeticiones; i++) {
            resultado.append(palabra);
        }
        return resultado.toString();
    }
}
