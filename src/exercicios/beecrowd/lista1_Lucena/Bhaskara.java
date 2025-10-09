import java.util.Scanner;
import java.lang.Math;

public class Bhaskara {
    public static void main(String[] args) {
        double a, b, c;
        Scanner scanner = new Scanner(System.in);

        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();

        double delta = b * b - 4 * a * c;

        if (delta < 0 || a == 0) { 
            System.out.println("Impossivel calcular");
        } else {
            double raiz_delta = Math.sqrt(delta); 
            double R1 = (-b + raiz_delta) / (2 * a);
            double R2 = (-b - raiz_delta) / (2 * a);
            System.out.printf("R1 = %.5f%n", R1);
            System.out.printf("R2 = %.5f%n", R2);
        }

        scanner.close();
    }
}

