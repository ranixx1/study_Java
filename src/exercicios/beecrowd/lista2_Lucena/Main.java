import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n1 = scanner.nextDouble();
        while (n1 < 0.0 || n1 > 10.0) {
            System.out.println("nota invalida");
            n1 = scanner.nextDouble();
        }

        double n2 = scanner.nextDouble();
        while (n2 < 0.0 || n2 > 10.0) {
            System.out.println("nota invalida");
            n2 = scanner.nextDouble();
        }

        double media = (n1 + n2) / 2.0;

        System.out.printf("media = %.2f\n", media);

        scanner.close();
    }
}