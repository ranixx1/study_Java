package exercicios.beecrowd.vetores;

import java.util.Scanner;

public class MenorAndPosicao { 
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int quantidade = scanner.nextInt();
        int[]X =new int[quantidade];
        int menor =0;
        int posicaoDoMenor = 0;
        for(int i=0; i<quantidade;i++){
            X[i] = scanner.nextInt();
            if(i == 0){
                menor = X[i];
                posicaoDoMenor = i;
            }
            else{
                if(X[i]<menor){
                    menor = X[i];
                    posicaoDoMenor = i;
                }
            }
        }
        System.out.println("Menor valor: " +menor);
        System.out.println("Posicao: " +posicaoDoMenor);
        scanner.close();
    
    }
 
}