package poo.prova.q2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Forma> formas = new ArrayList<>();

        for (int i = 0; i < 3; i++) { // 3 vezes
            System.out.print("Digite o tipo da forma (C para círculo, R para retângulo): ");
            char tipo = sc.next().toUpperCase().charAt(0);

            if (tipo == 'C') {
                System.out.print("Digite o raio: ");
                double raio = sc.nextDouble();
                formas.add(new Circulo(raio));

            } else if (tipo == 'R') {
                System.out.print("Digite largura e altura: ");
                double largura = sc.nextDouble();
                double altura = sc.nextDouble();
                formas.add(new Retangulo(largura, altura));

            } else {
                System.out.println("Tipo inválido!");
                i--;
            }
        }

        double areaTotal = 0;
        double perimetroTotal = 0;

        for (Forma f : formas) {
            areaTotal += f.area();
            perimetroTotal += f.perimetro();
        }

        System.out.printf("\nÁrea total = %.2f\n", areaTotal);
        System.out.printf("Perímetro total = %.2f\n\n", perimetroTotal);

        // listar em ordem crescente de área
        Collections.sort(formas, Comparator.comparingDouble(Forma::area));

        System.out.println("Lista de formas:");
        for (Forma f : formas) {
            System.out.println(f);
        }

        sc.close();
    }
}
