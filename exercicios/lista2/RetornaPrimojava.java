package exercicios.lista2;

import java.util.Scanner;

public class RetornaPrimojava {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        VerificaPrimo(n);

        scanner.close();
    }

    public static void VerificaPrimo(int n) {
        if (n <= 1) {
            System.out.println("Não é primo");
            return;
        }

        int divisores = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                divisores += 1;
            }
        }

        if (divisores == 2) {
            System.out.println("É primo");
        } else {
            System.out.println("Não é primo");
        }
    }
}
