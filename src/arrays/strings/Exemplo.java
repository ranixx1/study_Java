package arrays.strings;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Exemplo {

    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite nomes (ou 'sair' para finalizar):");

        while (true) {
            String nome = sc.nextLine();

            if (nome.equalsIgnoreCase("sair")) {
                break;
            }

            nomes.add(nome);
        }

        System.out.println("\nNomes cadastrados:");
        for (String n : nomes) {
            System.out.println(n);
        }

        System.out.println("\nTotal de nomes: " + nomes.size());

        sc.close();
    }
}
