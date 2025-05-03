//projeto: criar um sistema de login e cadastro que peça pra pedir promoção
package lista1;

import java.util.HashMap;
import java.util.Scanner;

public class Question16 {
    // Armazena usuários registrados (username -> UserData)
    private static HashMap<String, UserData> users = new HashMap<>();
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        
        // Loop principal para manter o programa rodando
        while (true) {
            System.out.println("\n=== MENU PRINCIPAL ===");
            System.out.println("1- LOGIN");
            System.out.println("2- REGISTRAR");
            System.out.println("3- SAIR");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer

            switch (opcao) {
                case 1:
                    login(scanner);
                    break;
                case 2:
                    registrar(scanner);
                    break;
                case 3:
                    System.out.println("Até logo!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    private static void login(Scanner scanner) {
        System.out.print("\nUsername: ");
        String username = scanner.nextLine();
        
        System.out.print("Senha: ");
        int senha = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer

        // Validação de login
        if (users.containsKey(username) && users.get(username).senha == senha) {
            UserData user = users.get(username);
            System.out.println("\nBem-vindo, " + user.nome + "! ");
            
            // Menu do usuário logado
            while (true) {
                System.out.println("\n=== MENU DO USUÁRIO ===");
                System.out.println("1- SOLICITAR PROMOÇÃO");
                System.out.println("2- EXCLUIR CONTA");
                System.out.println("3- VER STATUS DA CONTA");
                System.out.println("4- VOLTAR AO MENU PRINCIPAL");
                System.out.print("Escolha: ");
                
                int escolha = scanner.nextInt();
                scanner.nextLine();

                switch (escolha) {
                    case 1:
                        user.solicitacaoPendente = true;
                        System.out.println(" Solicitação enviada para análise!");
                        break;
                    case 2:
                        users.remove(username);
                        System.out.println("Conta excluída com sucesso!");
                        return;
                    case 3:
                        System.out.println("\n=== STATUS DA CONTA ===");
                        System.out.println("Nome: " + user.nome);
                        System.out.println("Idade: " + user.idade);
                        System.out.println("Promoção solicitada: " + 
                            (user.solicitacaoPendente ? "SIM" : "NÃO"));
                        break;
                    case 4:
                        return;
                    default:
                        System.out.println("Opção inválida! ");
                }
            }
        } else {
            System.out.println("Credenciais inválidas!");
        }
    }

    private static void registrar(Scanner scanner) {
        System.out.println("\n=== NOVO CADASTRO ===");
        
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        
        System.out.print("Idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer
        
        // Valida username único
        String username;
        while (true) {
            System.out.print("Username: ");
            username = scanner.nextLine();
            if (!users.containsKey(username)) break;
            System.out.println("Username já existe! ");
        }
        
        System.out.print("Senha (6 dígitos): ");
        int senha = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer
        
        // Cria novo usuário
        users.put(username, new UserData(nome, idade, senha));
        System.out.println("\nCadastro realizado com sucesso! ");
    }

    // Classe para armazenar dados do usuário
    static class UserData {
        String nome;
        int idade;
        int senha;
        boolean solicitacaoPendente;

        public UserData(String nome, int idade, int senha) {
            this.nome = nome;
            this.idade = idade;
            this.senha = senha;
            this.solicitacaoPendente = false;
        }
    }
}