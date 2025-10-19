//Faça um programa que leia do usuário um intervalo fechado e imprima os números pares desse intervalo (inclusive os limites).
package exercicios.lista_braulio_test;
import java.util.Scanner;
public class q04 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int inicio = scanner.nextInt();
        int fim = scanner.nextInt();
        for(int i = inicio;i<=fim;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
        scanner.close();
    }
}
