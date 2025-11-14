package exercicios.beecrowd.vetores;

import java.util.Scanner;

public class q_prova_vetores_asm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = new int[10];
        for (int i = 0; i < 10; i++) {
            n[i] = sc.nextInt();
        }
        int maiorSoma = 0;
        int posicao=0;
        System.out.println("imprime:");

        for (int i = 0; i < 9; i++) {
            int soma = n[i]+n[i+1];
            
            if(soma > maiorSoma){
                maiorSoma = soma;
                posicao = i;
            }
        }
        System.out.println("Maior soma: " + maiorSoma);
        System.out.println("Sequência: " + n[posicao] + " " + n[posicao + 1]);
        System.out.println("Posição inicial: " + posicao);

        sc.close();
    }

}

// adjacente = lado a lado.

// [1,2,3,9,4,3,0,2,7,2]
// [1,2], [2,3], [3,9],[9,4],[4,3],[3,0],[0,2],[2,7],[7,2]