import java.util.Scanner;
//https://open.kattis.com/problems/addingtrouble
public class Adding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // dividir el input en dos partes
        String input = sc.nextLine();
        String[] parts = input.split(" ");

        // transformarlo en numeros
        int num1 = Integer.parseInt(parts[0]);
        int num2 = Integer.parseInt(parts[1]);
        int num3 = Integer.parseInt(parts[2]);

        // revisar la suma
        if (num1 + num2 == num3) {
            System.out.println("correct!");
        } else {
            System.out.println("wrong!");
        }
    }
}
