package Fogueo01;
import java.util.Scanner;

public class AreaProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sqrs = scanner.nextInt();
        double sideLength = Math.sqrt(sqrs);
        double perimeter = sideLength * 4;
        System.out.printf("%.6f\n", perimeter);
        scanner.close();
    }
}
