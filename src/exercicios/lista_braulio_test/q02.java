//Faça um programa que solicite ao usuário um número para ser a referência e outro para ser a quantidade de valores a ser impresso no caso do programa da Q1. Para a mesma resposta, por exemplo, o usuário forneceria a referência 3 e a quantidade 10.
package exercicios.lista_braulio_test;
import java.util.Scanner;
public class q02 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int referencia = scanner.nextInt();
        int valor=referencia;
        int qtd_valores = scanner.nextInt();
        for(int i =1;i<=qtd_valores;i++){
            System.out.println(valor);
            valor += referencia;
        }
        scanner.close();

    }
    
}
