package exercicios.beecrowd.vetores;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class ListaPapaiNoel{

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        
        ArrayList<String> listaNomes = new ArrayList<>();
        int comportaramBem = 0;
        int naoComportaram = 0;

        for (int i = 0; i < N; i++) {
            String sinal = scanner.next();
            
            String nome = scanner.next();
            
            listaNomes.add(nome);
            
            if (sinal.equals("+")) {
                comportaramBem++;
            } else if (sinal.equals("-")) {
                naoComportaram++;
            }
        }
        
        scanner.close();

        Collections.sort(listaNomes);

        for (String nome : listaNomes) {
            System.out.println(nome);
        }

        System.out.printf("Se comportaram: %d | Nao se comportaram: %d\n", comportaramBem, naoComportaram);
    }
}