package miniprojetos;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Chamado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> chamados = new ArrayList<>();

       
        while (true) {
            System.out.println("\n1-Abrir chamado");
            System.out.println("2- Meus chamados ");
            System.out.println("3- Sair");
            System.out.println("Escolha uma opção:");
            int opcao = scanner.nextInt();
            scanner.nextLine();
            if (opcao == 1) {
                System.out.println("----------------------");
                System.out.println("Setor:");
                String setor = scanner.nextLine();
                System.out.println("Motivo:");
                String motivo = scanner.nextLine();
                System.out.println("Observações:");
                String observacoes = scanner.nextLine();
                System.out.println("----------------------");

                //Salvar chamado
                String chamado = "Setor:" + setor + "\nMotivo:" + motivo +"\nOservações:" + observacoes;
                chamados.add(chamado);
                System.out.println("Chamado aberto com sucesso!;");
            } else if (opcao == 2){
                System.out.println("\n --- Meus Chamados---");
                if (chamados.isEmpty()){
                    System.out.println("Nenhum chamado aberto.");
                } else {
                    for (int i =0; i<chamados.size();i++){
                        System.out.println("Chamado #" + (i+1));
                        System.out.println(chamados.get(i));
                        System.out.println("----------------------");
                    }
                }
            }
            else if (opcao == 3) {
                System.out.println("Encerrando o sistema.");
                break;
            }else{
                System.out.println("Opção Inválida");
            }
        }

        scanner.close();

    }

}
