package exercicios.beecrowd.vetores;
import java.util.Scanner;
public class VetorSubstitui {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] X = new int[10];

        // 1. Ler os 10 valores inteiros e armazenar no vetor X
        for (int i = 0; i < 10; i++) {
            X[i] = entrada.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if (X[i] <= 0) {
                X[i] = 1;
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("X[" + i + "] = " + X[i]);
        }

        entrada.close();
    }
}