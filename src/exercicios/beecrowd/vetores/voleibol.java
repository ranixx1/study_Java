package exercicios.beecrowd.vetores;

import java.util.Scanner;

public class voleibol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero_jogadores = scanner.nextInt();
        int total_S = 0;
        int total_B = 0;
        int total_A = 0;
        int total_Ss = 0;
        int total_Bs = 0;
        int total_As = 0;
        for (int i = 0; i < numero_jogadores; i++) {
            String name = scanner.next();
            int S = scanner.nextInt();
            int B = scanner.nextInt();
            int A = scanner.nextInt();
            total_S += S;
            total_B += B;
            total_A += A;
            int Ss = scanner.nextInt();
            int Bs = scanner.nextInt();
            int As = scanner.nextInt();
            total_Ss += Ss;
            total_Bs += Bs;
            total_As += As;
        }
        scanner.close();
        double percentualS = ((double) total_Ss / total_S) * 100.0;
        double percentualB = ((double) total_Bs / total_B) * 100.0;
        double percentualA = ((double) total_As / total_A) * 100.0;
        System.out.printf("Pontos de Saque: %.2f %%.\n", percentualS);
        System.out.printf("Pontos de Bloqueio: %.2f %%.\n", percentualB);
        System.out.printf("Pontos de Ataque: %.2f %%.\n", percentualA);
    }

}