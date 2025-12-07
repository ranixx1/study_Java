package poo.lista2.playlist;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Playlist playlist = new Playlist();

        int opcao;

        do {
            System.out.println("\n===== MENU PLAYLIST =====");
            System.out.println("1 - Inserir música");
            System.out.println("2 - Excluir música");
            System.out.println("3 - Listar playlist");
            System.out.println("4 - Tempo total");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine(); // limpar buffer

            switch (opcao) {
                case 1:
                    System.out.print("Nome da música: ");
                    String nome = sc.nextLine();

                    System.out.print("Artista: ");
                    String artista = sc.nextLine();

                    System.out.print("Duração em segundos: ");
                    int duracao = sc.nextInt();
                    sc.nextLine();

                    playlist.inserir(new Musica(nome, artista, duracao));
                    break;

                case 2:
                    System.out.print("Nome da música a remover: ");
                    String nomeRemover = sc.nextLine();
                    playlist.excluir(nomeRemover);
                    break;

                case 3:
                    playlist.listar();
                    break;

                case 4:
                    int total = playlist.tempoTotal();
                    System.out.println("Tempo total: " + (total / 60) + "m " + (total % 60) + "s");
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        sc.close();
    }
}
