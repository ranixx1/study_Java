package exercicios.lista1;
import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalAlunos;
        int aprovados = 0;
        int reprovados = 0;
        int recuperacao = 0;

        float maiorMedia = 0; //0 pq não existe média negativa
        float menorMedia = 100; //100 pq não existe média maior que 100
        System.out.print("Quantos alunos deseja cadastrar? ");
        totalAlunos = scanner.nextInt();

        for (int i = 0; i < totalAlunos; i++) {
            System.out.println("\nDigite o nome do aluno:");
            String nome = scanner.next();

            float soma = 0;

            for (int j = 1; j <= 4; j++) {
                System.out.print("Digite a " + j + "ª nota: ");
                float nota = scanner.nextFloat();
                soma += nota;
            }

            float media = soma / 4;

            System.out.println("Média do aluno " + nome + ": " + media);

            if (media >= 7) {
                System.out.println("Resultado: Aprovado!");
                aprovados++; // aprovados ++ adiciona 1 ao contador de aprovados
            } else if (media >= 5) {
                System.out.println("Resultado: Recuperação!");
                recuperacao++; //recuperacao ++ adiciona 1 ao contador de recuperação
            } else {
                System.out.println("Resultado: Reprovado!");
                reprovados++; //reprovados ++ adiciona 1 ao contador de reprovados
            }

            if (media > maiorMedia) {
                maiorMedia = media;
            }

            if (media < menorMedia) {
                menorMedia = media;
            }
        }

        // Relatório final
        System.out.println("\n===== Relatório Final =====");
        System.out.println("Total de alunos: " + totalAlunos);
        System.out.println("Aprovados: " + aprovados);
        System.out.println("Recuperação: " + recuperacao);
        System.out.println("Reprovados: " + reprovados);
        System.out.println("Maior média: " + maiorMedia);
        System.out.println("Menor média: " + menorMedia);

        scanner.close();
    }
}
