package poo.lista1;

import java.util.Scanner;

public class Disciplina {
    private String name;
    private double notaBim1;
    private double notaBim2;
    private double notaFinal;

    public Disciplina(String name, double notaBim1, double notaBim2, double notaFinal) {
        this.name = name;
        this.notaBim1 = notaBim1;
        this.notaBim2 = notaBim2;
        this.notaFinal = notaFinal;
    }

    public void CalcularMedia(double notaBim1, double notaBim2) {
        double peso1 = 2.0;
        double peso2 = 3.0;
        double media = (notaBim1 * peso1 + notaBim2 * peso2) / (peso1 + peso2);
        if (media < 50) {
            System.out.println("Média: " + media);
            System.out.println("Reprovado");
        } else if (media >= 60) {
            System.out.println("Média: " + media);
            System.out.println("Aprovado");
        } else {
            if (notaFinal + media >= 60) {
                System.out.println("Média: " + media);
                System.out.println("Aprovado");
            } else {
                System.out.println("Média: " + media);
                System.out.println("Reprovado");

            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Disciplina matematica = new Disciplina("Matemática", 7.6, 7.5, 0);
        matematica.CalcularMedia(75.3, 45.0);
        sc.close();
    }

}
