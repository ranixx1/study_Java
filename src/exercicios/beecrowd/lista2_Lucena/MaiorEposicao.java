import java.util.Scanner;

public class MaiorEposicao {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int maiorValor = 0;
        int posicaoMaior = 0;

        for (int i = 1; i <= 100; i++) {
            int valorAtual = scanner.nextInt();

            if (valorAtual > maiorValor) {
                maiorValor = valorAtual;
                posicaoMaior = i;
            }
        }

        System.out.println(maiorValor);
        System.out.println(posicaoMaior);

        scanner.close();
    }
}