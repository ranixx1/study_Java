package miniprojetos;
//TREINO DE ESTRUTURAS DE REPETIÇÃO E INPUT
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo à minha calculadora Java");

        System.out.print("Digite um número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite outro número: ");
        int numero2 = scanner.nextInt();

        System.out.println("Escolha a operação:");
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.print("Opção: ");
        int operacao = scanner.nextInt();

        switch (operacao) {
            case 1:
                System.out.println("Resultado: " + (numero1 + numero2));
                break;
            case 2:
                System.out.println("Resultado: " + (numero1 - numero2));
                break;
            case 3:
                System.out.println("Resultado: " + (numero1 * numero2));
                break;
            case 4:
                if (numero2 != 0) {
                    System.out.println("Resultado: " + (numero1 / numero2));
                } else {
                    System.out.println("Erro: divisão por zero");
                }
                break;
            default:
                System.out.println("Operação inválida.");
        }

        scanner.close();
    }
}
