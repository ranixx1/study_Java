import java.util.Scanner;

public class EntradaUsuarioJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Cria o objeto Scanner

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine(); // Lê uma linha (String)

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt(); // Lê um número inteiro

        System.out.println("Olá, " + nome + "! Você tem " + idade + " anos.");

        scanner.close(); 
    }
}

